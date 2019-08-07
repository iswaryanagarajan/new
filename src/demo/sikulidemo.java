package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikulidemo {

	public static void main(String[] args) throws FindFailed {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAIVARSHAN\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/");
	driver.manage().window().maximize();
	Screen S = new Screen();
	Pattern p =new Pattern("C:\\Users\\SAIVARSHAN\\Desktop\\Sikuli\\signin.PNG");
	S.click(p);
	}

}
