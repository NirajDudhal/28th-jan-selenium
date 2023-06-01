package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Ep12
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
	  Thread.sleep(3000);
	  WebElement source= d.findElement(By.xpath("(//li[@class=\\\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\\\"])[2]"));
	  WebElement destination= d.findElement(By.xpath("//div[@id=\"trash\"]"));
	  Thread.sleep(2000);
	  Actions act=new Actions(d);
	  act.dragAndDrop(source, destination).build().perform();
	  System.out.println("drag and drop performed");
	  d.quit();

	  
  }
}
