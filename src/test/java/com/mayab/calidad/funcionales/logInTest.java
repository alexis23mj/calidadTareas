/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.calidad.funcionales;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Angel
 */
public class logInTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String URL;

  @Before
  public void init() throws Exception {
      URL="https://anahuac.blackboard.com/webapps/login/";
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\OneDrive\\Escritorio\\Calidad\\ChromeDriver\\chromedriver.exe");
      driver = new ChromeDriver();
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit
    
  }
  @Test
  public void testUntitledTestCase() throws Exception {
      driver.get(URL);
      
      WebElement element= driver.findElement(By.name("#loginbox"));
      
      element.sendKeys("piñata");
      
      element.submit();
      
      pause(5000);
      
      driver.close();
    
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
