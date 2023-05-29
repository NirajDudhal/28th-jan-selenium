package mumbai;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class ep18 
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new ChromeDriver();
	 d.get("http://www.facebook.com/");
	 d.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
	  d.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	 Thread.sleep(3000);
	// Select s=new Select(month);
	//List<WebElement> allOptions = s.getOptions();
	 //System.out.println(s.getOptions().size());

 }

public static List<WebElement> allOptions() {
	// TODO Auto-generated method stub
	 int size =allOptions().size();
	 System.out.println(size);
	return null;
}
}
