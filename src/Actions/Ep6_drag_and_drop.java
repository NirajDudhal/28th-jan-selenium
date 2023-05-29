 package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep6_drag_and_drop 
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.manage().window().maximize();
	 d.get("http://demo.guru99.com/test/drag_drop.html");
	 Thread.sleep(2000);
     WebElement src= d.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
     WebElement dest=d.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\"]"));
     Thread.sleep(2000);
     Actions act=new Actions(d);
     act.dragAndDrop(src, dest).perform();
     System.out.println("drag and drop action performed");
	 d.quit();
 }
}
