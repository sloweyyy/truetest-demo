import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Production.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link iPhone15ClearCase -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_iPhone15ClearCase'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 2-Click on link iPhone15ClearCase - Navigate to page product.png')

"Step 3: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 3-Click on button buy.png')

"Step 4: Hover over button increase"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_product/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 4-Hover over button increase.png')

"Step 5: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 5-Click on link placeOrder - Navigate to page cart.png')

"Step 6: Click on button proceedToCheckout -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 6-Click on button proceedToCheckout - Navigate to page checkoutpayment.png')

"Step 7: Click on button completeOrder -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC39/Step 7-Click on button completeOrder - Navigate to page thank-you.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC39-Purchase iPhone 15 Clear Case and Complete Order in Cellphone Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}