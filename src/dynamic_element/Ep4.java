package dynamic_element;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep4 
{
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver d=new FirefoxDriver();
	   d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/table.html");
	   int rowsize=d.findElements(By.xpath("//table[@id='my table']//tr")).size();
	   System.out.println(rowsize);
	   
	   d.quit();
   }
}
