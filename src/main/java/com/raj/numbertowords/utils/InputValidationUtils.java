package com.raj.numbertowords.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * This Util class to validate user inputs
 *
 * @author Raj
 * @version 1.0
 * @since 2018-07-02
 */
public class InputValidationUtils {
    /**
     * This method take input from user and will return boolean value for is valid input or not
     *
     * @param input This is the parameter to inputIsValid method
     * @return boolean This returns true or false
     */

    public static boolean inputIsValid(String input) {
        return input != null && Pattern.matches("[0-9]+", input);
    }

    /**
     * This method take integer number and will return boolean value for is number in range or not
     *
     * @param number This is the parameter to valueIsWithinRange method
     * @return boolean This returns true or false
     */
    public static boolean valueIsWithinRange(int number) {
        boolean isValidRange = false;
        try {
            Properties properties = new ReadPropertiesFileUtils().loadProperties("config.properties");
            if (number >= Integer.parseInt(properties.get("number_min_range").toString()) &&
                    number <= Integer.parseInt(properties.get("number_max_range").toString())) {
                isValidRange = true;
            }
        } catch (IOException exp) {
            System.out.println("config file missing in a path");
        }
        return isValidRange;
    }
}
