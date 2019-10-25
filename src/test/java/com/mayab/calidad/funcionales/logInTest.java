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
      
      WebElement element= driver.findElement(By.id("user_id"));
      
      element.sendKeys("00330796");
      
      element= driver.findElement(By.id("password"));
      
      element.sendKeys("00330796");
      
      element= driver.findElement(By.id("entry-login"));
      
      element.submit();
      
      element= driver.findElement(By.xpath("/html/body/div[3]/div[2]/a"));
      String name= element.getText();
      
      element.click();
      
      
      pause(50000);
      
      
      assertEquals("Alexis Morales Diaz",name);
      
      driver.close();
    
  }
    @Test
  public void testError() throws Exception {
      driver.get(URL);
      
      WebElement element= driver.findElement(By.id("user_id"));
      
      element.sendKeys("00330796");
      
      element= driver.findElement(By.id("password"));
      
      element.sendKeys("30796");
      
      element= driver.findElement(By.id("entry-login"));
      
      element.submit();
      
      element= driver.findElement(By.id("loginErrorMessage"));
      String error= element.getText();
      
      element.click();
      
      
      pause(50000);
      
      
      assertEquals("El nombre de usuario o contraseña que ha introducido no son correctos. Inténtelo de nuevo. Si aún no puede iniciar sesión, comuníquese con su administrador del sistema.",error);
      
      driver.close();
    
  }
      @Test
  public void testEmpty() throws Exception {
      driver.get(URL);
      
      WebElement element= driver.findElement(By.id("entry-login"));
      
      element.submit();
      
       pause(50000);
      
      String error= driver.switchTo().alert().getText();
      driver.switchTo().alert().accept();
      
      
      
      
      assertEquals("Introduzca un nombre de usuario y una contraseña.",error);
      
      driver.close();
    
  }
    @After
  public void tearDown(){
      driver.quit();
  }
  



    
}
