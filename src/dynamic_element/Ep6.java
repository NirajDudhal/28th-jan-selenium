package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep6
{
  public static void main(String[]args)
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/table.html");
	  String text=d.findElement(By.xpath("(//table[@id=\"my table\"]//tr[3])/td[2]")).getText();
	  System.out.println(text);
	  String name=d.findElement(By.xpath("(//table[@id=\"my table\"]//tr[4])/td[3]")).getText();
	  System.out.println(name);
	  d.quit();
  }
}
