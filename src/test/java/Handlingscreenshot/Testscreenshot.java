package Handlingscreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Testscreenshot {
	public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	//1.step
		TakesScreenshot ts=(TakesScreenshot) driver;
		
  //2.and 3. step
		File temppath = ts.getScreenshotAs(OutputType.FILE);
		
//4.Step
		File permanentpath = new File("./src/test/resources/test/Testscreenshot/Screenshot.png");
		try {
			FileHandler.copy(temppath, permanentpath);
			}
		catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println("Screenshot taken");
			
		}
}


