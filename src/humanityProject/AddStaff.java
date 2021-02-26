package humanityProject;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddStaff {

	public static final String ADDEMPLOYEES_XPATH = "/html/body/table/tbody/tr/td/div[5]/button[3]";
	public static final String FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	public static final String LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String SAVE_EMPLOYE_XPATH = "//*[@id=\"_as_save_multiple\"]";

	public static void clickAddEmplpyees (WebDriver driver) {
		driver.findElement(By.xpath(ADDEMPLOYEES_XPATH)).click();
	}
	
	public static void inputFirstName (WebDriver driver, String firstname) {
		driver.findElement(By.xpath(FIRSTNAME_XPATH)).sendKeys(firstname);
	}
	public static void inputLastName (WebDriver driver, String firstname) {
		driver.findElement(By.xpath(LASTNAME_XPATH)).sendKeys(firstname);
	}
	public static void inputEmail (WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(email);
	}
	public static String newEmail() {
		return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	}
	
	public static void clickSaveEmploye (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_EMPLOYE_XPATH)).click();
	}
}
