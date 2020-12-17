package Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

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
		WebElement MoreButton = driver.findElement(By.xpath("//*[@id='add_more']/div/button[2]"));
		MoreButton.click();
		WebElement MoreButtonTitle = driver.findElement(By.xpath("//*[@id='a-title']"));
		MoreButtonTitle.click();
		MoreButton.click();
		WebElement MoreButtonMiddeName = driver.findElement(By.xpath("//*[@id='a-middlename']/span"));
		MoreButtonMiddeName.click();
		MoreButton.click();
		WebElement MoreButtonSuffix = driver.findElement(By.xpath("//*[@id='a-suffix']"));
		MoreButtonSuffix.click();
		MoreButton.click();
		WebElement MoreButtonPreviousName = driver.findElement(By.xpath("//*[@id='a-previousname']"));
		MoreButtonPreviousName.click();

		WebElement FirstName = driver.findElement(By.xpath("//*[@id='firstName']"));
		if (FirstName.isDisplayed()) {
			System.out.println("First Name is displayed successfully");
		} else {
			System.out.println("Not Displayed user name");
		}
		WebElement LastName = driver.findElement(By.xpath("//*[@id='lastName']"));
		if (LastName.isDisplayed()) {
			System.out.println("Last Name is displayed successfully");
		} else {
			System.out.println("Not Displayed Last name");
		}
		WebElement MobileNumber = driver.findElement(By.xpath("//*[@id='phone']"));
		if (MobileNumber.isDisplayed()) {
			System.out.println("Mobile Number is displayed successfully");
		} else {
			System.out.println("Not Displayed Mobile Number");
		}
		WebElement ID = driver.findElement(By.xpath("//*[@id='national-id']"));
		if (ID.isDisplayed()) {
			System.out.println("ID is displayed successfully");
		} else {
			System.out.println("Not Displayed ID");
		}
		WebElement Insurance = driver.findElement(By.xpath("//*[@id='insurance-info']"));
		if (Insurance.isDisplayed()) {
			System.out.println("Insurance is displayed successfully");
		} else {
			System.out.println("Not Displayed Insurance");
		}
		WebElement Tite = driver.findElement(By.xpath("//*[@id='title']"));
		if (Tite.isDisplayed()) {
			System.out.println("Tite is displayed successfully");
		} else {
			System.out.println("Not Displayed Title");
		}
		WebElement PreviousName = driver.findElement(By.xpath("//*[@id='previousName']"));
		if (PreviousName.isDisplayed()) {
			System.out.println("Previous name is displayed successfully");
		} else {
			System.out.println("Not Displayed Previous name");
		}
		WebElement MiddleName = driver.findElement(By.xpath("//*[@id='middleName']"));
		if (MiddleName.isDisplayed()) {
			System.out.println("Middle Name is displayed successfully");
		} else {
			System.out.println("Not Displayed Middle Name");
		}WebElement Suffix = driver.findElement(By.xpath("//*[@id='suffix']"));
		if (Suffix.isDisplayed()) {
			System.out.println("Suffix is displayed successfully");
		} else {
			System.out.println("Not Displayed Suffix");
		}
		
	}

}
