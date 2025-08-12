package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//size-to get the count of all the frames
		List<WebElement>totalFrame=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
		//switchTo-to make control over a specific page in a frame
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		//get text(heading)
		WebElement frameheading= driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		//return to previous one
		driver.switchTo().defaultContent();
		
		
		
	}

	public static void main(String[] args) {
		HandlingFrames frames=new HandlingFrames();
		frames.initializeBrowser();
		frames.verifyFrames();
		// TODO Auto-generated method stub

	}

}
