package com.raj.numbertowords;

import com.raj.numbertowords.converters.impl.ConvertNumberToWords;

import java.util.Scanner;

/**
 * This class converts an integer number into words (British english).
 *
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */
public class NumberToWordsApp {

    public static void main(String a[]) {
        ConvertNumberToWords convertNumberToWords = new ConvertNumberToWords();

        boolean isValid = false;
        try (Scanner scanner = new Scanner(System.in)){
            while (true) {
                System.out.println();
                System.out.println("Enter number less than 1 billion:");
                String input = scanner.next();
                try {
                     isValid = convertNumberToWords.inputIsValid(input);
                }catch(Exception e){
                    System.out.println("Number too high ..");
                }
                if (isValid) {
                    System.out.println();
                    System.out.println("Result ::");
                    try {
                        System.out.println(input + " = " + convertNumberToWords.convertNumberToWords(Integer.parseInt(input)));
                    }catch(Exception e){
                        System.out.println("Handle Exception");
                    }
                } else {
                    System.out.println("Your Input Is Wrong. Please Enter A Valid Input Again.");
                    main(a);
                }
            }

        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception Occur while execute NumberToWordsApp and Please try again with valid input." + e);
            main(a);
        } finally {
            System.out.println("Ending NumberToWordsApp");
        }
    }
}


