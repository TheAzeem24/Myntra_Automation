package com.virtusa.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.virtusa.utility.ExcelUtility;

public class TC_Myntra_02 extends TestBase
{
	@Test(priority = 1,dataProvider = "login")
	public void login(String input,String pswd) throws InterruptedException
	{
		WebElement profile = myntra.getProfile();
		act.moveToElement(profile).build().perform();
		myntra.getsignUp().click();
		String title = driver.getCurrentUrl();

		if (title.contains("login")) {
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
	@DataProvider
	public String[][] login() throws IOException {

		String xlPath = "C:\\Users\\Anjali Bodige\\eclipse-workspace\\Mynta\\src\\test\\java\\com\\virtusa\\testData\\invalidData.xlsx";
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
