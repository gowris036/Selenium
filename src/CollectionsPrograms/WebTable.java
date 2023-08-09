package CollectionsPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	driver.manage().window().maximize();
	
	//List<WebElement> tr=driver.findElements(By.tagName("tr"));
	//List<WebElement> td=driver.findElements(By.tagName("td"));
	
	List<WebElement> tr=driver.findElements(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr/th"));
	List<WebElement> td=driver.findElements(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]"));

	int trlen=tr.size();
	int tdlen=td.size();
	
	for(int i=1;i<=trlen-1;i++)
	{
		for(int j=1;j<=tdlen-1;j++)
		{
			WebElement value=driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]"));
			String stringvalue=value.getText();
			if(stringvalue.equals("Joe Root"))
				
			{
				System.out.println("Joe Root is found");
			
				break;
			}
			
			
		}
		System.out.println("Joe Root is not found");
	}

	System.out.println(trlen);
	System.out.println(trlen);

	
	driver.quit();
	
	}
      
}
