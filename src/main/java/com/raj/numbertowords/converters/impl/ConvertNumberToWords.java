package com.raj.numbertowords.converters.impl;

import com.raj.numbertowords.converters.IConvertNumberToWords;

import java.util.regex.Pattern;

import static com.raj.numbertowords.utils.StringConstants.BIG_NAMES;

/**
 * This class converts an integer number into words (British english).
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */
public class ConvertNumberToWords implements IConvertNumberToWords {
    /**
     * This method take integer number and will return words in British english
     * @param num This is the parameter to convertNumberToWords method
     * @return String This returns words in British english
     */
    @Override
    public StringBuilder convertNumberToWords(int num) throws ArrayIndexOutOfBoundsException{
        StringBuilder word = null;
        StringBuilder s2 = new StringBuilder();
        int t = 0;
        IConvertNumberToWords.super.logConvertNumberToWords();
            if (num < 0) {
                try {
                    return new StringBuilder("minus ").append(convertNumberToWords(-num));
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("handle ArrayIndexOutOfBoundsException");
                }

            }
            if (num <= 999) {
                try {
                    return new ConvertDigits().convertThreeDigit(num);
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("handle ArrayIndexOutOfBoundsException");
                }
            }
            while (num > 0) {
                if (num % 1000 != 0) {
                    try {
                        s2 = new ConvertDigits().convertThreeDigit(num % 1000);
                    }
                        catch(ArrayIndexOutOfBoundsException e){
                            System.out.println("handle ArrayIndexOutOfBoundsException");
                        }
                        if (t > 0) {
                            s2 = s2.append(" ").append(BIG_NAMES[t - 1]);
                        }
                        if (word == null) {
                            word = s2;
                        } else {
                            word = s2.append(", ").append(word);
                        }
                }
                num /= 1000;
                t++;
            }
            return word;
       // }/*catch(Exception e){
         //   throw e;
        //}
    }
    /**
     * This method take input from console and will return boolean value for is valid input or not
     * @param input This is the parameter to inputIsValid method
     * @return boolean This returns true or false
     */
    @Override
    public boolean inputIsValid(String input) throws Exception{
        IConvertNumberToWords.super.logInputIsValid();
        boolean isValidInput;
        if(input!= null && Pattern.matches("[0-9]+", input)) {
            isValidInput= valueIsWithinRange(Integer.parseInt(input));
            return isValidInput;
        }else{
            return false;
        }
    }
    /**
     * This method take integer number and will return boolean value for is number in range or not
     * @param number This is the parameter to valueIsWithinRange method
     * @return boolean This returns true or false
     */
    public boolean valueIsWithinRange(int number) throws Exception{
          return number >= 0 && number <= 1000000000;
    }
}
