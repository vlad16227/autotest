package startup.driverSettings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSettings {

    public ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        System.out.println("TEST START!!!!!!!!!!!!!!!");

    }




    @After
    public void close() throws InterruptedException {
        System.out.println("TEST COMPLITE !!!!!!!!!!!!!!");
              Thread.sleep(1000);

        driver.quit();
    }

}

