package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base {
	public void handlingLocators()
	{
		//idLocator
		driver.findElement(By.id("button-one"));
		//className
		driver.findElement(By.className("btn btn-primary"));
		//tagName
		driver.findElement(By.tagName("input"));
		//name
		driver.findElement(By.name("viewport"));
		//linkText
		driver.findElement(By.linkText("Simple Form Demo"));
		//partialLinkText
		driver.findElement(By.partialLinkText("Simple"));
		//cssSelector
		driver.findElement(By.cssSelector("button[id='button-one']"));
		//relativeXpath
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
