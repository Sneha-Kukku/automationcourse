package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions  extends Base {
	//right click action
	public void verifyRightClick()
	{
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		//create object,bcs its a method
		Actions action=new Actions(driver);
		action.contextClick(home).build().perform();
	}
	//museHover
	public void mouseHover()
	{
	WebElement others=driver.findElement(By.id("others"));
	Actions action=new Actions(driver);
	action.moveToElement(others).build().perform();
	}
	//drag and drop
	public void verifyDragandDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	//keyboard actions
	public void verifyKeyboardAction() throws AWTException
	{
		//create object
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		
	}

	public static void main(String[] args) {
		HandlingActions handlingaction=new HandlingActions();
		handlingaction.initializeBrowser();
		//handlingaction.verifyRightClick();
		//handlingaction.mouseHover();
		handlingaction.verifyDragandDrop();
		try {
			handlingaction.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
