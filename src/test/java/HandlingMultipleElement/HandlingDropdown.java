package HandlingMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	
	//1.Identify the Element--->Dropdown
	WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));
	
	//2.
	Select selectobj = new Select(dropdown);
	
	//3.
	boolean Status = selectobj.isMultiple();
	
	if(Status) {
		System.out.println("It is Multiple Select Dropdown");
	} else {
		System.out.println("It is single Select Dropdown");
	System.out.println("-----------");	
		
	
//Selection Using Index
	selectobj.selectByIndex(10);
	Thread.sleep(3000);
	
	selectobj.selectByValue("search-alias=popular");
	Thread.sleep(3000);
	
//Get Option
	List<WebElement> alloptions = selectobj.getOptions();
	for(int i=0;i<alloptions.size();i++)
	{
		System.out.println(alloptions.get(i).getText());
	}
		System.out.println("count:" +alloptions.size());
	}
	}
}

