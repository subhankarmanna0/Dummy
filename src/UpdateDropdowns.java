import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is test framework
public class UpdateDropdowns 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\Workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[text() = 'Senior Citizen']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[text() = 'Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//*[text() = 'Senior Citizen']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[text() = 'Senior Citizen']")).isSelected());
		
		//Count all CheckBox
		System.out.println(driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size());
		int CheckBox_Count = driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size();
		
		Assert.assertEquals(CheckBox_Count, 6);
		System.out.println("Couny Passed");
	}

}
