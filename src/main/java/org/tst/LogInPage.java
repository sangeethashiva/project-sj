package org.tst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tst.BaseClass;

public class LogInPage extends BaseClass{
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="Inpatient Ward")
	private WebElement patient;
	
	@FindBy(id="loginButton")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getPatient() {
		return patient;
	}
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//a[3]")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}
	
	@FindBy(xpath="//span[text()='Name']")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}

	@FindBy(name="givenName")
	private WebElement givenName;

	public WebElement getGivenName() {
		return givenName;
	}
	
	@FindBy(name="middleName")
	private WebElement middleName;

	public WebElement getMiddleName() {
		return middleName;
	}
	
	@FindBy(name="familyName")
	private WebElement familyName;

	public WebElement getFamilyName() {
		return familyName;
	}
	
//	public WebElement getGender() {
//		return gender;
//	}
//	
//	@FindBy(id="genderLabel")
//	private WebElement gender;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next0;

	public WebElement getNext() {
		return next0;
	}
	
	@FindBy(xpath="//option[contains(text(),'Female')]")
	private WebElement female;

	public WebElement getFemale() {
		return female;
	}
	
	@FindBy(xpath="//button[@type='button'][2]")
	private WebElement next1;

	public WebElement getNext1() {
		return next1;
	}
	
	@FindBy(id="birthdateDay-field")
	private WebElement day;
	
	@FindBy(id="birthdateMonth-field")
	private WebElement month;
	
	@FindBy(name="birthdateYear")
	private WebElement year;

	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	
	@FindBy(xpath="//button[@class='confirm right']")
	private WebElement next2;

	public WebElement getNext2() {
		return next2;
	}
	
	@FindBy(id="address1")
	private WebElement address1;

	public WebElement getAddress1() {
		return address1;
	}
	
	@FindBy(id="address2")
	private WebElement address2;

	public WebElement getAddress2() {
		return address2;
	}
	
	@FindBy(id="cityVillage")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}
	
	@FindBy(id="stateProvince")
	private WebElement state;

	public WebElement getState() {
		return state;
	}
	
	@FindBy(id="country")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(id="postalCode")
	private WebElement postalcode;

	public WebElement getPostalcode() {
		return postalcode;
	}
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next3;

	public WebElement getNext3() {
		return next3;
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phoneno;

	public WebElement getPhoneno() {
		return phoneno;
	}
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next4;

	public WebElement getNext4() {
		return next4;
	}
	
	@FindBy(name="relationship_type")
	private WebElement relationshiptype;
	
	public WebElement getRelationshiptype() {
		return relationshiptype;
	}

	@FindBy(xpath="//select[@id='relationship_type']")
	private WebElement sibling;
	
	public WebElement getSibling() {
		return sibling;
	}
	

	@FindBy(xpath="//input[@placeholder='Person Name']")
	private WebElement personName;

	public WebElement getPersonName() {
		return personName;
	}
	
//	@FindBy(xpath="//button[2]")
//	private WebElement next5;
//
//	public WebElement getNext5() {
//		return next5;
//	}
	
	@FindBy(id="//input[@class='submitButton confirm right focused']")
	private WebElement confirm;
	
//	@FindBy(xpath="//input[@class='submitButton confirm right focused']")
//	private WebElement confirm;
//
//	public WebElement getConfirm() {
//		return confirm;
//	}
	
	public WebElement getConfirm() {
		return confirm;
	}

	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement confirming;

	public WebElement getConfirming() {
		return confirming;
	}
	
	@FindBy(xpath="//span[contains(text(),'100JCL')]")
	private WebElement patientid;

	public WebElement getPatientid() {
		return patientid;
	}
	
	
	
	
}
