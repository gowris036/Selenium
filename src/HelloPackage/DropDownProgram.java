package HelloPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement car=driver.findElement(By.xpath("//select[@id='cars']"));
		Select selcar=new Select(car);
		selcar.selectByIndex(1);
		Thread.sleep(5000);
		selcar.selectByValue("opel");
		selcar.selectByVisibleText("Audi");
		List <WebElement> listcar = selcar.getOptions();
		int op = listcar.size();
		
		for(WebElement s:listcar)
		{
			System.out.println("Actual Result "+s.getText());
			
	//	System.out.println(s.getAttribute("value"));
				
		}
		List <String> templist = new ArrayList<>();
		 templist.add("Volvo");
		 templist.add("Audi");
		 templist.add("Opel");
		 templist.add("Saab");
		 
		 Collections.sort(templist,Collections.reverseOrder());
		 		 	 
		 for(String str:templist)
		 			 
			 System.out.println("Expected values "+ str);
			 
		 
		 for(int i=0;i<op;i++)
		 {
			 if(listcar.get(i).getText().equals(templist.get(i)))
			 {
				 System.out.println("both are matching");
				 
			 }
			 else
				 System.out.println("not matching");
		 }
		 
		 driver.quit();
	}

}
