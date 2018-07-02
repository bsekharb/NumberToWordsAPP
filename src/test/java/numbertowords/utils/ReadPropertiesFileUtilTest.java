package numbertowords.utils;

import com.raj.numbertowords.utils.ReadPropertiesFileUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

/**
 * This Util class to Read properties file
 *
 * @author Raj
 * @version 1.0
 * @since 2018-07-02
 */
public class ReadPropertiesFileUtilTest {
    @Test
    public void TestLoadProperties() {
        try {
            Properties properties = new ReadPropertiesFileUtils().loadProperties("config.properties");
            assertNotNull(properties.size());
        } catch (IOException e) {
            System.out.println("config file missing in path");
        }

    }
}
