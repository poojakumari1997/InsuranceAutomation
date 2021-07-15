package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginpage;

public class logininvalid {
	private By login = By.xpath("//input[@name='submit']");
	private By message = By.cssSelector("form[id='login-form'] div span b");
	@Test
	public void invalid() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		loginpage log = new loginpage(driver);
		log.invalid();
		
		//login button present or not
		Assert.assertTrue(driver.findElement(login).isDisplayed());
		
		//message displayed
		String text = driver.findElement(message).getText();
		Assert.assertEquals(text, "Enter your Email address and password correct");
		
		driver.quit();
	}

}
