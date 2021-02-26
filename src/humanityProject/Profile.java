package humanityProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	public static final String PROFILE_URL = "https://lalalalic.humanity.com/app/staff/edit/6081138/";
	public static final String EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
	public static final String EMPLOYEID_XPATH = "//*[@id=\"eid\"]";
	public static final String SAVE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void clickEditEmploye(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_XPATH)).click();	
	}
	public static void insertNickName (WebDriver driver, String nickname) {
		driver.findElement(By.xpath(NICKNAME_XPATH)).sendKeys(nickname);
	}
	public static void insertEmployeID (WebDriver driver, String nickname) {
		driver.findElement(By.xpath(EMPLOYEID_XPATH)).sendKeys(nickname);
	}
	public static void clickSave (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_XPATH)).click();
	}
}
