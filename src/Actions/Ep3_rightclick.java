package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
public class Ep3_rightclick 
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://demo.guru99.com/test/simple_context_menu.html");
	 Thread.sleep(3000);
     WebElement ele=d.findElement(By.xpath("//span[text()='right click me']"));
     Actions act=new Actions(d);
     //act.moveToElement(ele).perform();
     //act.contextClick().perform();
     //act.moveToElement(ele).contextClick().perform();
     act.contextClick(ele).perform();
     
     d.quit();
	 
 }
}
