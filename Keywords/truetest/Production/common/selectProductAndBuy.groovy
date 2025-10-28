package truetest.Production.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProductAndBuy {
    
    private static def execute() {
        
        "Step 1: Click on link apple -> Navigate to page '/category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_apple'))
        
        "Step 2: Click on link iPhone16e -> Navigate to page '/product/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_iPhone16e'))
        
        "Step 3: Click on label colorBlack2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/label_colorBlack2'))
        
        "Step 4: Click on label storage256Gb2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/label_storage256Gb2'))
        
        "Step 5: Click on button buy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/button_buy2'))
    }
}

