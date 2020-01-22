import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yuvi 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		
		WebDriver tt = new ChromeDriver();
		
		tt.get("https://www.facebook.com/");
	}
}
