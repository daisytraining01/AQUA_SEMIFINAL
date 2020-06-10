package newword1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
	import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.touch.offset.PointOption;

	public class Eribank {
		static String path = System.getProperty("user.dir");
		static AndroidDriver<MobileElement> driver;
		
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
		
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
				
			  desiredCapabilities.setCapability("deviceName", "Mi A1");
			  desiredCapabilities.setCapability("udid", "33c041340704");
			  desiredCapabilities.setCapability("platformName", "Android");
			  desiredCapabilities.setCapability("platformVersion", "9");
			  desiredCapabilities.setCapability("automationName", "UiAutomator1");
			  desiredCapabilities.setCapability("appPackage", "com.experitest.ExperiBank");
			  desiredCapabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
	        
	        URL ur=new URL("http://127.0.0.1:4723/wd/hub");
	        
	        driver=new AndroidDriver<MobileElement>(ur,desiredCapabilities);
	        System.out.print("Application");
		
	        MobileElement el11= driver.findElement(By.id("android:id/button1"));
	        		el11.click();
	        String s1= el11.getText();
			  String s2="EriBank";
			   Assert.assertEquals(s2, s1);
			  System.out.println("Actual :"+s1);
			
	        Thread.sleep(3000);
		try {
			//MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@id='usernameTextField']");
			MobileElement el1 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
			el1.sendKeys("company");
		}catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }
	MobileElement el2 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
		el2.sendKeys("company");
		try {
			MobileElement el5 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
			el5.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }

		MobileElement el6 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton");
		el6.click();
		try {
			MobileElement el7 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/phoneTextField");
			el7.sendKeys("8970528995");
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }

		try {
			MobileElement el8 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/nameTextField");
			el8.sendKeys("Preethi");
			el8.click();
		}catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }

		MobileElement el9 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/countryButton");
		el9.click();
		try {
			MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]");
			el10.click();
			el10.click();
		} catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }

		(new TouchAction(driver))
		  .press(PointOption.point(456,792))
		  .moveTo(PointOption.point(697,797))
		  .release()
		  .perform();
		  
		MobileElement el101 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/sendPaymentButton");
		el101.click();
		try {
			MobileElement el12 = (MobileElement) driver.findElementById("android:id/button1");
			el12.click();
		}catch (Exception e) {
			
			System.err.println("Element not found");
		}
	    finally {
	    	 screenshot("eribank");
	    }
try {
	MobileElement el13 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/logoutButton");
			el13.click();
}catch (Exception e) {
	
	System.err.println("Element not found");
}
finally {
	 screenshot("eribank");
}
		}

	}

