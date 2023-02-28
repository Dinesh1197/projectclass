package projectclass1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
WebElement escape = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		escape.click();
		
		WebElement serachiphone = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		
		serachiphone.sendKeys("Iphone14");
		
		WebElement btnserach = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
		btnserach.click();
		
		
		List<WebElement> iphonename = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(int i=0; i<iphonename.size();i++) {
			
			System.out.println(iphonename.get(i).getText());
		}
		
List<WebElement> iphoneprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i<iphoneprice.size();i++) {
			
			System.out.println(iphoneprice.get(i).getText());
		}

	}

}
