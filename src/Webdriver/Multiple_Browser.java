package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Browser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
// get the URL
		driver.get("https://www.mycontactform.com/samples.php");
		//to pprint title in console
		System.out.println(driver.getTitle());
		
//maximize the screen
		driver.manage().window().maximize();
		//textbox
		driver.findElement(By.id("subject")).sendKeys("email");
		driver.findElement(By.id("email")).sendKeys("eshita05@gmail.com");
		driver.findElement(By.id("q1")).sendKeys("abcde");
		
		//checkbox
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();

		//dropdown
		WebElement ele=driver.findElement(By.id("q3"));
		Select s=new Select(ele);
		s.selectByVisibleText("Third Option");
		driver.close();           //active tab close
		//driver.quit(); -----------entire browser close
	}

}
