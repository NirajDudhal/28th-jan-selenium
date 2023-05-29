package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep10
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.manage().window().maximize();
	 d.get("http://demo.guru99.com/test/drag_drop.html");
     WebElement src=d.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
     WebElement src1=d.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
     WebElement dest=d.findElement(By.xpath("//ol[@class=\"field15 ui-droppable ui-sortable\"]"));
     WebElement dest1=d.findElement(By.xpath("(//ol[@class=\"field13 ui-droppable ui-sortable\"])[2]"));
     Thread.sleep(2000);
     Actions act=new Actions(d);
     act.dragAndDrop(src, dest).perform();
     Thread.sleep(2000);
     act.dragAndDrop(src1, dest1).perform();
     Thread.sleep(2000);
     d.quit();
 }
}
