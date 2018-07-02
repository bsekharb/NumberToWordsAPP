package com.raj.numbertowords.converters;

/**
 * This interface specification for converts an integer number into words (British english).
 * number range between 0 to 999
 *
 * @author Raj
 * @version 1.1
 * @since 2018-06-29
 */
public interface IConvertDigits {
    static void logThreeDigits() {
        System.out.println("Calling convertThreeDigit method");
    }

    static void logTwoDigits() {
        System.out.println("Calling convertTwoDigit method");
    }

    StringBuilder convertThreeDigit(int num);

    StringBuilder convertTwoDigit(int num);
}
