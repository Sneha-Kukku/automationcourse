package seleniumBasics;

public class BrowserComments extends Base {
	public void handlingBrowserCommand()
	{
		//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	//getCurrentUrl
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//getWindowHandle
	String handleId=driver.getWindowHandle();
	System.out.println(handleId);
	//getPageSource
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	}
	//navigation
	public void navigationCommands()
	{
		//to
		driver.navigate().to("https://www.amazon.in/");
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		BrowserComments browser=new BrowserComments();
		browser.initializeBrowser();
		//browser.handlingBrowserCommand();
		browser.navigationCommands();
		
	}

}
