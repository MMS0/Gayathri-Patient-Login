package Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase10 {

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
		//WebElement ID = driver.findElement(By.xpath("//*[@id='national-id']"));
		WebElement tooltip= driver.findElement(By.xpath("//*[@id='insurance-info']"));
		 String tooltipText = tooltip.getAttribute("title"); 
		 if(tooltipText.contains("Enter insurance detail like insurance company name, type, number etc"))
			{
				System.out.println("Enter insurance detail like insurance company name, type, number etc tooltip is present");
			}
		 else{System.out.println("Unable to find tooltip for Insurance");}
}

}
