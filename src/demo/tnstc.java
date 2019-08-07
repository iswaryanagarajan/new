package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tnstc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Varshan");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("varshan@04");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Iswarya@04");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Iswarya@04");

	}

}