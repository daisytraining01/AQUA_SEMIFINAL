package newword1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class CalcAppium 
{
	
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
	
    public static void main (String args[]) throws Exception
    {
		/*
		 * DesiredCapabilities cap= new DesiredCapabilities();
		 * cap.setCapability("deviceName", "Mi A1"); cap.setCapability("udid",
		 * "33c041340704"); cap.setCapability("platformName", "Android");
		 * cap.setCapability("platformVersion", "9");
		 * cap.setCapability("automationName", "UiAutomator1");
		 * 
		 * cap.setCapability("appPackage", "com.google.android.calculator");
		 * cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		 * 
		 * 
		 * URL url= new URL("http://127.0.0.1:4723/wd/hub"); driver= new
		 * AndroidDriver<MobileElement>(url,cap);
		 * System.out.println("Calculator Application invoked successfully");
		 * Thread.sleep(4000);
		 */	
    	
    	
    	 DesiredCapabilities dc = new DesiredCapabilities();
         dc.setCapability("testName", "Maheswari");
         String accessKey= "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
 		dc.setCapability("accessKey", accessKey);
         dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
        // dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
         dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
         dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.popupcalculator.Calculator");
         driver = new AndroidDriver<>(new URL("https://demo.experitest.com/wd/hub"), dc);
      	
    	
    	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    try {
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		 
	} catch (Exception e) {
		
		System.err.println("Element not found");
	}
    finally {
    	 screenshot("calc");
    }
    try {
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	} catch (Exception e) {
		
		System.err.println("Element not found");
	}
    finally {
    	 screenshot("calc");
    }
    try {
		driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
	}catch (Exception e) {
		
		System.err.println("Element not found");
	}
    finally {
    	 screenshot("calc");
    }
    try {
		MobileElement el11=driver.findElement(By.id("com.google.android.calculator:id/eq"));
		String s1= el11.getText();
		  String s2="equals";
		   Assert.assertEquals(s2, s1);
		  System.out.println("Actual :"+s1);
		
	}catch (Exception e) {
		
		System.err.println("Element not found");
	}
    finally {
    	 screenshot("calc");
    }
    
  
    
    }
}
