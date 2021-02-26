package humanityProject;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeEmployeesName {
	public static final String EMPLOYE_XPATH = "//*[@id=\"7\"]/a";
	public static final String EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String FIRSTNAMEEMPLOYE_XPATH = "//*[@id=\"first_name\"]";
	public static final String SAVEEMPLOYE_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	public static final String CANCELANNUNCEMANT_XPATH = "//*[@id=\"_fbody\"]";
	public static void clickEmploye(WebDriver driver) {
		driver.findElement(By.xpath(EMPLOYE_XPATH)).click();
		
	}
	public static void clickEditEmploye(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_XPATH)).click();	
	}
	public static void clearEmployeName(WebDriver driver) {
		driver.findElement(By.xpath(FIRSTNAMEEMPLOYE_XPATH)).clear();	
	}
	public static void cklicCancelAnn(WebDriver driver) {
		driver.findElement(By.xpath(CANCELANNUNCEMANT_XPATH)).click();
	}
	public static String randomName() {
		return UUID.randomUUID().toString();
	}
	public static void inputNewEmployeName(WebDriver driver, String employename) {
		driver.findElement(By.xpath(FIRSTNAMEEMPLOYE_XPATH)).sendKeys(employename);
	}
	public static void clickSaveEmploye(WebDriver driver) {
		driver.findElement(By.xpath(SAVEEMPLOYE_XPATH)).click();
	}
}
