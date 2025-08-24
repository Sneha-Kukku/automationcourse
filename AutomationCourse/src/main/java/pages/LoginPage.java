package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="user-name") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(id="login-button") private WebElement loginButton;
	
	public void enterUsernameonUserField()
	{
		username.sendKeys("standard_user");
		
	}
	public void enterPasswordinPasswordField()
	{
		password.sendKeys("secret_sauce");
		
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}

}
