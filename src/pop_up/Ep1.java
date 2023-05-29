package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1
{
 public static void main(String[]args)
 {
	 WebDriver d=new FirefoxDriver();
     d.get("https://www.flipkart.com/");
     d.findElement(By.xpath("//input[@class='_2IX_2-VJZDxU']")).sendKeys("9765888456");
 }
}	


