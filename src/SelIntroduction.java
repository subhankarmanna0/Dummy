import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction 
{

	public static void main(String[] args) 
	{
		//Invoking the browser
		//Chrome - ChromeDriver - Method are close get 
		//WebDriver - Interface - Methods are close - get
		//driver is object 
		//ChromeDriver is Class
		// WebDriver use - It wil work in all the browser
		//chromefriver.exe --> Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\Workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch on Firefox
//		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Selenium\\Workspace\\FirefoxDriver\\Gecko\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		//Launch web application
		driver.get("https://rahulshettyacademy.com/");
		//Print title of the page in console (check the title of the page)
		System.out.println(driver.getTitle());
		//validate correct URL 
		System.out.println(driver.getCurrentUrl());
		//close the recent browser
		//driver.close();
		//All associate window will close while use quit.
		//driver.quit();
	}
}
