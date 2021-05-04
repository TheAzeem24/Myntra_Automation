package com.virtusa.testCases;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.virtusa.webpages.Myntra;


public class TestBase {
	WebDriver driver;
	
	Myntra myntra;
	Actions act;
	JavascriptExecutor js;
	@Parameters({"browser","url"})
	@BeforeClass
	public void setUp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Anjali Bodige\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Anjali Bodige\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		myntra = new Myntra(driver);
		act = new Actions(driver);
		driver.get(url);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
