package Actions;


	  
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ep9 {
    public static void main(String[] args) {
        WebDriver d = new FirefoxDriver();
        d.get("http://www.facebook.com/");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            WebElement loginLink = d.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
            loginLink.click();
            System.out.println("Clicked on login link.");

            WebElement month = d.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
            Actions act = new Actions(d);
            act.click(month).perform();
            System.out.println("Clicked on month dropdown.");

            Thread.sleep(2000);
            act.sendKeys(Keys.HOME).perform();
            System.out.println("Pressed HOME key.");

            for (int i = 1; i <= 8; i++) {
                act.sendKeys(Keys.ARROW_DOWN).perform();
                System.out.println("Pressed ARROW_DOWN key.");
                Thread.sleep(2000);
            }

            act.sendKeys(Keys.ENTER).perform();
            System.out.println("Pressed ENTER key.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         d.quit();
        
    }
}


