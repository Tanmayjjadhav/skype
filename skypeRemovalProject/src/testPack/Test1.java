package testPack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ganeric.BaseTest;
import ganeric.Flib;
import pom.HomePage;
import pom.SigninPage;

public class Test1 extends BaseTest{
  @Test
  public void validTest() throws InterruptedException, IOException, AWTException {
	  
	  Flib flib = new Flib();
	  SigninPage sp = new SigninPage(driver);
	  sp.loginOp(flib.readPropData(PROP_PATH, "id"),flib.readPropData(PROP_PATH, "password"));
	  
	  Thread.sleep(14000);
	  
	  HomePage hp = new HomePage(driver);
	  hp.searchGroup(flib.readPropData(PROP_PATH, "group"));
	  
  }
}
