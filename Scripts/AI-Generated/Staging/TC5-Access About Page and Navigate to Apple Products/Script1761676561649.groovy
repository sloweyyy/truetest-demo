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

"Step 2: Click on link about2 -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_about2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link about2 - Navigate to page about.png')

"Step 3: Hover over span object"

WebUI.mouseOver(findTestObject('AI-Generated/Staging/Page_about/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Hover over span object.png')

"Step 4: Click on link apple -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_about/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link apple - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Access About Page and Navigate to Apple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}