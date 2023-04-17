package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
        	WebDriver driver;
        	@BeforeSuite
        	void init()
        	{
        		WebDriverManager.chromedriver().setup();
        		ChromeOptions co=new ChromeOptions();
        		co.addArguments("--remote-allow-origins=*");
        		driver=new ChromeDriver();	
        	}
        	@Test
        	void test1() throws InterruptedException
        	{
        		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        		driver.get(url);
        		Thread.sleep(3000);
        		WebElement uname=driver.findElement(By.name("username"));
        		uname.sendKeys("Admin");
        		WebElement pass=driver.findElement(By.name("password"));
        		pass.sendKeys("admin123");
        		WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        		login.click();
        		driver.manage().window().maximize();
        		WebElement filter=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
            	filter.click();
            	Select logout=new Select(filter);
            	logout.selectByIndex(3);
            	driver.close();
        	}
}