package defaultpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

    public final Properties getProperties(String propFilePath) throws IOException {

        Properties prop = new Properties();
        try (InputStream inputStream = new FileInputStream(propFilePath)) {
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
