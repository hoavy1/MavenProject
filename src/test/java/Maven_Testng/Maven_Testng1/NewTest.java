package Maven_Testng.Maven_Testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	WebDriver driver = new ChromeDriver();
	//Maven_Testng.Maven_Testng.NewTest

	@Test
	public void loginBlaze() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		String baseUrl = "https://www.demoblaze.com/";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement clickLogin = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		clickLogin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='loginusername']"));
		username.sendKeys("testerdemo124");
		System.out.println("Entered username ");
		WebElement password = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		password.sendKeys("123456");
		System.out.println("Entered password");
		WebElement login = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		login.click();
		driver.close();
		
	}

	@Test
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("testuser199x@gmail.com");
		password.sendKeys("12345678x@X");
		System.out.println("Text Field Set");
		WebElement signIn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signIn.click();
		driver.close();

	}

}
