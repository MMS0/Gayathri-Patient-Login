package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class patientLogin {
	protected WebDriver driver;

	String url = "https://localhost:8443/";

	@BeforeSuite

	public void login1() {

		try {
			System.setProperty("webdriver.chrome.driver", "/home/gayathri/Documents/chromedriver");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

			Thread.sleep(3000);
			WebElement obj = driver.findElement(By.id("userLoginId"));
			obj.sendKeys("gayathri.r@75health.com");
			WebElement obj1 = driver.findElement(By.id("currentPassword"));

			obj1.sendKeys("1");

			driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']")).click();
			Thread.sleep(4000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		patientLogin login = new patientLogin();
		login.login1();
		login.Aftersuite();
	}

	@AfterSuite
	public void Aftersuite() {

		driver.close();
	}

}
