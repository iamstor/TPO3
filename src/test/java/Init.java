import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Init {
    private final Properties property = new Properties();
    private FileInputStream fileInputStream;
    private WebDriver driver;

    public Init() {
        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
            property.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebDriver initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/darastor/Downloads/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }


    public String getProperty(String name) {
        return property.getProperty(name);
    }
}
