package pop_up;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.concurrent.TimeUnit;

	public class Ep4_FacebookAccountCreation {
	    @SuppressWarnings("deprecation")
		public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Set the implicit wait time
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        // Open Facebook registration page
	        driver.get("https://www.facebook.com/r.php");

	        // Fill in the registration form
	        WebElement firstNameInput = driver.findElement(By.name("firstname"));
	        firstNameInput.sendKeys("John");

	        WebElement lastNameInput = driver.findElement(By.name("lastname"));
	        lastNameInput.sendKeys("Doe");

	        WebElement emailInput = driver.findElement(By.name("reg_email__"));
	        emailInput.sendKeys("example@email.com");

	        WebElement passwordInput = driver.findElement(By.name("reg_passwd__"));
	        passwordInput.sendKeys("password");

	        WebElement signUpButton = driver.findElement(By.name("websubmit"));
	        signUpButton.click();

	        // Wait for the registration process to complete
	        WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Thanks for signing up')]"));

	        // Print the confirmation message
	        System.out.println(confirmationMessage.getText());

	        // Close the browser
	        driver.quit();
	    }
	}


