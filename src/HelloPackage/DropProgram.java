package HelloPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int llink=links.size();
		
		for(int i=0;i<llink;i++)
		{
			
		   	
			System.out.println("Nume of links we found is "+links.get(i).getText());
			
		

		}
		System.out.println("Number of links we found is "+llink);
		driver.quit();
		
		
		
		

	}

}
