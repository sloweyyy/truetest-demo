import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Staging.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over link accessories"

WebUI.mouseOver(findTestObject('AI-Generated/Staging/Page_home/link_accessories'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link accessories.png')

"Step 3: Click on link apple2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_apple2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link apple2 - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Browse Accessories and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}