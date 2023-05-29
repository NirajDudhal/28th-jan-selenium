package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ep16 
{
	  public static void main(String[]args) throws InterruptedException
	  {
		  WebDriver d=new ChromeDriver();
		  d.get("http://www.facebook.com/");
		 d.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		 Thread.sleep(3000);
		 WebElement month= d.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		  Select s=new Select(month);
		  s.selectByVisibleText("Jan");
		  String text=s.getFirstSelectedOption().getText();
		  System.out.println(text);
	  }
	}
