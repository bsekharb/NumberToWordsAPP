package com.raj.numbertowords.converters;

/**
 * This interface specification for converts an integer number into words (British english).
 * number range between 0 to 1 billion
 *
 * @author Raj
 * @version 1.1
 * @since 2018-06-29
 */
public interface IConvertNumberToWords {
    StringBuilder convertNumberToWords(int num);

    default void logConvertNumberToWords() {
        System.out.println("Calling convertNumberToWords method");
    }

}