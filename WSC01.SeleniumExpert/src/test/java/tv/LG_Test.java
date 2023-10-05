package tv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LG_Test {
	
	@Test(groups = "TV")
	public void OpenLG() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lg.com/uk/");
		Thread.sleep(2000);
		driver.close();
	}

}
