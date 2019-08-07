package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class demo1 {
	public static void main(String[] args) throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromedriver.exe");
	DesiredCapabilities cap =DesiredCapabilities.chrome();
	
	WebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.33:4444/wd/hub"), cap);
	driver.get("http://demo.automationtesting.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='btn2']")).click();
	String S1="Automation Demo Site";
	String S2=driver.findElement(By.xpath("//h1")).getText();
	if(S1.equals(S2))
	System.out.println("True");
	driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Iswarya");
	
	driver.findElement(By.xpath("//li[@class='ng-scope']")).click();driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("N");
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Car street");
	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("ishu@gmail.com");
	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7708712514");
	driver.findElement(By.xpath("//select[@ng-model='country']")).sendKeys("Iceland");
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	if(driver.findElement(By.xpath("//input[@value='Male']")).isSelected())
	{
	driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	}
	else
	driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
	driver.findElement(By.xpath("//select[@ng-model='yearbox']")).sendKeys("1993");
	driver.findElement(By.xpath("//select[@ng-model='monthbox']")).sendKeys("December");
	driver.findElement(By.xpath("//select[@ng-model='daybox']")).sendKeys("28");
	driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Iswarya");
	driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Iswarya");
	driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	Select Skills=new Select(driver.findElement(By.xpath("//Select[@ng-model='Skill']")));
	Skills.selectByVisibleText("C++");
	String s1=Skills.getFirstSelectedOption().getText();
	System.out.println(s1);
	}
}

