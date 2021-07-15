package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	private By logout = By.xpath("//input[@value='Log out']");
	
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		driver.findElement(By.id("email")).sendKeys("pk123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
	}
	public void invalid() {
		driver.findElement(By.id("email")).sendKeys("p123@gmail.com") ;
		driver.findElement(By.id("password")).sendKeys("12903");
		driver.findElement(By.name("submit")).click();
	}
	public void logout() {
		//Logout button click
				driver.findElement(logout).click();
	}
	

}
