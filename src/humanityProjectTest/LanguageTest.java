package humanityProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.HumanityLogin;
import humanityProject.Language;

public class LanguageTest {
	WebDriver driver;
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marko\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void testLogin() {
		driver.navigate().to(HumanityLogin.URL);
		driver.manage().window().maximize();
		HumanityLogin.cancelAnnouncement(driver);
		HumanityLogin.clickLogin(driver);
		HumanityLogin.inputEmail(driver, "lalalalic@gmail.com");
		HumanityLogin.inputPassword(driver, "lalalalic3");
		HumanityLogin.clickLoginButton(driver);
		
	
		Language.clickSettings(driver);
		
		
		WebElement lng = driver.findElement(By.xpath(Language.LNG_XPATH));
		lng.click();
		
		for(int i = 0; i < 6; i++) {		
		lng.sendKeys(Keys.ARROW_DOWN);
		}
		
		lng.sendKeys(Keys.ENTER);
		Language.clickLanguage(driver);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		String actual = driver.findElement(By.xpath(Language.LEAVE_XPATH)).getText();
		String expected = "Odmor";
		Assert.assertEquals(actual, expected);
		System.out.println("Vrednost a1 = " + actual);
		
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		
		WebElement lng2 = driver.findElement(By.xpath(Language.LNG2_XPATH));
		lng2.click();
		for(int i = 0; i < 6; i++) {		
			lng2.sendKeys(Keys.ARROW_DOWN);
			}
		
		lng2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Language.SAVE_XPATH)).click();
		driver.navigate().refresh();
			
	}
	
	@Test (priority = 2)
	public void testDisableNotifications() {
		Language.clickEmailNotif(driver);
		Language.clickSmsNotif(driver);
		Language.clickMobile(driver);
		Language.clickSave(driver);
		
		driver.navigate().refresh();
		
		WebElement checkbox = driver.findElement(By.id("pref_pref_email"));
		boolean actual = checkbox.isSelected();
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		Assert.assertEquals(actual, true);
		
		Language.clickEmailNotif(driver);
		Language.clickSmsNotif(driver);
		Language.clickMobile(driver);
		
		Language.pageDown(driver);
		Language.clickSave(driver);
		driver.navigate().refresh();
		
	}
	
	
}

