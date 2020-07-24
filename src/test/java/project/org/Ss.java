package project.org;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\SeleniumProjectTask\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot soundar= (TakesScreenshot)driver;
	File s=	soundar.getScreenshotAs(OutputType.FILE);
		File p=new File("C:\\Users\\Acer\\workspace\\SeleniumProjectTask\\chrome\\soundar.png");
		FileUtils.copyFile(s, p);
		
	}

}
