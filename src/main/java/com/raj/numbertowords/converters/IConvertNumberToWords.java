package com.raj.numbertowords.converters;

/**
 * This interface specification for converts an integer number into words (British english).
 * number range between 0 to 1 billion
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */
public interface IConvertNumberToWords {
    StringBuilder convertNumberToWords(int num);
    boolean inputIsValid(String input)throws Exception;
    default void logConvertNumberToWords(){
        System.out.println("Calling convertNumberToWords method");
    }
    default void logInputIsValid(){
        System.out.println("Calling inputIsValid method");
    }
}
