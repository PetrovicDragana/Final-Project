package humanityProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import humanityProject.HumanityLogin;
import humanityProject.HumanityMenu;

public class HumanityMenuTest {
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
	public void testHumanityMenuTest() {
		
		driver.navigate().to(HumanityMenu.DASHBOARD_URL);
		SoftAssert sa = new SoftAssert();
		
		HumanityMenu.clickDashboardButton(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.DASHBOARD_TITLE);
		
		HumanityMenu.clickShiftPlaning(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.SHIFT_PLANNING_TITLE);
		
		HumanityMenu.clickTimeClock(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.TIME_CLOCK_TITLE);
		
		HumanityMenu.clickLeave(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.LEAVE_TITLE);
		
		HumanityMenu.clickTraining(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.TRAINING_TITLE);
		
		HumanityMenu.clickStaff(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.STAFF_TITLE);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		HumanityMenu.clickAvailability(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.AVAILABILITY_TITLE);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		HumanityMenu.clickPayroll(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.PAYROLL_TITLE);
		
		HumanityMenu.clickReports(driver);
		sa.assertEquals(driver.getTitle(),HumanityMenu.REPORTS_TITLE);		
				
		
	}
	}
