package Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase15 {

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
		WebElement Title = driver.findElement(By.xpath("//*[@id='title']"));
		Select TitleDropDown= new Select(driver.findElement(By.xpath("//*[@id='title']")));
		TitleDropDown.selectByVisibleText("Mrs");
		WebElement TitleCancelButton = driver.findElement(By.xpath("//*[@id='p_title']/div[2]"));
		TitleCancelButton.click();
		String alertText=driver.switchTo().alert().getText();
		if(alertText.equalsIgnoreCase("Active data exists, double click to remove field")){
		System.out.println(alertText);}
		else{System.out.println("Not found");}
		//*[@id="--child--message--"]/div
	}

}
