package dynamic_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Ep3 
{
  public static void main(String[]args)
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("file:///C:/Users/niraj/OneDrive/Desktop/New%20folder%20(2)/table.html");
	  List<WebElement> allrows= d.findElements(By.xpath("//table[@id=\"my table\"]//tr"));
	  int size=allrows.size();
	  System.out.println(size);
	  System.out.println(allrows);
	  
	  d.quit();
  }
}
