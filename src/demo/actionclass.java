package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
	driver.findElement(By.xpath("//a[text()='Windows']")).click();
	String Mainwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
	Set<String> s1=driver.getWindowHandles();
	for(String screen:s1){
	driver.switchTo().window(screen);
	System.out.println(driver.getTitle());
	}
	driver.switchTo().window(Mainwindow);
	}

}
