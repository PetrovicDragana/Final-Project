package humanityProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs {
	public static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String ABOUTUSLINK_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String URL_ABOUTUS = "https://www.humanity.com/about";
	
	public static void clickAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}
	
	public static void choseLinkAboutUs (WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUSLINK_XPATH)).click();
	}
	
}
