package envtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCalc {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Muzna");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability("appPackage","com.asus.calculator");
		cap.setCapability("appActivity","com.asus.calculator.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, cap);
		
		driver.findElement(By.id("com.asus.calculator:id/digit9")).click();
		driver.findElement(By.id("com.asus.calculator:id/plus")).click();
		driver.findElement(By.id("com.asus.calculator:id/digit5")).click();
		driver.findElement(By.id("com.asus.calculator:id/equal")).click();
		String str=driver.findElement(By.id("com.asus.calculator:id/resultEditTextID")).getText();
		System.out.println(str);
	}

}
