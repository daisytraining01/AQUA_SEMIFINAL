package newword1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

public class wordnewpress {
	static String path = System.getProperty("user.dir");

	private static AndroidDriver driver;

	public static void screenshot(String s) {
		try {
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			TakesScreenshot screen = ((TakesScreenshot) driver);
			File SrcFile = screen.getScreenshotAs(OutputType.FILE);
			File despath = new File(path + "/Screenshots/" + s + timestamp + ".jpg");
			FileUtils.copyFile(SrcFile, despath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		  desiredCapabilities.setCapability("deviceName", "Mi A1");
		  desiredCapabilities.setCapability("udid", "33c041340704");
		  desiredCapabilities.setCapability("platformName", "Android");
		  desiredCapabilities.setCapability("platformVersion", "9");
		  desiredCapabilities.setCapability("automationName", "UiAutomator1");
		  desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
		  desiredCapabilities.setCapability("appActivity",
		  "org.wordpress.android.ui.posts.PostsActivity");
		  
		  URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		  
		  driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		 

		/*
		 * DesiredCapabilities dc = new DesiredCapabilities();
		 * dc.setCapability("testName", "Maheswari"); String accessKey=
		 * "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
		 * dc.setCapability("accessKey", accessKey); dc.setCapability("deviceQuery",
		 * "@os='android' and @category='PHONE'");
		 * dc.setCapability(MobileCapabilityType.APP,
		 * "cloud:com.experitest.ExperiBank/.LoginActivity");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "org.wordpress.android");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		 * "org.wordpress.android.ui.posts.PostsActivity"); driver = new
		 * AndroidDriver<>(new URL("https://demo.experitest.com/wd/hub"), dc);
		 */
	}

	@Test(priority = 1)
	public void Mycode() throws Exception {
		MobileElement el1 = (MobileElement)

		driver.findElementById("org.wordpress.android:id/create_site_button");
		el1.click();
		Thread.sleep(4000);
		try {
			MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
			el2.click();
		} catch (Exception e) {

			System.err.println("Element not found");
		} finally {
			screenshot("Homepage1");
		}

		Thread.sleep(4000);
		try {
			MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			el3.click();
		} catch (Exception e) {

			System.err.println("Element not found");
		} finally {
			screenshot("Homepage1");
		}

		Thread.sleep(4000);
		try {
			MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
			el4.click();
		} catch (Exception e) {

			System.err.println("Element not found");
		} finally {
			screenshot("Homepage1");
		}

		Thread.sleep(4000);
		try {
			MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			el5.sendKeys("susilamaheswari@gmail.com");
			String s1 = el5.getText();
			String s2 = "susilamaheswari@gmail.com";
			AssertJUnit.assertEquals(s2, s1);
			System.out.println("Actual :" + s1);

		} catch (Exception e) {

			System.err.println("Element not found");
		} finally {
			screenshot("Homepage1");
		}

		Thread.sleep(4000);
		System.out.println("Sigin in with email");
		try {
			MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
			el6.click();
		} catch (Exception e) {

			System.err.println("Element not found");
		} finally {
			screenshot("Homepage1");
		}

		Thread.sleep(4000);
		MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
		el7.click();
		Thread.sleep(4000);
		MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		el8.sendKeys("Monika10#");
		System.out.println("password given");
		Thread.sleep(4000);
		MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		el9.click();
		Thread.sleep(4000);
		MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		el10.click();
		Thread.sleep(4000);
		MobileElement el11 = (MobileElement) driver
				.findElementByAccessibilityId("Reader. Follow content from other sites.");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementByXPath(
				"//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
		el12.click();
		Thread.sleep(4000);
		MobileElement el13 = (MobileElement) driver.findElementById("org.wordpress.android:id/filter_list_button");
		el13.click();
		Thread.sleep(4000);
		System.out.println("Filtering the reader");
		MobileElement el14 = (MobileElement) driver.findElementByXPath(
				"//android.widget.LinearLayout[@content-desc=\"Select a Tag or Site, Pop Up Window\"]/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		el14.click();
		Thread.sleep(4000);
		MobileElement el15 = (MobileElement) driver.findElementByXPath(
				"//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"discover\"]/android.widget.TextView");
		el15.click();
		Thread.sleep(4000);
		MobileElement el16 = (MobileElement) driver.findElementByXPath(
				"//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"likes\"]/android.widget.TextView");
		el16.click();
		Thread.sleep(4000);
		MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("saved");
		el17.click();
		Thread.sleep(4000);
		MobileElement el18 = (MobileElement) driver.findElementByXPath(
				"(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[3]");
		el18.click();
		Thread.sleep(4000);
		MobileElement el19 = (MobileElement) driver.findElementByXPath(
				"//android.widget.LinearLayout[@content-desc=\"My Site. View your site and manage it, including stats.\"]");
		el19.click();
		Thread.sleep(4000);
		MobileElement el20 = (MobileElement) driver.findElementByXPath(
				"(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
		el20.click();
		Thread.sleep(4000);
		MobileElement el21 = (MobileElement) driver.findElementByXPath(
				"//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"discover\"]/android.widget.TextView");
		el21.click();

		MobileElement el22 = (MobileElement) driver
				.findElementByAccessibilityId("Reader. Follow content from other sites.");
		el22.click();
		Thread.sleep(4000);
		MobileElement el23 = (MobileElement) driver.findElementByXPath(
				"(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
		el23.click();
		Thread.sleep(4000);
		MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Me");
		el24.click();
		Thread.sleep(4000);
		MobileElement el25 = (MobileElement) driver
				.findElementById("org.wordpress.android:id/me_login_logout_text_view");
		el25.click();
		MobileElement el26 = (MobileElement) driver.findElementById("android:id/button1");
		el26.click();
		System.out.println("Logged out");
		Thread.sleep(4000);
	}

	@Test(priority = 2)

	public void sampleTest() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
		el1.click();
		Thread.sleep(5000);
		MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_site_button_text");
		el2.click();
		Thread.sleep(5000);
		MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		el3.sendKeys("kaustubh.art.blog");
		Thread.sleep(5000);
		MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		el4.click();
		Thread.sleep(5000);
		MobileElement el5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		el5.sendKeys("kaustubhshahane");
		Thread.sleep(5000);
		MobileElement el6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		el6.sendKeys("Kaustubh88$$");
		Thread.sleep(5000);
		MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		el7.click();
		Thread.sleep(5000);
		MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		el8.click();
		Thread.sleep(5000);
		MobileElement el9 = (MobileElement) driver
				.findElementById("org.wordpress.android:id/my_site_blog_posts_text_view");
		el9.click();
		Thread.sleep(5000);
		MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Drafts");
		el10.click();
		Thread.sleep(5000);
		MobileElement el11 = (MobileElement) driver.findElementById("org.wordpress.android:id/button");
		el11.click();
		Thread.sleep(5000);
		MobileElement el12 = (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Post title. Empty\"]/android.widget.EditText");
		el12.sendKeys("JUnit TestNG");
		Thread.sleep(5000);
		MobileElement el13 = (MobileElement) driver.findElementByXPath(
				"//android.widget.ScrollView[@content-desc=\"block-list\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
		el13.sendKeys("This is my JUnit TestNG programme.");
		Thread.sleep(10000);
		MobileElement el14 = (MobileElement) driver.findElementById("org.wordpress.android:id/menu_primary_action");
		el14.click();
		Thread.sleep(10000);
		MobileElement el15 = (MobileElement) driver.findElementById("android:id/button1");
		el15.click();
		Thread.sleep(10000);
		MobileElement el16 = (MobileElement) driver.findElementByXPath(
				"//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Published\"]/android.widget.TextView");
		el16.click();
		Thread.sleep(10000);

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("wordpress executed successfully");
		driver.quit();
	}
}