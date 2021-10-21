
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
/* import org.testng.annotations.Test;  */
import org.openqa.selenium.By;
 
public class FirstTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SimitBhattacharyya\\OneDrive - iCatalyst Inc\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.144.243.162:8081/v1/docker");
		String testString = "Welcome to deployment in docker DOED TEST"; 
		
/*		String testSample =driver.findElement(By.tagName("h1")).getText(); */
		String testSample =driver.findElement(By.tagName("body")).getText();
 	
		System.out.println("Text= " +testSample);
		  if (testSample.equals(testString))
		  { 
		  System.out.println("Success");
		   System.out.println(testSample.getClass().getSimpleName());
/*		   System.exit(0);    */
		   }
		  else
			{System.out.println("Failure");
/*			System.exit(1);     */
			}
		
	}

}

