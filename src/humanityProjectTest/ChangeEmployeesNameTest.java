package humanityProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.AddStaff;
import humanityProject.ChangeEmployeesName;
import humanityProject.HumanityLogin;
import humanityProject.HumanityMenu;

public class ChangeEmployeesNameTest {
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual =  driver.getCurrentUrl();
		String expected = "https://lalalalic.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 2)
	public void ChangeEployeesName() {
		driver.navigate().to(HumanityMenu.DASHBOARD_URL);
		HumanityMenu.clickStaff(driver);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ChangeEmployeesName.clickEmploye(driver); //employee
		ChangeEmployeesName.clickEditEmploye(driver);
		String actual1 = driver.findElement(By.id("first_name")).getAttribute("value");
		System.out.println("Vrednost a1 = " + actual1);
		ChangeEmployeesName.clearEmployeName(driver);
		
		ChangeEmployeesName.inputNewEmployeName(driver, ChangeEmployeesName.randomName());
	
	String actual2 = driver.findElement(By.id("first_name")).getAttribute("value");
	System.out.println("Vrednost a2 = " + actual2);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	WebElement body = driver.findElement(By.xpath("//*[@id=\"_fbody\"]"));
	body.sendKeys(Keys.PAGE_DOWN);
	ChangeEmployeesName.cklicCancelAnn(driver);
	ChangeEmployeesName.clickSaveEmploye(driver);
	driver.navigate().refresh();

	
	
    Assert.assertNotEquals(actual1, actual2);
	}
}