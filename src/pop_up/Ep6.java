package pop_up;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep6
{
 public static void main(String[]args)
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://skpatro.github.io/demo/links/");
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 d.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
	 Set<String>Id=d.getWindowHandles();
	 ArrayList<String>a1=new ArrayList<String>(Id);
	 String childWindowID=a1.get(1);
	 d.switchTo().window(childWindowID);
	 d.findElement(By.xpath("(//span[@class=\"menu-text\"])[22]")).click();
	 d.quit();
	 
 }
}
