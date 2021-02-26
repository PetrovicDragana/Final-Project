package humanityProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Language {
	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span";
	public static final String LNG_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_XPATH = "//*[@id=\"_save_settings_button\"]";
	public static final String LNG2_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String EMAILNOTIF_XPATH = "//*[@id=\"pref_pref_email\"]";
	public static final String SMSNOTIF_XPATH = "//*[@id=\"pref_pref_sms\"]";
	public static final String MOBILE_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";

	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
	}

	public static void clickLanguage(WebDriver driver) {
		driver.findElement(By.xpath(Language.SAVE_XPATH)).click();
	}
	public static void clickEmailNotif(WebDriver driver) {
	driver.findElement(By.xpath(Language.EMAILNOTIF_XPATH)).click();}
	
	public static void clickSmsNotif (WebDriver driver) {
	driver.findElement(By.xpath(Language.SMSNOTIF_XPATH)).click();
	}
	
	public static void clickMobile(WebDriver driver) {
	driver.findElement(By.xpath(Language.MOBILE_XPATH)).click();
	}
	public static void clickSave(WebDriver driver) {
	driver.findElement(By.xpath(Language.SAVE_XPATH)).click();
	}
	public static void pageDown (WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_DOWN);
	}
}