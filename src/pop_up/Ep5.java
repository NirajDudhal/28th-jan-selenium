package pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep5 
{
 public static void main(String[]args)
 {
	  WebDriver d=new FirefoxDriver();
	  d.get("https://skpatro.github.io/demo/links/");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
	  Set<String>allId=d.getWindowHandles();
	  ArrayList<String>a1=new ArrayList<String>(allId);
	  String childWindowID=a1.get(1);
	  System.out.println(a1);
	  d.switchTo().window(childWindowID);
			  
	  d.findElement(By.xpath("(//span[@class=\"menu-text\"])[5]")).click();
	  d.quit();
	  
 }


}  

