package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SAIVARSHAN\\Desktop\\Jar\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://google.co.in");
	
	}

}
