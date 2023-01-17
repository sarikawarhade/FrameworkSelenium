package org.utilities;

//import org.PropertyFile.ConfigReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

 public class BaseUtility {
 public WebDriver startup(String bName,String url) {
	 WebDriver driver= null;
      if(bName.equalsIgnoreCase("ch")|| bName .equalsIgnoreCase("chrome")) 
  {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//      ChromeDriver driverCH= new ChromeDriver();
//      driverCH.get(url);
       driver = new ChromeDriver();
  }
//       else  if(bName.equalsIgnoreCase("edge")|| bName .equalsIgnoreCase("edge")) 
//  {  
//      System.setProperty("webdriver.edge.driver","./drivers/mesdgedriver.exe");
////      EdgeDriver driverEdge= new EdgeDriver();
////      driverEdge.get(url));
//       driver = new EdgeDriver();
//  }
     else if(bName.equalsIgnoreCase("ff")|| bName .equalsIgnoreCase("firefox")) 
  {
    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
//    FirefoxDriver driverFF= new FirefoxDriver();
//   driverFF.get(url);
    driver = new FirefoxDriver();
  }
     else
 {   
	 System.out.println("Invalid Brower Name !!");
 }
      driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(100,250));

      driver.get(url);
      return driver;
	}
 public int addition(int a ,int b) {
	 int sum = a+b;
	 return sum;
 }
public void clickByJs(WebDriver driver, WebElement logoutLink) {
	// TODO Auto-generated method stub
	

//public Object startUp(ConfigReader cr) {
	// TODO Auto-generated method stub
//	return null;

}
 }

