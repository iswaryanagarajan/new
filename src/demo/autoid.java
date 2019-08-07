package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoid {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		Thread.sleep(7000L);
		Runtime.getRuntime().exec("c:\\Users\\SAIVARSHAN\\Desktop\\autoid1.exe");

	}

}
