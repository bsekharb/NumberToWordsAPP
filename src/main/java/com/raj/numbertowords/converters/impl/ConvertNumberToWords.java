package com.raj.numbertowords.converters.impl;

import com.raj.numbertowords.converters.IConvertNumberToWords;

import static com.raj.numbertowords.utils.StringConstants.BIG_NAMES;

/**
 * This class converts an integer number into words (British english).
 *
 * @author Raj
 * @version 1.1
 * @since 2018-06-29
 */
public class ConvertNumberToWords implements IConvertNumberToWords {
    /**
     * This method take integer number and will return words in British english
     *
     * @param num This is the parameter to convertNumberToWords method
     * @return String This returns words in British english
     */
    @Override
    public StringBuilder convertNumberToWords(int num) {
        StringBuilder word = null;
        int t = 0;
        IConvertNumberToWords.super.logConvertNumberToWords();
        if (num < 0) {
            return new StringBuilder("minus ").append(convertNumberToWords(-num));
        }
        if (num <= 999) {
            return new ConvertDigits().convertThreeDigit(num);
        }
        while (num > 0) {
            if (num % 1000 != 0) {
                StringBuilder s2 = new ConvertDigits().convertThreeDigit(num % 1000);
                if (t > 0) {
                    s2 = s2.append(" ").append(BIG_NAMES[t - 1]);
                }
                if (word == null) {
                    word = s2;
                } else {
                    word = s2.append(" and ").append(word);
                }
            }
            num /= 1000;
            t++;
        }
        return word;
    }
}
