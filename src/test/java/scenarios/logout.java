package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginpage;

public class logout {
	private By login = By.xpath("//input[@value='Log in']");
	private By logout = By.xpath("//input[@value='Log out']");
	@Test
	public void out() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		loginpage log = new loginpage(driver);
		log.login();
		//Log out button present
		Assert.assertTrue(driver.findElement(logout).isDisplayed());
		
		log.logout();
		
		//Login button present
		Assert.assertTrue(driver.findElement(login).isDisplayed());
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System - Login");
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://demo.guru99.com/insurance/v1/index.php");
		
		
	}
	

}
