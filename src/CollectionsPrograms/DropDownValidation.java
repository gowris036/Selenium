package CollectionsPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValidation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		Select slt=new Select(car);
		
		List<WebElement> listoptions=slt.getOptions();
		
		for(WebElement sltcar:listoptions)
			
			sltcar.getText();
		
		List <String> listcar=new ArrayList<>();
		
		listcar.add("Opel");
		listcar.add("Saab");
		listcar.add("Volvo");
		listcar.add("Audi");
		
		Collections.sort(listcar,Collections.reverseOrder());
		for(String expected:listcar)
		//	System.out.println(expected);
		
		for(int i=0;i<listcar.size();i++)
		
		{
		    if(listoptions.get(i).getText().equals(listcar.get(i)))
		    		{
	                    System.out.println("Both are matching " +"  " +"Actual "+listoptions.get(i).getText() + "  Expected values "+listcar.get(i));	    	
		    		}
			
		    else
		    	System.out.println("matching not found ");
		}	
		
		
		driver.quit();

	}

}
