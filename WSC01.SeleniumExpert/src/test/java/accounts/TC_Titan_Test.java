package accounts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Titan_Test {

	@Test(groups = "Watch")
	public void next() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.titan.co.in/");
		Thread.sleep(2000);
		driver.close();

		
	}
}
