import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class auth {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to login page")
	def userNavigateToLoginPage() {
		println("\n User navigates to login page")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User click register button")
	def clickRegisterButton() {
		println("\n User click register button")
		WebUI.click(findTestObject('Auth Web/registerNavigate'))
	}

	@And("user navigate to register page")
	def navigateToRegisterPage() {
		println("\n user navigate to register page")
		WebUI.verifyElementPresent(findTestObject('Auth Web/validateOnRegister'), 0)
	}

	@And("user enter nama lengkap, email, and password")
	def enterRegister() {
		println("\n user enter nama lengkap, email, and password")
		WebUI.setText(findTestObject('Auth Web/namaLengkap'), 'Susanti')

		WebUI.setText(findTestObject('Auth Web/email'), 'susanti123@gmail.com')

		WebUI.setText(findTestObject('Auth Web/passwordRegister'), 'susanti123')
	}
	
	@And("user click register button")
	def ClickregisterButton() {
		println("\n user click register button")
		WebUI.click(findTestObject('Auth Web/registerButton'))
	}

	@Then("user navigate to login page")
	def navigateToLoginPage() {
		println("\n user navigate to login page")
		WebUI.verifyElementPresent(findTestObject('Auth Web/validateOnLogin'), 0)

		WebUI.closeBrowser()
	}
}