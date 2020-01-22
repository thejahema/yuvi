import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		WebElement u = dr.findElement(By.id("email"));
		u.sendKeys("791281082");
		WebElement p = dr.findElement(By.id("pass"));
		p.sendKeys("8u9uihs");
		WebElement l = dr.findElement(By.id("loginbutton"));
		l.click();
		dr.close();
		
			
		
	}
}
