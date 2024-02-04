package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigationAPI {

	public static void main(String[] args) {
		//Open the chrome driver and launches the Chrome Browser
	WebDriver driver=new ChromeDriver();
		//maximize the browser window 
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//Navigation
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		//driver.quit();
	}}