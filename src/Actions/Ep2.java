package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Ep2 
{
 public static void main(String[]args) throws InterruptedException 
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.flipkart.com");
	 Thread.sleep(3000);
	 d.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
	 Thread.sleep(3000);
    WebElement login=d.findElement(By.xpath("//a[text()='login']"));
    Actions act=new Actions(d);
    act.moveToElement(login);
    Thread.sleep(3000);
    d.findElement(By.xpath("//div[text()='Wishlist']")).click();
    d.quit();
	 
	 
 }
}
