package numbertowords.utils;

import com.raj.numbertowords.utils.InputValidationUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is unit test cases for to validate user input
 *
 * @author Raj
 * @version 1.0
 * @since 2018-07-02
 */
public class InputValidationUtilsTest {


    @Test
    public void specialchar_input_is_valid_Test() throws Exception {
        boolean isValid = InputValidationUtils.inputIsValid("abx0123");
        assertFalse(isValid);
    }

    @Test
    public void null_input_is_valid_Test() throws Exception {
        assertFalse(InputValidationUtils.inputIsValid(null));
    }

    @Test
    public void empty_input_is_valid_Test() throws Exception {
        boolean isValid = InputValidationUtils.inputIsValid("");
        assertFalse(isValid);

    }


    @Test
    public void in_range_input_is_valid_Test() throws Exception {
        boolean isValid = InputValidationUtils.valueIsWithinRange(1000000);
        assertTrue(isValid);

    }

    @Test
    public void out_of_range_input_is_valid_Test() throws Exception {
        assertFalse(InputValidationUtils.valueIsWithinRange(2000000000));
        //fail("out of range");
    }

}