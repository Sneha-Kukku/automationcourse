package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
	public void handlingElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//sendKeys
		WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("sneha");
		//click
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showButton));
		Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(showButton));
				
		showButton.click();
		//isDisplayed
		System.out.println(showButton.isDisplayed());
		//isEnabled
		System.out.println(showButton.isEnabled());
		//getText
		WebElement yourMsg=driver.findElement(By.xpath("//div[@id='message-one']"));
		String s=yourMsg.getText();
		System.out.println(s);
		//clear
		msgBox.clear();
		//getCssValue
		System.out.println(showButton.getCssValue("background-color"));
		//getTagName
		//WebElement value=driver.findElement(By.id(""))
		System.out.println(showButton.getTagName());
		WebElement value=driver.findElement(By.id("value-a"));
		System.out.println(value.getTagName());
		
	
		
	}

	public static void main(String[] args) {
		WebElementCommands webElement=new WebElementCommands();
		webElement.initializeBrowser();
		webElement.handlingElements();
		// TODO Auto-generated method stub

	}

}
