package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base {
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		//get data of entire table
		WebElement table=driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		//get data of a particular row in the table-xpathOf<table./tbody/tr[Row No:]
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRow.getText());
	}

	public static void main(String[] args) {
		HandlingTable table=new HandlingTable();
		table.initializeBrowser();
		table.verifyTable();
		// TODO Auto-generated method stub

	}

}
