import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://web.retriever-info.com/services/archive.html?')

WebUI.click(findTestObject('test_folder_2/Page_Sk i ATEKST/a_Utvidet sk'))

WebUI.setText(findTestObject('test_folder_2/Page_Sk i ATEKST/textarea_alle ordene_allOfTheW'), 'hydro')

WebUI.selectOptionByValue(findTestObject('test_folder_2/Page_Sk i ATEKST/select_20 treff per side50 tre'), '100', true)

WebUI.selectOptionByValue(findTestObject('test_folder_2/Page_Sk i ATEKST/select_hele artikkelenbare ove'), 'searchInDocumentTeaserOnly', 
    true)

WebUI.click(findTestObject('test_folder_2/Page_Sk i ATEKST/input_Endre sk_searchButtonBot'))

for (def index : (0..5)) {
}

WebUI.click(findTestObject('Object Repository/test_folder_2/Page_Retriever Research hydro Sourc/div_0'))

WebUI.click(findTestObject('Object Repository/test_folder_2/Page_Retriever Research hydro Sourc/a_Alle p siden'))

WebUI.click(findTestObject('Object Repository/test_folder_2/Page_Retriever Research hydro Sourc/a_Neste side'))

