package newword1;


	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
	import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class Map {
		
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
		  desiredCapabilities.setCapability("appPackage",
		  "com.google.android.apps.maps");
		  desiredCapabilities.setCapability("appActivity",
		  "com.google.android.maps.MapsActivity");
		  
		  URL remoteUrl = new URL("http://localhost:4723/wd/hub"); driver = new
		  AndroidDriver(remoteUrl, desiredCapabilities);
	 	}
		 	
		/*
		 * DesiredCapabilities dc = new DesiredCapabilities();
		 * dc.setCapability("testName", "Maheswari_Maps"); String accessKey=
		 * "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
		 * dc.setCapability("accessKey", accessKey); dc.setCapability("deviceQuery",
		 * "@os='android' and @category='PHONE'"); //
		 * dc.setCapability(MobileCapabilityType.APP,
		 * "cloud:com.experitest.ExperiBank/.LoginActivity");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "com.google.android.apps.maps");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		 * "com.google.android.maps.MapsActivity"); driver = new AndroidDriver<>(new
		 * URL("https://localhost:4723/wd/hub"), dc);
		 * 
		 * }
		 */

	  @Test
	  public void sampleTest() throws Exception {
	    try {
			MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Directions\"]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
			el1.click();
} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage1");
	    }
	    
	    try {
			MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[1]/android.widget.LinearLayout/android.widget.TextView");
			el2.click();
			  String s1= el2.getText();
				 String s2="Your location";
				 AssertJUnit.assertEquals(s2, s1);
				    System.out.println("Actual :"+s1);
							
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage2");
	    }
	     
	    Thread.sleep(3000);
	    try {
			MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text");
			el3.sendKeys("Chennai Central");
	    }
			catch (Exception e) {
				
				System.err.println("Element not found");
			}
		    finally {
		    	 screenshot("from loc");
		    }
		    	   	    
	    Thread.sleep(4000);
	    try {
			MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
			el4.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("map1");
	    }
	    
	    try {
			MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[2]/android.widget.LinearLayout");
			el5.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("Homepage3");
	    }
	    
	    try {
			MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text");
			el6.sendKeys("CMBT");
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    
	  
	    Thread.sleep(4000);
	    try {
			MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
			el7.click();
		}  catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    
	    try {
			MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout");
			el8.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    try {
			MobileElement el9 = (MobileElement) driver.findElementById("com.google.android.apps.maps:id/details_content");
			el9.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    screenshot("preview");
	    try {
			MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Show next");
			el10.click();
		}  catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    
	    
	    Thread.sleep(3000);
	    try {
			MobileElement el11 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Overflow menu\"]/android.widget.ImageView");
			el11.click();
		}  catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    
	    Thread.sleep(3000);
	    try {
			MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox");
			el12.click();
		}  catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	  screenshot("To location");
	    }
	    
	    
	    Thread.sleep(3000);
	  }

	 
	@AfterMethod
	public void tearDown() {
		  System.out.println("Map Application launched successfully");
	    driver.quit();
	  }
	}

