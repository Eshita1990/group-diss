package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationAPI_Cw {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.mycontactform.com/features.php");
		String st=driver.getTitle();
		System.out.println(st);
		driver.close();
		//driver.quit();
		
	}

}
