package humanityProjectTest;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import humanityProject.HumanityLogin;



public class HumanityLoginTest {
WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marko\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void testCreateAccount1() {
		driver.navigate().to(HumanityLogin.URL);
		driver.manage().window().maximize();
		HumanityLogin.cancelAnnouncement(driver);
		HumanityLogin.inputFullName(driver, "Dragana Gaga");
		HumanityLogin.inputWorkEmail(driver, HumanityLogin.newEmail());
		HumanityLogin.clickButtonSMFT(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		String actual =  driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";
		Assert.assertEquals(actual, expected);
		
		
	
	}
		
	@Test (priority = 2)
		public void testCreateAccount2() {
		
			driver.navigate().to(HumanityLogin.URL);
			//driver.manage().window().maximize();
			HumanityLogin.clicHomeRightSMFT(driver);
			HumanityLogin.inputFullName2(driver, "Dragana Gaga");
			HumanityLogin.inputWorkEmail2(driver, HumanityLogin.newEmail());
			HumanityLogin.clicButtonSMFT2(driver);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String actual =  driver.getCurrentUrl();
			String expected = "https://www.humanity.com/wizard-setup2/";
			Assert.assertEquals(actual, expected);
			
		
	} 
	
	@Test (priority = 3)
	public void testLogin() {
		driver.navigate().to(HumanityLogin.URL);
		//driver.manage().window().maximize();
		//HumanityLogin.cancelAnnouncement(driver);
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
	@Test (priority = 4)
		public void StartSchedulingTodaytest() {
		
		driver.navigate().to(HumanityLogin.URL);	
		//driver.manage().window().maximize();
		//HumanityLogin.cancelAnnouncement(driver);
		HumanityLogin.inputFullName(driver, "Dragana Gaga");
		HumanityLogin.inputWorkEmail(driver, HumanityLogin.newEmail());
		HumanityLogin.clickButtonSMFT(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		WebElement company = driver.findElement(By.xpath(HumanityLogin.COMPANYNAME_XPATH));
		company.click();
		Random r = new Random();
		String compSuffix = "" + r.nextInt(10000);
		String comp = "Bel Bel" + compSuffix;
		company.sendKeys(comp);
		WebElement industry = driver.findElement(By.xpath(HumanityLogin.DROPDOWNMENU_INDUSTRY_XPATH));
		industry.click();
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ENTER);
		WebElement function = driver.findElement(By.xpath(HumanityLogin.DROPDOWNMENU_FUNCTIONALROLE_XPATH));
		function.sendKeys(Keys.ARROW_DOWN);
		function.sendKeys(Keys.ARROW_DOWN);
		function.sendKeys(Keys.ARROW_DOWN);
		function.sendKeys(Keys.ENTER);
		
		HumanityLogin.inputPhonNumber(driver, "1236489");
		HumanityLogin.inputCompanyPassword(driver, "dragana");
		HumanityLogin.inputREPassword(driver, "dragana");
		HumanityLogin.clickbuttonSTARTSchedulin(driver);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		String actual = driver.getCurrentUrl();
		String expected = "https://belbel" + compSuffix + ".humanity.com/app/schedule/?path=schedule";
		Assert.assertEquals(actual, expected);
	}
}


