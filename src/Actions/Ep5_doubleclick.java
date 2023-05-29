package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep5_doubleclick 
{
 public static void main(String[]args) throws InterruptedException 
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://demo.guru99.com/test/simple_context_menu.html");
	 Thread.sleep(2000);
	 WebElement douclick=d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	 Actions act=new Actions(d);
	 //act.doubleClick(douclick).perform();
	 act.moveToElement(douclick).perform();
	 act.doubleClick().perform();
	 Thread.sleep(2000);
	 Alert alert=d.switchTo().alert();
	 String alertText=alert.getText();
	 System.out.println("Alert Text: "+alertText);
	 alert.accept();
	 d.quit();
 }
}
