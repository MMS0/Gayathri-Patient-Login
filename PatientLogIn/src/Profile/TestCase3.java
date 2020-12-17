package Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

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
		WebElement usernametextbox = driver.findElement(By.id("userLoginId"));
		usernametextbox.sendKeys("gayathri.r@75health.com");
		WebElement passwordtextbox = driver.findElement(By.id("currentPassword"));
		passwordtextbox.sendKeys("1");
		WebElement Signinbutton = driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']"));
		Signinbutton.click();
		WebElement profile = driver.findElement(By.xpath("//*[@id='person-image']"));
		profile.click();
		WebElement ManageYourAccount = driver.findElement(By.xpath("//*[@id='option-setting']/ul/li[2]/button"));
		ManageYourAccount.click();
		WebElement PersonalDetail = driver
				.findElement(By.xpath("//*[@id='person-name-email']/div/div/div[2]/table/tbody/tr/td[1]"));
		PersonalDetail.click();
		WebElement FirstName = driver.findElement(By.xpath("//*[@id='firstName']"));
		FirstName.clear();
		FirstName.sendKeys("Sara");
		WebElement LastName = driver.findElement(By.xpath("//*[@id='lastName']"));
		LastName.clear();
		LastName.sendKeys("Brown");
		WebElement MobileNumber = driver.findElement(By.xpath("//*[@id='phone']"));
		MobileNumber.clear();
		WebElement ID = driver.findElement(By.xpath("//*[@id='national-id']"));
		ID.clear();
		WebElement Insurance = driver.findElement(By.xpath("//*[@id='insurance-info']"));
		Insurance.clear();
		WebElement Savebutton =driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div[2]/div/table/tbody/tr/td[2]/div/div[6]/div[6]/div[1]/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div[14]/div[1]/div"));
		Savebutton.click();
		System.out.println("Patient saved successfully");

		

	}

}
