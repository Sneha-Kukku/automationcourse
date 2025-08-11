package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void handlingElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//sendKeys
		WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("sneha");
		//click
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showButton.click();
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
