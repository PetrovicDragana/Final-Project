package humanityProject;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HumanityLogin {
	public static final String URL = "https://www.humanity.com/";
	public static final String LOGIN = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String CANCELANNOUNCEMENT_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORD_XPATH= "//*[@id=\"password\"]";
	public static final String LOGINBUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String FULLNAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String WORKEMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String BUTTON_SMFT_XPATH = "//*[@id=\"free-trial-link-01\"]";
	public static final String HOME_SMFTOPTION_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	public static final String FULLNAME_2_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	public static final String WORKEMAIL_2_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String BUTTONSMFT_2_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	public static final String COMPANYNAME_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	public static final String DROPDOWNMENU_INDUSTRY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	public static final String DROPDOWNMENU_FUNCTIONALROLE_XPATH = "/html/body/div/div/div/form/div[1]/div/div[3]/div/div/span";
	public static final String PHONNUMER_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	public static final String INPUTPASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	public static final String REPETPASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	public static final String STARTSCHEDULIN_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	public static void cancelAnnouncement (WebDriver driver) {
		driver.findElement(By.xpath(CANCELANNOUNCEMENT_XPATH)).click();
	}
	public static void clickLogin(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN)).click();
	}
	public static void inputEmail (WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(email);
	}
	public static String newEmail() {
		return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	}
	public static void inputPassword (WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
	}
	public static void clickLoginButton(WebDriver driver) {
		driver.findElement(By.xpath(LOGINBUTTON_XPATH)).click();
	}
	public static void inputFullName(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAME_XPATH)).sendKeys(fullname);
		}
	public static void inputWorkEmail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAIL_XPATH)).sendKeys(workemail);
		}
	public static void clickButtonSMFT (WebDriver driver) {
		driver.findElement(By.xpath(BUTTON_SMFT_XPATH)).click();
	}
	public static void clicHomeRightSMFT(WebDriver driver) {
		driver.findElement(By.xpath(HOME_SMFTOPTION_XPATH)).click();
	}
	public static void inputFullName2(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAME_2_XPATH)).sendKeys(fullname);
	}
	public static void inputWorkEmail2(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAIL_2_XPATH)).sendKeys(workemail);
	}
	public static void clicButtonSMFT2(WebDriver driver) {
		driver.findElement(By.xpath(BUTTONSMFT_2_XPATH)).click();
	}
	public static void inputCompanyName(WebDriver driver, String companyname) {
		driver.findElement(By.xpath(COMPANYNAME_XPATH)).sendKeys(companyname);		
	}
	public static void clickIndustry(WebDriver driver) {
		driver.findElement(By.xpath(DROPDOWNMENU_INDUSTRY_XPATH)).click();
	}
	public static void clickFunction(WebDriver driver) {
		driver.findElement(By.xpath(DROPDOWNMENU_FUNCTIONALROLE_XPATH)).click();
	}
	public static void inputPhonNumber(WebDriver driver, String phone) {
		driver.findElement(By.xpath(PHONNUMER_XPATH)).sendKeys(phone);
		}
	public static void inputCompanyPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(INPUTPASSWORD_XPATH)).sendKeys(password);
		}
	public static void inputREPassword(WebDriver driver, String repassword) {
		driver.findElement(By.xpath(REPETPASSWORD_XPATH)).sendKeys(repassword);
		}
	public static void clickbuttonSTARTSchedulin(WebDriver driver) {
		driver.findElement(By.xpath(STARTSCHEDULIN_XPATH)).click();
	}
}
