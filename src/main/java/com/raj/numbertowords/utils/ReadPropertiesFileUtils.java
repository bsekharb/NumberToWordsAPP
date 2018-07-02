package com.raj.numbertowords.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Load properties from either absolute path or resource as stream .
 *
 * @author Raj
 * @version 1.0
 * @since 2018-07-02
 */

public class ReadPropertiesFileUtils {
    /**
     *  * Load properties.
     *  *
     *  * @param propertiesFile
     *  *            path to properties file
     *  * @return filled in properties object
     *  * @throws IOException
     *  *             if something goes wrong
     *  
     */
    public Properties loadProperties(final String propertiesFile) throws IOException {
        Properties properties = new Properties();
        // If file exists as an absolute path, load as input stream.
        final Path path = Paths.get(propertiesFile);
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            properties.load(new FileInputStream(propertiesFile));
        } else {
            // Otherwise, use resource as stream.
            properties.load(getClass().getClassLoader().getResourceAsStream(
                    propertiesFile));
        }
        return properties;
    }
}
