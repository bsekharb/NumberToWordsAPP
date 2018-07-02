package com.raj.numbertowords;

import com.raj.numbertowords.converters.impl.ConvertNumberToWords;
import com.raj.numbertowords.utils.InputValidationUtils;

import java.util.Scanner;

/**
 * This class converts an integer number into words (British english).
 *
 * @author Raj
 * @version 1.1
 * @since 2018-06-29
 */
public class NumberToWordsApp {

    public static void main(String a[]) {
        ConvertNumberToWords convertNumberToWords = new ConvertNumberToWords();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println();
                System.out.println("Enter number less than 1 billion:");
                String input = scanner.next();
                boolean isValid = InputValidationUtils.inputIsValid(input) &&
                        InputValidationUtils.valueIsWithinRange(Integer.parseInt(input));
                if (isValid) {
                    System.out.println();
                    System.out.println("Result ::");
                    System.out.println(input + " = " + convertNumberToWords.convertNumberToWords(Integer.parseInt(input)));
                } else {
                    System.out.println("Your Input Is Wrong. Please Enter A Valid Input Again.");
                    main(a);
                }
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exp) {
            System.out.println("error occur while running app.Please try again with valid input.");
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception Occur while execute NumberToWordsApp and Please try again with valid input." + e);
            main(a);
        }
    }
}


