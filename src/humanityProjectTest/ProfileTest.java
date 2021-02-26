package humanityProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.HumanityLogin;
import humanityProject.Profile;

public class ProfileTest {
	WebDriver driver;
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marko\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void testProfile() {
		driver.navigate().to(HumanityLogin.URL);
		driver.manage().window().maximize();
		HumanityLogin.cancelAnnouncement(driver);
		HumanityLogin.clickLogin(driver);
		HumanityLogin.inputEmail(driver, "lalalalic@gmail.com");
		HumanityLogin.inputPassword(driver, "lalalalic3");
		HumanityLogin.clickLoginButton(driver);
		
		driver.navigate().to(Profile.PROFILE_URL);
		Profile.clickEditEmploye(driver);
		Profile.insertNickName(driver, "Lalita");
		String actual2 = driver.findElement(By.xpath(Profile.NICKNAME_XPATH)).getAttribute("value");
		Profile.clickSave(driver);
		driver.navigate().refresh();
		
		String actual1 = null;
		Assert.assertNotEquals(actual1, actual2);
		
	}
	
	@Test (priority = 2)
	public void testProfile2() {
		driver.navigate().to(Profile.PROFILE_URL);
		Profile.clickEditEmploye(driver);
		Profile.insertEmployeID(driver, "id123");
		String actual3 = driver.findElement(By.xpath(Profile.EMPLOYEID_XPATH)).getAttribute("value");
		Profile.clickSave(driver);
		driver.navigate().refresh();
		String actual4 = null;
		
		Assert.assertNotEquals(actual3, actual4);
	}
}
