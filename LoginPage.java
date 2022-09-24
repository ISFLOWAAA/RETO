package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By registerButton = By.xpath("//a[@class='login']");
	By createMessage = By.xpath("//h3[contains(text(),'Create an account')]");
	By emailCreate = By.xpath("//input[@id='email_create']");
 	By buttonSubmitCreate = By.xpath("//button[@id='SubmitCreate']");
 	By mrSelect = By.cssSelector("#id_gender1");
	By firstName = By.xpath("//input[@id='customer_firstname']");
	By lastName = By.xpath("//input[@id='customer_lastname']");
	By passCreate = By.xpath("//input[@id='passwd']");
	By newlessterSelect = By.xpath("//input[@id='newsletter']");
	By optinSelect = By.xpath("//input[@id='optin']");
	By companyName = By.xpath("//input[@id='company']");
	By adressCreate = By.xpath("//input[@id='address1']");
	By adressTwoCreate = By.xpath("//input[@id='address2']");
	By cityCreate = By.xpath("//input[@id='city']");
	By stateCreate = By.xpath("//option[contains(text(),'Alabama')]");
	By postCodeCreate = By.xpath("//input[@id='postcode']");
	By textAreaCreate = By.xpath("//textarea[@id='other']");
	By phoneCreate = By.xpath("//input[@id='phone']");
	By phoneTwoCreate = By.xpath("//input[@id='phone_mobile']");
	By aliasCreate = By.xpath("//input[@id='alias']");
	By buttonPerfilCreate = By.xpath("//button[@id='submitAccount']");
	
	By registerConfirmation = By.xpath("//p[contains(text(),'Welcome to your account')]");

	
	public void registerUser () throws InterruptedException {
		
		click(registerButton);
		
		if (isDisplayed(createMessage)) {
			sendkeys("andrespija@hotmail.com", emailCreate);
			click(buttonSubmitCreate);
			Thread.sleep(3000);
			click(mrSelect);
			sendkeys("Dalid", firstName);
			sendkeys("Duque", lastName);
			sendkeys("123456789", passCreate);
			
			click(newlessterSelect);
			click(optinSelect);
			sendkeys("Choucair", companyName);
			sendkeys("Carrera 123 # 4", adressCreate);
			sendkeys("NA", adressTwoCreate);
			sendkeys("Miami", cityCreate);
			click(stateCreate);
			
			sendkeys("33101", postCodeCreate);
			sendkeys("Choucair Testing", textAreaCreate);
			sendkeys("31884660", phoneCreate);
			sendkeys("31884660", phoneTwoCreate);
			sendkeys("Choucair Testing", aliasCreate);
			click(buttonPerfilCreate);
			
		}else {
			System.out.println("Pagina de registro no encontrada");
		}
		
	}
	
	public String registerCorrectMessage () {
		
		WebElement message = findElement(registerConfirmation);
		return getText(registerConfirmation);
	}
	
	
}
