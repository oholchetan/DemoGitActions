package mvnproj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class verifytitle {
	
	
	
	@Test
	public void verifytitle() {
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--headless");
		options.addArguments("--no sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
	WebDriver driver= new ChromeDriver(options);
	
	driver.get("https://omayo.blogspot.com/");
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	Assertions.assertEquals("omayo (QAFox.com)",title,"Ttitle not matched");
	
	
	
	}

}
