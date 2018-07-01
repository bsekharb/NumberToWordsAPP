package com.raj.numbertowords.converters.impl;

import com.raj.numbertowords.converters.IConvertDigits;

import static com.raj.numbertowords.utils.StringConstants.LOW_NAMES;
import static com.raj.numbertowords.utils.StringConstants.TEN_NAMES;

/**
 * This class converts an integer number into words (British english).
 * Number range between 0 to 999
 *
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */
public class ConvertDigits implements IConvertDigits {
    /**
     * This method take integer number and will return words in British english
     * number range between 0 to 999
     *
     * @param num This is the parameter to convertThreeDigit in  method
     * @return StringBuilder This returns words in British english
     */
    @Override
    public StringBuilder convertThreeDigit(int num) throws ArrayIndexOutOfBoundsException {
        IConvertDigits.logThreeDigits();
        StringBuilder s1 = new StringBuilder(LOW_NAMES[num / 100]).append(" hundred");
        StringBuilder s2 = new StringBuilder(convertTwoDigit(num % 100));
        if (num <= 99) {
            return s2;
        } else if (num % 100 == 0) {
            return s1;
        } else {
            return s1.append(" ").append(s2);
        }

        }

    /**
     * This method take integer number and will return words in British english
     * number range between 0 to 99
     *
     * @param num This is the parameter to convertTwoDigit in  method
     * @return StringBuilder This returns words in British english
     */
    @Override
    public StringBuilder convertTwoDigit(int num) throws ArrayIndexOutOfBoundsException{
        IConvertDigits.logTwoDigits();
        if (num < 20) {
            return new StringBuilder(LOW_NAMES[num]);
        }
        StringBuilder s = new StringBuilder(TEN_NAMES[num / 10 - 2]);
        if (num % 10 == 0) {
            return new StringBuilder(s);
        }
        return s.append("-").append(LOW_NAMES[num % 10]);
    }
}



