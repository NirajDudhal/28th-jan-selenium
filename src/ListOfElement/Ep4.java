package ListOfElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep4 
{
 public static void main(String[]args)
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.facebook.com");
	 d.manage().window().maximize();
	 List<WebElement> links= d.findElements(By.tagName("a"));
	 
	 for(int i=0;i<links.size();i++)
	 {
		 System.out.println(links.get(i).getText()+"--"+links.get(i).getAttribute("href"));
		 
	 }
	 d.quit();
 }
}
