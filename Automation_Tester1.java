package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		//close browser
		driver.findElement(By.linkText("Register")).click();
		//click gender type
		driver.findElement(By.id("gender-female")).click();
		//enter first name
		 driver.findElement(By.name("FirstName")).sendKeys("korsa");
		 //enter last name
		 driver.findElement(By.name("LastName")).sendKeys("priya");
		//enter email
		 driver.findElement(By.name("Email")).sendKeys("korsapriyahoney@gmail.com");
		 //enter password as password123
		 driver.findElement(By.name("Password")).sendKeys("password123");
		 //enter confirm password
		 driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
		//click on register
		 driver.findElement(By.name("register-button")).click();
		//close browser
			driver.findElement(By.linkText("Log in")).click();
			//enter email
			driver.findElement(By.name("Email")).sendKeys("korsapriyahoney@gmail.com");
			//enter password as password123
			 driver.findElement(By.name("Password")).sendKeys("password123");
	//click on login
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
			 //close the browser
		 driver.close(); 
		 	
	}
}