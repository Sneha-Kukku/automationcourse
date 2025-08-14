package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert=driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmButton=driver.findElement(By.id("confirmButton"));
		confirmButton.click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		
	}

	public static void main(String[] args) {
		HandlingAlert handlingAlert=new HandlingAlert();
		handlingAlert.initializeBrowser();
		handlingAlert.verifySimpleAlert();
		handlingAlert.verifyConfirmAlert();
		// TODO Auto-generated method stub

	}

}
