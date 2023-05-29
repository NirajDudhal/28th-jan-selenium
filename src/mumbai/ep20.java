package mumbai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ep20 
{
 public static void main (String[]args) throws InterruptedException
 {
	 WebDriver d=new ChromeDriver();
	 d.get("http://www.facebook.com/");
	 d.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
	 Thread.sleep(3000);
	 WebElement year=d.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
	 Select s=new Select(year);
	 List<WebElement> allOptions=s.getOptions();
	 System.out.println(allOptions.size());
	 for(WebElement s2:allOptions)
	 {
		 System.out.println(s2.getText());
	 }
 }
}
