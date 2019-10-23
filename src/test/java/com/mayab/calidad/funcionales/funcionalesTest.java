/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.funcionales;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class funcionalesTest {
    //FacebookTest
    
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String URL;

  @Before
  public void setUp() throws Exception {
      URL="https://www.google.com/";
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\OneDrive\\Escritorio\\Calidad\\ChromeDriver\\chromedriver.exe");
      driver = new ChromeDriver();
    //baseUrl = "https://www.katalon.com/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void LoginTest(){
      driver.get(URL);
      
      WebElement element= driver.findElement(By.name("q"));
      
      element.sendKeys("Hello");
      
      element.submit();
      
      pause(5000);
      
      driver.close();
      
      Assert.assertEquals("*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div/div[2]/input", URL);
      //*[@id="tsf"]/div[2]/div[1]/div[2]/div/div[2]/input
  }
    
  public funcionalesTest() {
    }
  
  
  @After
  public void tearDown(){
      driver.quit();
  }
  
  public void pause(long mills){
      try{
          Thread.sleep(1000);
      }catch(Exception e){
          e.printStackTrace();
      }
  }
    
}
