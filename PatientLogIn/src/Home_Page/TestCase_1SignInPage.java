package Home_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1SignInPage {

	static WebDriver driver;
	static String url = "https://localhost:8443/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/gayathri/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("//div[@class='main_btn_action']")).click();
		
		WebElement email = driver.findElement(By.id("userLoginId"));
		if (email.isDisplayed()) {
			System.out.println("User name is displayed successfully");
		} else {
			System.out.println("Not Displayed user name");
		}
		WebElement password = driver.findElement(By.id("currentPassword"));
		if (password.isDisplayed()) {
			System.out.println("Password is displayed successfully");
		} else {
			System.out.println("Not Displayed password");
		}
		WebElement SignInbutton = driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']"));
		if (SignInbutton.isDisplayed()) {
			System.out.println("SignIbutton is displayed successfully");
		} else {
			System.out.println("Not Displayed SignInbutton");
		}
		WebElement SignUp = driver.findElement(
				By.xpath("/html/body/div[6]/div/div/div/div/div/div[1]/div[5]/div[2]/div/div[1]/div[1]/h3/a/span"));
		if (SignUp.isDisplayed()) {
			System.out.println("SignUp is displayed successfully");
		} else {
			System.out.println("Not Displayed SignUp");
		}
		WebElement Remember_me = driver.findElement(
				By.xpath("/html/body/div[6]/div/div/div/div/div/div[1]/div[5]/div[1]/div[4]/div[1]/div/label/span[3]"));
		if (Remember_me.isDisplayed()) {
			System.out.println("Remember_me is displayed successfully");
		} else {
			System.out.println("Not Displayed Remember_me");
		}
		WebElement forget_password = driver
				.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[1]/div[5]/div[1]/div[4]/div[1]/span"));
		if (forget_password.isDisplayed()) {
			System.out.println("Forget_password is displayed successfully");
		} else {
			System.out.println("Not Displayed Forget_password");
		}
		
		
			
		}
	}


