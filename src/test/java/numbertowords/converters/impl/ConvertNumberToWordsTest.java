package numbertowords.converters.impl;

import com.raj.numbertowords.converters.impl.ConvertNumberToWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class converts an integer number into words (British english).
 *
 * @author Raj
 * @version 1.0
 * @since 2018-06-29
 */
public class ConvertNumberToWordsTest {

    ConvertNumberToWords convertNumberToWords;

    @Before
    public void setUp() throws Exception {

        convertNumberToWords = new ConvertNumberToWords();
    }

    @Test
    public void number_in_one_digit() {
        String result = convertNumberToWords.convertNumberToWords(1).toString();
        assertEquals("one", result);
    }

    @Test
    public void number_in_two_digit() {
        String result = convertNumberToWords.convertNumberToWords(99).toString();
        assertEquals("ninety-nine", result);
    }

    @Test
    public void number_in_three_digit() {
        String result = convertNumberToWords.convertNumberToWords(999).toString();
        assertEquals("nine hundred and ninety-nine", result);
    }

    @Test
    public void number_in_four_digit() {
        String result = convertNumberToWords.convertNumberToWords(1000).toString();
        assertEquals("one thousand", result);
    }

    @Test
    public void number_in_five_digit() {
        String result = convertNumberToWords.convertNumberToWords(15000).toString();
        assertEquals("fifteen thousand", result);
    }

    @Test
    public void number_in_six_digit() {
        String result = convertNumberToWords.convertNumberToWords(160000).toString();
        assertEquals("one hundred and sixty thousand", result);
    }

    @Test
    public void number_in_seven_digit() {
        String result = convertNumberToWords.convertNumberToWords(1500098).toString();
        assertEquals("one million and five hundred thousand and ninety-eight", result);
    }

    @Test
    public void number_in_eight_digit() {
        String result = convertNumberToWords.convertNumberToWords(15080099).toString();
        assertEquals("fifteen million and eighty thousand and ninety-nine", result);
    }

    @Test
    public void number_in_nine_digit() {
        String result = convertNumberToWords.convertNumberToWords(150800969).toString();
        assertEquals("one hundred and fifty million and eight hundred thousand and nine hundred and sixty-nine", result);
    }

    @Test
    public void number_in_ten_digit() {
        String result = convertNumberToWords.convertNumberToWords(1508009697).toString();
        assertEquals("one billion and five hundred and eight million and nine thousand and six hundred and ninety-seven", result);
    }

    @After
    public void tearDown() throws Exception {
        convertNumberToWords = null;
    }
}
