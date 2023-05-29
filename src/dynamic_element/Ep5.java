package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep5 
{
  public static void main(String[]args)
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/table.html");
      int col=d.findElements(By.xpath("(//table[@id=\"my table\"])//tr[2]/td")).size();
      System.out.println(col);
      int col1=d.findElements(By.xpath("(//table[@id=\"my table\"])//tr[1]/th")).size();
      System.out.println(col1);
      d.quit();
  }
}
