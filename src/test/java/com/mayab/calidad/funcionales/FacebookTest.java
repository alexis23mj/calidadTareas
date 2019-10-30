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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Angel
 */
public class FacebookTest {
private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String URL;

  @Before
  public void init() throws Exception {
      URL="https://www.facebook.com/login";
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\OneDrive\\Escritorio\\Calidad\\ChromeDriver\\chromedriver.exe");
      driver = new ChromeDriver();
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit
    
  }
    public void pause(long mills){
      try{
          Thread.sleep(1000);
      }catch(Exception e){
          e.printStackTrace();
      }
  }
  
  @Test
  public void testUntitledTestCase() throws Exception {
      driver.get(URL);
      
      WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/form/div/div[1]/input"));
      
      element.sendKeys("adan_dc10@hotmail.com");
      
      element= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/form/div/div[2]/input"));
      
      element.sendKeys("popo");
      
      element= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/form/div/div[3]/button"));
      element.click();

       pause(50000);
       
       element.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/form/div/div[2]/input"));
       element.click();
       pause(50000);
      //error
      element.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div"));
      String error= element.getText();
      
      
      pause(50000);
      
      
      assertEquals("La contraseña que has introducido es incorrecta. ",error);
      
      driver.close();
    
  }

    @After
  public void tearDown(){
      driver.quit();
  }
    
}
