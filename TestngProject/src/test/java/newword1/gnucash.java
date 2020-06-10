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

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
	import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;


	public class gnucash {
	    
		static String path = System.getProperty("user.dir");

	  private static AndroidDriver driver;

	  public static void screenshot(String s)
		{
			try {
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			TakesScreenshot screen =((TakesScreenshot)driver);
			File SrcFile=screen.getScreenshotAs(OutputType.FILE);
			File despath = new File(path+"/Screenshots/"+s+timestamp+".jpg");
			FileUtils.copyFile(SrcFile, despath);
			} catch (IOException e) 
			{
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
		  desiredCapabilities.setCapability("appPackage", "org.gnucash.android");
		  desiredCapabilities.setCapability("appActivity",
		  "org.gnucash.android.ui.account.AccountsActivity");
		  
		  
		  URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		  
		  
		  driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		 	
			/*
			 * DesiredCapabilities dc = new DesiredCapabilities();
			 * dc.setCapability("testName", "Maheswari"); String accessKey=
			 * "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
			 * dc.setCapability("accessKey", accessKey); dc.setCapability("deviceQuery",
			 * "@os='android' and @category='PHONE'"); //
			 * dc.setCapability(MobileCapabilityType.APP,
			 * "cloud:com.experitest.ExperiBank/.LoginActivity");
			 * dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
			 * "org.gnucash.android");
			 * dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
			 * "org.gnucash.android.ui.account.AccountsActivity"); driver = new
			 * AndroidDriver<>(new URL("https://demo.experitest.com/wd/hub"), dc);
			 * 
			 */	}


	  @Test
	  public void sampleTest() throws Exception {
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	     
	      
	      try {
			MobileElement el1 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
			  el1.click();
				
				  String s1= el1.getText();
				  String s2="Default Currency";
				   AssertJUnit.assertEquals(s2, s1);
				  System.out.println("Actual :"+s1);
				 
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	
	      try {
			MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]");
			  el2.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	
	      try {
			MobileElement el3 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
			  el3.click();
		}catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	  try {
		MobileElement el4 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		      el4.click();
	} catch (Exception e) {
		
		System.err.println("Element not found");
	}
    finally {
    	 screenshot("Homepage1");
    }

	      try {
			MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
			  el5.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      try {
			MobileElement el6 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
			  el6.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	
	      try {
			MobileElement el7 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
			  el7.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	      
	      try {
			driver.findElementById("android:id/button1").click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	      
	      Thread.sleep(3000);
	      System.out.println("successfully completed");
			       
	      }
	@AfterMethod
	public void tearDown() {
	    driver.quit();
	  }
	}
