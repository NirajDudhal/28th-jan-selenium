package ListOfElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1
{
 public static void main(String[]args)
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.facebook.com/");
	 List<WebElement>alllinks = d.findElements(By.xpath("//a"));
	 System.out.println(alllinks.size());
	 for(WebElement s:alllinks)
	 {
		 System.out.println(s.getText());
	 }
	 d.quit();
 }
}
