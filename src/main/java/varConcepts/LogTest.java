package varConcepts;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogTest {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aasif\\Selleniumworkspace\\crm\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Bank & Cash")).click();
//		driver.findElement(By.linkText("New Account")).click();
//		driver.findElement(By.id("https://techfios.com/billing/?ng=accounts/add/")).click();
//		driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[1]/input")).click();
//		driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("bahubali");
//		
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]")).click();
		driver.findElement(By.id("account")).sendKeys("BahuBali");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
		driver.findElement(By.id("description")).sendKeys("India's HE Man");
		driver.findElement(By.xpath("//*[@id=\"balance\"]")).click();
		driver.findElement(By.id("balance")).sendKeys("1000000");
		driver.findElement(By.xpath("//*[@id=\"account_number\"]")).click();
		driver.findElement(By.id("account_number")).sendKeys("00707070707");
		driver.findElement(By.xpath("//*[@id=\"contact_person\"]")).click();
		driver.findElement(By.id("contact_person")).sendKeys("Kattappa");
		driver.findElement(By.xpath("//*[@id=\"contact_phone\"]")).click();
		driver.findElement(By.id("contact_phone")).sendKeys("214-214-2145");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		
	}
	

	

	
}
