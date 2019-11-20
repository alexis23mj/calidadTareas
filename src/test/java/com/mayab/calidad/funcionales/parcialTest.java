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
import static org.junit.Assert.assertThat;

/**
 *
 * @author Angel
 */
public class parcialTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String URL;

  @Before
  public void init() throws Exception {
      URL="https://mern-crud.herokuapp.com/";
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
  
  /*@Test
  public void testAdd() throws Exception {
      driver.get(URL);
      
      WebElement element= driver.findElement(By.xpath("/html/body/div/div/div[2]/button"));
      
      element.click();
      
      element = driver.findElement(By.name("name"));
      
      element.sendKeys("Alexis");
      
      element = driver.findElement(By.name("email"));
      
      element.sendKeys("alexis@gmail.com");
      
      element = driver.findElement(By.name("age"));
      
      element.sendKeys("20");
            
      element= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button"));
      
      element.click();  
      
     pause(50000);
     
     element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p"));
      
     String success = element.getText();
      
     assertEquals("Successfully added!",success); 
      
      
      driver.close();   
  }*/
    /*@Test
  public void testAddError() throws Exception {
      driver.get(URL);
      
     WebElement element= driver.findElement(By.xpath("/html/body/div/div/div[2]/button"));
      
     element.click();
     
     element = driver.findElement(By.name("name"));
      
     element.sendKeys("Alexis");
      
     element = driver.findElement(By.name("email"));
      
     element.sendKeys("alexis@gmail.com");
      
     element = driver.findElement(By.name("age"));
      
     element.sendKeys("20");
      
     element= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button"));
      
     element.click();
      
     pause(50000);
     
     element= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[5]/div/p"));
     
     String error = element.getText();
     
     assertEquals("That email is already taken.",error);
      
     driver.close();
    
  }*/
     @Test
  public void tesDelete() throws Exception {
      driver.get(URL);
      
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)"));
      
      String name = element.getClass().toString();
      
      
      element = driver.findElement(By.cssSelector("tr:nth-child(1) .black"));
      
      
      element.click();
      
      element = driver.findElement(By.cssSelector(".red"));
      
      element.click();
      
      WebElement e2 = driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)"));
      
      String name2 = e2.getClass().toString();
      
      pause(50000);
      
      assertNotEquals(name,name2);
      
      driver.close();
    
  }
    @After
  public void tearDown(){
      driver.quit();
  }
  



    
}

