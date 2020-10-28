import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('app.statflo.com')

WebUI.setText(findTestObject('Object Repository/Page_Login  Statflo/input_Email_username'), 'eric@statflo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Statflo/input_Forgot Password_password'), 'Aopk/MjAlo5/xta9yiC+Jw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login  Statflo/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Howdy Eric - Statflo/div_3157 accounts left to goal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Smart Lists - Statflo/select_AllCAR-1CAR-2Cell BrokerageDefaultGo_d3e1f8'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Smart Lists - Statflo/select_AllAKD1CTXD1CTXD2SCAD1SCAD2SCAD3SCAD_083c2e'), 
    '152', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Smart Lists - Statflo/select_October 2020September 2020August 202_d12fc1'), 
    '2020-09', true)

WebUI.click(findTestObject('Object Repository/Page_Smart Lists - Statflo/a_Apply'))

WebUI.closeBrowser()

