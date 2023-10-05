package tv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sony_Test {
	
	@Test(groups = "TV")
	public void OpenSony() throws InterruptedException
	{		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sony.co.uk/bravia");
		Thread.sleep(2000);
		driver.close();
	}

}
