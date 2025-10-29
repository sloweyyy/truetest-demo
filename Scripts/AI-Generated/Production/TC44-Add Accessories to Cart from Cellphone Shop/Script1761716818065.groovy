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

"Step 2: Hover over link accessories2"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_accessories2'))

// WebUI.takeScreenshot(reportLocation + '/TC44/Step 2-Hover over link accessories2.png')

"Step 3: Click on link apple2 -> Navigate to page '/category/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_apple2'))

// WebUI.takeScreenshot(reportLocation + '/TC44/Step 3-Click on link apple2 - Navigate to page category.png')

"Step 4: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/button_addToCart3'))

// WebUI.takeScreenshot(reportLocation + '/TC44/Step 4-Click on button addToCart3.png')

"Step 5: Click on link productDetail (productDetail) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_category/link_productDetail"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_category/link_productDetail', ['link_productDetail_internalHasText': link_productDetail_internalHasText, 'link_productDetail_liNthOfType': link_productDetail_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC44/Step 5-Click on link productDetail productDetail - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC44-Add Accessories to Cart from Cellphone Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}