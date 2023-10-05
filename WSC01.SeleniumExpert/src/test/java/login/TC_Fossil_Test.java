package login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Fossil_Test {
	
	@Test(groups = "Watch")
	public void Fossil() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/en-gb/");
		Thread.sleep(2000);
		driver.close();
		
	}


}
