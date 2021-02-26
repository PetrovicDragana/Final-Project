package humanityProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HumanityMenu {
	public static final String DASHBOARD_URL = "https://lalalalic.humanity.com/app/dashboard/";
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span/p";
	public static final String DASHBOARD_TITLE = "Dashboard - Dashboard - Humanity";
	public static final String SHIFT_PLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span/p";
	public static final String SHIFT_PLANNING_TITLE = "ShiftPlanning - Humanity";
	public static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span/i";
	public static final String TIME_CLOCK_TITLE= "Timeclock - Overview - Humanity";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";
	public static final String LEAVE_TITLE ="Leave - Vacation - Humanity";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span/i";
	public static final String TRAINING_TITLE = "Training - Overview - Humanity";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span/i";
	public static final String STAFF_TITLE = "Staff - List - Humanity";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span/i";
	public static final String AVAILABILITY_TITLE = "Payroll - Scheduled-hours - Humanity";
	public static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span/p";
	public static final String PAYROLL_TITLE = "Payroll - Scheduled-hours - Humanity";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span/p";
	public static final String REPORTS_TITLE = "Payroll - Scheduled-hours - Humanity";
	
public static void clickDashboardButton(WebDriver driver) {
	driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
}
public static void clickShiftPlaning (WebDriver driver) {
	driver.findElement(By.xpath(SHIFT_PLANNING_XPATH)).click();
}
public static void clickTimeClock (WebDriver driver) {
	driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
}
public static void clickLeave (WebDriver driver) {
	driver.findElement(By.xpath(LEAVE_XPATH)).click();
}
public static void clickTraining (WebDriver driver) {
	driver.findElement(By.xpath(TRAINING_XPATH)).click();
}
public static void clickStaff (WebDriver driver) {
	driver.findElement(By.xpath(STAFF_XPATH)).click();
}
public static void clickAvailability (WebDriver driver) {
	driver.findElement(By.id("sn_availability")).click();
}
public static void clickPayroll (WebDriver driver) {
	driver.findElement(By.id("sn_payroll")).click();
}
public static void clickReports (WebDriver driver) {
	driver.findElement(By.id("sn_reports")).click();
}

}
