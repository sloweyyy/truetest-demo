import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Production.common.fillShippingDetailsAndContinueToPayment
import truetest.Production.common.proceedToCheckoutAndContinueToShipping
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

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 2-Click on button object.png')

"Step 3: Hover over link bestChoice"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_bestChoice'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 3-Hover over link bestChoice.png')

"Step 4: Navigate to cart and continue to shipping information."

proceedToCheckoutAndContinueToShipping.execute(input_email)

"Step 5: Fill in shipping details and proceed to payment page."

fillShippingDetailsAndContinueToPayment.execute(input_city, input_firstName, input_lastName, input_phone, input_shippingAddress, input_state, input_zipCode)

"Step 6: Click on button completeOrder -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 6-Click on button completeOrder - Navigate to page thank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Complete Order with Shipping Information in Cellphone Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}