package accounts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Rolex_Test {
	
	@Test(groups = "Watch")
	public void Explore() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolex.com/en-us/");
		Thread.sleep(2000);
		driver.close();
	}

}
