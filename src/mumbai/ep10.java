package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep10 
{
 public static void main(String[]args)
 {
	 WebDriver d=new ChromeDriver();
	 
	 d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/ep3.html");
	 d.findElement(By.tagName("input")).sendKeys("fsa");
	 d.findElement(By.tagName("input")).sendKeys("sdf");
 }
}
