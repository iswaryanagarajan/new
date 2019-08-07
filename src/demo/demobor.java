package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demobor {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.borland.com/gmopost/");
	driver.manage().window().maximize();
	driver.findElement(By.name("bSubmit")).click();
	Thread.sleep(5000L);
	Alert alert= driver.switchTo().alert();
	String alertMessages= driver.switchTo().alert().getText();
	System.out.println(alertMessages);
	alert.accept();
	driver.navigate().back();
	driver.findElement(By.name("bAbout")).click();
	Thread.sleep(5000L);
	driver.navigate().back();
	Thread.sleep(5000L);driver.findElement(By.name("bBrowserTest")).click();
	{
	int length= driver.findElements(By.xpath("//td[align='center']//table//tbody/tr[4]/td[1]")).size();
	System.out.println("length");
	for(int i=2;i<=length;i++){
	String itemnumber =driver.findElement(By.xpath("//td[align='center']//table//tbody/tr[4]/td[1]")).getText();
	if(itemnumber .equals("1002"))
	System.out.println("Itemnumber Matched");
	}
	
	

	}
	}
}
	