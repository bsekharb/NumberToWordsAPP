package numbertowords.utils;

import com.raj.numbertowords.utils.StringConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * This class converts an integer number into words (British english).
 *
 * @author Raj
 * @version 1.0
 * @since 2018-06-30
 */
public class StringConstantsTest {

    @Test
    public void test_low_name_index0_array() {
        String word = StringConstants.LOW_NAMES[0];
        assertEquals("zero", word);
    }

    @Test
    public void test_low_name_index13_array() {
        String word = StringConstants.LOW_NAMES[13];
        assertEquals("thirteen", word);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negative_test_low_name_array() {
        String word = StringConstants.LOW_NAMES[20];
        assertEquals("twenty", word);
    }

    @Test
    public void test_ten_names_index_1_array() {
        String word = StringConstants.TEN_NAMES[1];
        assertEquals("thirty", word);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negative_test_ten_names_array() {
        String word = StringConstants.TEN_NAMES[8];
        assertEquals("thousand", word);
        fail();
    }

    @Test
    public void test_big_names_index_0_array() {
        String word = StringConstants.BIG_NAMES[0];
        assertEquals("thousand", word);
    }

    @Test
    public void test_big_names_index_1_array() {
        String word = StringConstants.BIG_NAMES[1];
        assertEquals("million", word);
    }

    @Test
    public void test_big_names_index_2_array() {
        String word = StringConstants.BIG_NAMES[2];
        assertEquals("billion", word);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negative_test_big_names_array() {
        String word = StringConstants.BIG_NAMES[3];
        assertEquals("ten billion", word);
        fail();
    }

}

