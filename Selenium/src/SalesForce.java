import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Public//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("username")).sendKeys("SalesForce1234");
		driver.findElement(By.name("pw")).sendKeys("12345");
		// driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();

		driver.findElement(By.name("Login")).click();

		System.out.println(driver.findElement(By.id("error")).getText());

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
