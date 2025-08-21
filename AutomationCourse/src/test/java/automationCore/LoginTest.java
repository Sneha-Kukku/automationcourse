package automationCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNg_Base {
	
	@Test
	public void verifyUserLoginWithValidCredential()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	@Test
	public void verifyIncorrectUsenamerwithValidPassword()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("problem_use");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	@Test
	public void verifyCorrectUserInvalidPassword()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("locked_out_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauc");
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	@Test
	public void verifyIncorrectUserIncorrectPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@data-test='username']"));
		username.sendKeys("performance_glitch");
		WebElement password=driver.findElement(By.xpath("//input[@data-test='password']"));
		password.sendKeys("secret");
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
	}

}
