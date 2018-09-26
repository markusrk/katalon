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

WebUI.click(findTestObject('Object Repository/test_folder_2/Page_Sk i ATEKST/a_Utvidet sk'))

WebUI.setText(findTestObject('Object Repository/test_folder_2/Page_Sk i ATEKST/textarea_alle ordene_allOfTheW'), 'hydro')

WebUI.selectOptionByValue(findTestObject('Object Repository/test_folder_2/Page_Sk i ATEKST/select_20 treff per side50 tre'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/test_folder_2/Page_Sk i ATEKST/select_hele artikkelenbare ove'), 
    'searchInDocumentTeaserOnly', true)

WebUI.click(findTestObject('Object Repository/test_folder_2/Page_Sk i ATEKST/input_Endre sk_searchButtonBot'))

for (def outer_index : (0..3)) {


for (def inner_index : (0..1)) {
    WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/div_0 (1)'))

    WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Alle p siden (1)'))

    WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Neste side (1)'))
}

WebUI.click(findTestObject('test_folder_3/Page_Retriever Research hydro Sourc/i_Ingen_icon reticon-download (1)'))

WebUI.waitForElementVisible(findTestObject('test_folder_3/Page_Retriever Research hydro Sourc/iframe_concat(id(  fancybox-fr'), 
    10)

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/span_Ren tekst'))

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Vis innstillinger (1)'))

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Innholdsfortegnelse (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/select_inkludr innholdsfortegn (1)'), 
    'NO_TOC', true)

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/input_Tilbakestill_saveArticle (1)'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_supportnorgeretriever.no_fan (1)'))

WebUI.waitForAlert(4)

WebUI.click(findTestObject('test_folder_3/Page_Retriever Research hydro Sourc/div_0 (1)'))

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Ingen (1)'))

WebUI.click(findTestObject('Object Repository/test_folder_3/Page_Retriever Research hydro Sourc/a_Neste side (1)'))
}
