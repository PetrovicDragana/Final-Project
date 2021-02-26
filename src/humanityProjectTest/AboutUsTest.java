package humanityProjectTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.AboutUs;
import humanityProject.HumanityLogin;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AboutUsTest {
	
WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marko\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void screenshotAboutUS() {
		driver.navigate().to(HumanityLogin.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HumanityLogin.cancelAnnouncement(driver);
        AboutUs.clickAboutUs(driver);
        AboutUs.choseLinkAboutUs(driver);
        
        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(),"PNG",new File("AboutUsSreenshot.png"));
        } catch (IOException e) {
        	System.out.println("Error Screenshot not taken");
            e.printStackTrace();
        }
         String actual = driver.getCurrentUrl();
         String expected = AboutUs.URL_ABOUTUS;
         
        driver.quit();
        
    }
}
