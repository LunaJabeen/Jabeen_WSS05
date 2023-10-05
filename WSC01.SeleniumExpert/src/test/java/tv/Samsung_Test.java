package tv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Samsung_Test {
	@Test(groups = "TV")
	public void OpenSamsung() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.samsung.com/uk/tvs/all-tvs/");
	Thread.sleep(2000);
	driver.close();
	
	
	}

}
