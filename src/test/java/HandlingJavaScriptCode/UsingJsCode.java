package HandlingJavaScriptCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJsCode {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
	JavascriptExecutor jsobj = (JavascriptExecutor)driver;
	//Navigate
	jsobj.executeScript("window.location=arguments[0]","https://automationexercise.com/");
	
	//Refresh
	jsobj.executeScript("history.go(0)");
	//Title
	System.out.println("return document.title");
	//Fetch Url
	System.out.println("return document.URL");
	
	//click
	jsobj.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("Login")));
	jsobj.executeScript("arguments[0].value='veni'",driver.findElement(By.name("name")));
	jsobj.executeScript("arguments[0].value='Veni@gmail.com'", driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")));
	jsobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")));
	
	//Change mail Disabled element
	jsobj.executeScript("arguments[0].value='krishna@gmail.com'", driver.findElement(By.id("email")));
	
	//Scrolling
	jsobj.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//b[text()='Address Information']")));
	
	//Scroll by consider,the previous points and scroll from there
	jsobj.executeScript("window.scrollBy(0,300)"); //Y for vertical X for Horizontal
	
	//Scroll To Always start from the origin
	jsobj.executeScript("window.scrollTo(0,300)");
	System.out.println("Handling jscode");
	}

}
