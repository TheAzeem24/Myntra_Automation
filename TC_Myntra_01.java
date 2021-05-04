package com.virtusa.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.virtusa.utility.ExcelUtility;

public class TC_Myntra_01 extends TestBase {
	@Test(priority = 1, dataProvider = "loginData")
	public void login(String input, String pswd) throws InterruptedException {
		WebElement profile = myntra.getProfile();
		act.moveToElement(profile).build().perform();
		myntra.getsignUp().click();
		String title = driver.getCurrentUrl();

		if (title.contains("login"))
		{
			myntra.getLoginField().sendKeys(input);
			myntra.getContinueBtn().click();
			Thread.sleep(2000);
			myntra.getUsingPswd().click();
			Thread.sleep(2000);
			myntra.getPswdField().sendKeys(pswd);
			Thread.sleep(2000);
			myntra.getLoginBtn().click();
			Thread.sleep(2000);
		}
	}

	@Test(priority = 2, dataProvider = "searchItemData")
	public void searchItems(String input) throws InterruptedException {
		myntra.getSearchItems().sendKeys(input);
		Thread.sleep(2000);
		myntra.getsearchBtn().click();
		myntra.getItem().click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void addToCart() throws InterruptedException {
		String wind = "";
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> iterator = windowHandle.iterator();
		while (iterator.hasNext()) {
			wind = iterator.next();
		}
		driver.switchTo().window(wind);
		Thread.sleep(2000);
		myntra.getSizeSelection().click();
		Thread.sleep(2000);
		myntra.getAddToCartBtn().click();
		Thread.sleep(2000);
		myntra.getBag().click();
		Thread.sleep(2000);
		myntra.getPlaceOrderBtn().click();
		Thread.sleep(1000);
		myntra.getContinueButton().click();
	}

	@Test(priority = 4)
	public void logout() throws InterruptedException
	{
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(1000);
		WebElement profile = myntra.getProfile();
		Thread.sleep(2000);
		act.moveToElement(profile).build().perform();
		Thread.sleep(2000);
		myntra.getLogout().click();
	}

	@DataProvider
	public String[][] loginData() throws IOException {

		String xlPath = "C:\\Users\\Anjali Bodige\\eclipse-workspace\\Mynta\\src\\test\\java\\com\\virtusa\\testData\\loginData.xlsx";
		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}

		return data;
	}

	@DataProvider
	public String[][] searchItemData() throws IOException {

		String xlPath = "C:\\Users\\Anjali Bodige\\eclipse-workspace\\Mynta\\src\\test\\java\\com\\virtusa\\testData\\searchItmes.xlsx";
		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}

		return data;
	}

}
