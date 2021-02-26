package humanityProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.AddStaff;
import humanityProject.HumanityLogin;
import humanityProject.HumanityMenu;

public class AddStaffTest {
WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marko\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
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
	public void addStaff() throws InterruptedException {
		driver.navigate().to(HumanityMenu.DASHBOARD_URL);
		HumanityMenu.clickStaff(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AddStaff.clickAddEmplpyees(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AddStaff.inputFirstName(driver, "Gaga");
		AddStaff.inputLastName(driver, "Tutu");
		AddStaff.inputEmail(driver, AddStaff.newEmail());
		AddStaff.clickSaveEmploye(driver);
		
		HumanityMenu.clickStaff(driver);
		
Thread.sleep(500);
		
		WebElement wb1 = driver.findElement(By.id("_status"));
		Assert.assertTrue(wb1.isDisplayed());
		
		
	}
}
