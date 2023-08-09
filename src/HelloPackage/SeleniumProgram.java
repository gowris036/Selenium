package HelloPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
    	
	//System.setProperty("webdriver.edge.driver", "D:\\SeleniumWorkSpace\\Selenium_ Project\\msedgedriver");

    	WebDriverManager.chromedriver().setup();
    	
       // Create a new instance of the ChromeDriver
    	
        WebDriver driver = new ChromeDriver();
      //  Thread.sleep(10000);
        
        // Your test automation code here...
        
        driver.get("https://mbasic.facebook.com");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("gowris036@gmail.com");
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[2]/div[1]/div[2]/form[1]/ul[1]/li[2]/section[1]/input[1]")).sendKeys("Bangalore@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[2]/div[1]/div[2]/form[1]/ul[1]/li[3]/input[1]")).click();
          Thread.sleep(5000);
               
     //   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='image'][1]")).click();
     //   Thread.sleep(5000);
        
    //    driver.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();
        Thread.sleep(5000);
        
       
        // Close the browser
        driver.quit();
    }
}
