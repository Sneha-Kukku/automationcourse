package automationCore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNg_Base {
	
	@Test
	public void verifyUserLoginWithValidCredential() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1,"LoginPage");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordinPasswordField(password);
		loginpage.clickLoginButton();
		
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginButton=driver.findElement(By.id("login-button"));
		//loginButton.click();
	}
	@Test
	public void verifyIncorrectUsenamerwithValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordinPasswordField(password);
		loginpage.clickLoginButton();
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("problem_use");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginButton=driver.findElement(By.id("login-button"));
		//loginButton.click();
	}
	@Test
	public void verifyCorrectUserInvalidPassword() throws IOException
	
	{
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordinPasswordField(password);
		loginpage.clickLoginButton();
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("locked_out_user");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauc");
		//WebElement loginButton=driver.findElement(By.id("login-button"));
		//loginButton.click();
	}
	@Test
	public void verifyIncorrectUserIncorrectPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(4, 0, "LoginPage");
		String password=ExcelUtility.getStringData(4, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordinPasswordField(password);
		loginpage.clickLoginButton();
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@data-test='username']"));
		//usernamefield.sendKeys("performance_glitch");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@data-test='password']"));
		//passwordfield.sendKeys("secret");
		//WebElement loginButton=driver.findElement(By.id("login-button"));
		//loginButton.click();
	}

}
