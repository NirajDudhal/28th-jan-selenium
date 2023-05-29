package ListOfElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep2 
{
	public static void main(String[]args)
	{
	  WebDriver d=new FirefoxDriver();

	  d.get("http://www.facebook.com");
	  List<WebElement> img=d.findElements(By.xpath("img"));
	  System.out.println(img.size());
	  for(WebElement s:img)
	    {
	      System.out.println(s.getText());
	    }
	     d.quit();
	}
}
