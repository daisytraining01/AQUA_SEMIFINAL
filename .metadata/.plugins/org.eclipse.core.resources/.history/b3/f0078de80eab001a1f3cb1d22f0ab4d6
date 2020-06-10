package Testng.TestngProject;

	
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import java.net.MalformedURLException;
	import java.net.URL;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class Wordpressnew {

	  private AndroidDriver driver;

	  @BeforeMethod
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		  desiredCapabilities.setCapability("deviceName", "Mi A1");
		  desiredCapabilities.setCapability("udid", "33c041340704");
		  desiredCapabilities.setCapability("platformName", "Android");
		  desiredCapabilities.setCapability("platformVersion", "9");
		  desiredCapabilities.setCapability("automationName", "UiAutomator1");
		  desiredCapabilities.setCapability("appPackage",
		  "com.google.android.apps.maps");
		  desiredCapabilities.setCapability("appActivity",
		  "com.google.android.maps.MapsActivity");
		  
		  URL remoteUrl = new URL("http://localhost:4723/wd/hub"); driver = new
		  AndroidDriver(remoteUrl, desiredCapabilities);
		 	
		/*
		 * dc.setCapability("testName", "Maheswari_Maps"); String accessKey=
		 * "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
		 * dc.setCapability("accessKey", accessKey); dc.setCapability("deviceQuery",
		 * "@os='android' and @category='PHONE'"); //
		 * dc.setCapability(MobileCapabilityType.APP,
		 * "cloud:com.experitest.ExperiBank/.LoginActivity");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "com.google.android.apps.maps");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MapsActivity");
		 * driver = new AndroidDriver<>(new URL("https://localhost:4723/wd/hub"), dc);
		 */
	  }

	  @Test
	  public void sampleTest() throws Exception {
	    MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Directions\"]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[1]/android.widget.LinearLayout/android.widget.TextView");
	    el2.click();
	    Thread.sleep(3000);
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text");
	    el3.sendKeys("Chennai Central");
	    Thread.sleep(4000);
	    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[2]/android.widget.LinearLayout");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text");
	    el6.sendKeys("CMBT");
	    Thread.sleep(4000);
	    MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout");
	    el8.click();
	    MobileElement el9 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/details_content");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Show next");
	    el10.click();
	    Thread.sleep(3000);
	    MobileElement el11 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Overflow menu\"]/android.widget.ImageView");
	    el11.click();
	    Thread.sleep(3000);
	    MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox");
	    el12.click();
	    Thread.sleep(3000);
	  }

	  @AfterMethod
	public void tearDown() {
		  System.out.println("Map Application launched successfully");
	    driver.quit();
	  }
	}

