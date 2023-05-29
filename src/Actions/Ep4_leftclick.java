package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep4_leftclick 
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//button[@class='_2KpZ6L_2doB4z']")).click();
	 WebElement cart=d.findElement(By.xpath("//span[text()=Cart]"));
	 Actions act=new Actions(d);
	 act.moveToElement(cart).perform();
	 act.click().perform();
	 d.quit();
	 
 }
 
}
