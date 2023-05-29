package scrollUp_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class Ep2ScrollAndScreenshot {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[@class=\"action-inner\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\niraj\\OneDrive\\Pictures\\Screenshots\\nyk.jpg");
        FileHandler.copy(screenshot, destination);
        driver.quit();
    }
}
