package Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11 {

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
		if (MoreButtonTitle.isDisplayed()) {
			System.out.println("Title is displayed under more button");
		} else {
			System.out.println("Title is not under More button");
		}
		WebElement MoreButtonMiddleName = driver.findElement(By.xpath("//*[@id='a-middlename']/span"));
		if (MoreButtonMiddleName.isDisplayed()) {
			System.out.println("Middle Name is displayed under more button");
		} else {
			System.out.println("Middle Name is not under More button");
		}
		WebElement MoreButtonSuffix = driver.findElement(By.xpath("//*[@id='a-suffix']"));
		if (MoreButtonSuffix.isDisplayed()) {
			System.out.println("Suffix is displayed under more button");
		} else {
			System.out.println("Suffix is not under More button");
		}

		WebElement MoreButtonPreviousName = driver.findElement(By.xpath("//*[@id='a-previousname']"));
		if (MoreButtonPreviousName.isDisplayed()) {
			System.out.println("Previous Name is displayed under more button");
		} else {
			System.out.println("Previous Name is not under More button");
		}

	}

}
