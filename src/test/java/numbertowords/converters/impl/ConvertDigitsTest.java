package numbertowords.converters.impl;

import com.raj.numbertowords.converters.impl.ConvertDigits;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

/**
 * This class is Junit test for ConvertDigits class.
 * Number range between 0 to 999
 *
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */

public class ConvertDigitsTest {
    ConvertDigits convertDigits;

    @Before
    public void setUp() throws Exception {

        convertDigits = new ConvertDigits();
    }

    @Test
    public void testConvertThreeDigit() {
        String result = convertDigits.convertThreeDigit(1000).toString();
        assertNotSame("one thousand", result);
    }

    @Test
    public void number_in_one_digit() {
        String result = convertDigits.convertThreeDigit(1).toString();
        assertEquals("one", result);
    }

    @Test
    public void number_in_two_digit() {
        String result = convertDigits.convertThreeDigit(99).toString();
        assertEquals("ninety-nine", result);
    }

    @Test
    public void number_in_four_digit() {
        String result = convertDigits.convertThreeDigit(999).toString();
        assertEquals("nine hundred ninety-nine", result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negative_test_convert_two_digit() {
        String result = convertDigits.convertTwoDigit(1000).toString();
        assertEquals("one thousand", result);
        fail();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void number_in_three_digit_convertTwoDigit() {
        String result = convertDigits.convertTwoDigit(999).toString();
        assertEquals("nine hundred ninety-nine", result);
        fail();
    }

    @Test
    public void number_in_one_digit_convertTwoDigit() {
        String result = convertDigits.convertTwoDigit(1).toString();
        assertEquals("one", result);
    }

    @Test
    public void number_in_two_digit_convertTwoDigit() {
        String result = convertDigits.convertTwoDigit(99).toString();
        assertEquals("ninety-nine", result);
    }


    @After
    public void tearDown() throws Exception {
        convertDigits = null;
    }

}



