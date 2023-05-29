package ListOfElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep3 
{
 public static void main(String[]args)
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.facebook.com");
	 List<WebElement> at=d.findElements(By.xpath("//input"));
	 System.out.println(at.size());
	 for(WebElement b:at)
	 {
		 System.out.println(b.getText());
	 }
	 d.quit();
 }
}

