package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d = new FirefoxDriver();
        d.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement clck = d.findElement(By.xpath("//span[text()='right click me']"));
        Thread.sleep(3000);
        WebElement kud = d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act = new Actions(d);
        act.contextClick(clck).perform();
        Thread.sleep(3000);
        act.doubleClick(kud).perform();

        
        Alert alert= d.switchTo().alert();
        	
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();

        d.quit();
    }
}

