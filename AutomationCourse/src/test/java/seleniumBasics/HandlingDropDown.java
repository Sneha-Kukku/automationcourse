package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void handlingDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(2);
		//select.selectByValue("sql");
		select.selectByVisibleText("JAVA");
	}
	public void handlingCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		WebElement checkbox2=driver.findElement(By.xpath("//input[@value=\"option-2\"]"));
		checkbox2.click();
		WebElement checkbox3=driver.findElement(By.xpath("//input[@value=\"option-4\"]"));
		checkbox3.click();
		}
	public void handlingRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton1=driver.findElement(By.xpath("//input[@value='green']"));
		radioButton1.click();
		WebElement radioButton2=driver.findElement(By.xpath("//input[@value='blue']"));
		radioButton2.click();
		WebElement radioButton3=driver.findElement(By.xpath("//input[@value='yellow']"));
		radioButton3.click();
		WebElement radioButton4=driver.findElement(By.xpath("//input[@value='orange']"));
		radioButton4.click();
		
	}
	

	public static void main(String[] args) {
		HandlingDropDown drop=new HandlingDropDown();
		drop.initializeBrowser();
		//drop.handlingDropDown();
		drop.handlingCheckBox();
		drop.handlingRadioButton();
		

	}

}
