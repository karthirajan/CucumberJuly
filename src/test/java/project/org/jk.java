package project.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jk {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\SeleniumProjectTask\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement soundar=driver.findElement(By.id("email"));
		WebElement soundar1=driver.findElement(By.id("pass"));
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value',soundar)", soundar);
		jk.executeScript("arguments[0].setAttribute('value',soundar1)", soundar);
		
		
	}

}
