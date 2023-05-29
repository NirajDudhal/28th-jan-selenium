package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep11
{
 public static void main(String[]args)
 {
	 WebDriver d=new ChromeDriver();
	 d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/ep9.html");
	 d.findElement(By.id("1256")).sendKeys("jim");
	 d.findElement(By.className("abc123")).sendKeys("kim");
	 d.findElement(By.name("xya123")).sendKeys("gim"); 
 }
}
