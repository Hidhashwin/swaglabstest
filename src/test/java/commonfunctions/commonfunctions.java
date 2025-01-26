package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonfunctions {
	
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public Properties loadpropertyfile() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		
		return properties;
	    }
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchbrowser() throws IOException, InterruptedException {
		loadpropertyfile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//screen capture
		takingscreenshot.takeScreenshot(driver, "homepage");
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
