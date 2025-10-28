package truetest.Production.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingDetailsAndContinueToPayment {
    
    private static def execute(String input_city, String input_firstName, String input_lastName, String input_phone, String input_shippingAddress, String input_state, String input_zipCode) {
        
        "Step 1: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'))
        
        "Step 2: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'), input_firstName)
        
        "Step 3: Press key Tab on input firstName"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))
        
        "Step 4: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName'), input_lastName)
        
        "Step 5: Press key Tab on input lastName"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))
        
        "Step 6: Enter input value in input shippingAddress"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_shippingAddress'), input_shippingAddress)
        
        "Step 7: Press key Tab on input shippingAddress"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_shippingAddress'), Keys.chord(Keys.TAB))
        
        "Step 8: Enter input value in input zipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode'), input_zipCode)
        
        "Step 9: Press key Tab on input zipCode"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))
        
        "Step 10: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city'), input_city)
        
        "Step 11: Press key Tab on input city"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))
        
        "Step 12: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state'), input_state)
        
        "Step 13: Press key Tab on input state"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state'), Keys.chord(Keys.TAB))
        
        "Step 14: Enter input value in input phone"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_phone'), input_phone)
        
        "Step 15: Click on button continueToPayment2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/button_continueToPayment2'))
    }
}

