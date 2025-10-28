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

"Step 2: Click on button object"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on button object.png')

"Step 3: Hover over link bestChoice"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_bestChoice'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Hover over link bestChoice.png')

"Step 4: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link placeOrder - Navigate to page cart.png')

"Step 5: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 6: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on input email.png')

"Step 7: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Enter input value in input email.png')

"Step 8: Click on button continueToShipping -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on button continueToShipping - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Place Order for Best Choice Product in Cellphone Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}