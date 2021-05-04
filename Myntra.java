package com.virtusa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra 
{
	WebDriver driver;

	//constructor
	public Myntra(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div[2]/div[2]/div[1]/div[1]/span[1]")
	WebElement profile;
	public WebElement getProfile()
	{
		return profile;
	}
	
	@FindBy(className = "desktop-linkButton")
	WebElement signUp;
	public WebElement getsignUp()
	{
		return signUp;
	}
	
	@FindBy(xpath = "//input[@id='']")
	WebElement loginField;
	public WebElement getLoginField()
	{
		return loginField;
	}
	
	@FindBy(xpath = "//div[contains(text(),'CONTINUE')]")
	WebElement continueBtn;
	public WebElement getContinueBtn()
	{
		return continueBtn;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Password')]")
	WebElement usingPswd;
	public WebElement getUsingPswd()
	{
		return usingPswd;
	}
	
	@FindBy(xpath = "//input[@id='']")
	WebElement pswdField;
	public WebElement getPswdField()
	{
		return pswdField;
	}
	
	@FindBy(xpath = "//button[@id='']")
	WebElement loginBtn;
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	
	@FindBy(xpath = "//header/div[2]/div[3]/input[1]")
	WebElement searchItems;
	public WebElement getSearchItems()
	{
		return searchItems;
	}
	
	@FindBy(xpath = "//header/div[2]/div[3]/a[1]/span[1]")
	WebElement searchBtn;
	public WebElement getsearchBtn()
	{
		return searchBtn;
	}
	
	@FindBy(xpath = "//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]")
	WebElement item;
	public WebElement getItem()
	{
		return item;
	}
	
	@FindBy(xpath = "//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[2]/div[1]")
	WebElement sizeSelection;
	public WebElement getSizeSelection()
	{
		return sizeSelection;
	}
	
	@FindBy(xpath = "//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]/div[1]/div[1]")
	WebElement addToCartBtn;
	public WebElement getAddToCartBtn()
	{
		return addToCartBtn;
	}
	
	@FindBy(xpath = "//header/div[2]/div[2]/a[2]/span[1]")
	WebElement bag;
	public WebElement getBag()
	{
		return bag;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Place Order')]")
	WebElement placeOrderBtn;
	public WebElement getPlaceOrderBtn()
	{
		return placeOrderBtn;
	}
	
	@FindBy(id = "placeOrderButton")
	WebElement continueButton;
	public WebElement getContinueButton()
	{
		return continueButton;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Logout')]")
	WebElement logout;
	public WebElement getLogout()
	{
		return logout;
	}
}
