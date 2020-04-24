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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\ACC Perfect 1.6.3 Dev.apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), npk, 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.View0 - Icon'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - password'), password, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - SIGN IN'), 0)

if (expected == 'pass') {
    Mobile.verifyElementVisible(findTestObject('android.view.View0 - Icon'), 0)

    Mobile.verifyElementVisible(findTestObject('android.view.View0 - Main'), 0)

    Mobile.verifyElementVisible(findTestObject('android.view.View0 - Performance'), 0)

    Mobile.verifyElementVisible(findTestObject('android.view.View0 - PMHome'), 0)

    Mobile.verifyElementVisible(findTestObject('android.view.View0 - ChatList'), 0)

    Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)
} else if (expected == 'fail') {
    Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

    if (fail == 'input salah') {
        Mobile.verifyElementVisible(findTestObject('android.view.View0 - NPK danatau Password yang dimasukkan salah'), 0)
    } else if (fail == 'input kosong') {
        Mobile.verifyElementVisible(findTestObject('android.view.View0 - Kolom NPK danatau Password masih kosong'), 0)
    }
    
    Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

