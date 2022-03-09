package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//open application
driver.get("https://demo.guru99.com/test/newtours/");
//close browser
driver.findElement(By.linkText("REGISTER")).click();
//enter username as priya
 driver.findElement(By.name("email")).sendKeys("priya");
 //enter password as password123
 driver.findElement(By.name("password")).sendKeys("password123");
 //enter confirm password
 driver.findElement(By.name("confirmPassword")).sendKeys("password123");
//click on submit
 driver.findElement(By.name("submit")).click();
 //close the browser
 driver.close();
	}
}
