import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My first program");

		System.setProperty("webdriver.chrome.driver", "C://Users//Public//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("everJaveria@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys(("22802280Javeria"));
		driver.findElement(By.linkText("Forgot account?")).click();
		// driver.findElement(By.XPtah()).click();
		Thread.sleep(2000);
		driver.close();
	}

}
