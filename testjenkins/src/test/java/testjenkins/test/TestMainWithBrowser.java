package testjenkins.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMainWithBrowser {
	static WebDriver driver;

	@BeforeClass
	public static void init() {
		System.out.println("init...");
		System.setProperty("webdriver.gecko.driver", "C:\\DEV\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testMain() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("lizhe");
		driver.findElement(By.id("su")).click();
	}

	@AfterClass
	public static void destory() {
		System.out.println("destory...");
		driver.quit();
	}
}