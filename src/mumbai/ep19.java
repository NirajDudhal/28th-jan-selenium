package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ep19
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		
		Thread.sleep(3000);
		WebElement month =
		driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		//System.out.println(s.getOptions().size());
		int size = s.getOptions().size();
		System.out.println(size);
		// List<WebElement> allOptions = s.getOptions();
		// int size = allOptions.size();
		// System.out.println(size);
		}
  
}
