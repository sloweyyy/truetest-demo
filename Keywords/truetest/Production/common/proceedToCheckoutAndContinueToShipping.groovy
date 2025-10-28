package truetest.Production.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class proceedToCheckoutAndContinueToShipping {
    
    private static def execute(String input_email) {
        
        "Step 1: Click on link placeOrder2 -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_placeOrder2'))
        
        "Step 2: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/button_proceedToCheckout'))
        
        "Step 3: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'))
        
        "Step 4: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'), input_email)
        
        "Step 5: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/button_continueToShipping'))
    }
}

