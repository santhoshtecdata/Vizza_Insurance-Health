package stepDifinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.motor.logInMotorTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import vizza_insurence.vizzaBase;

public class policy extends vizzaBase {
	
	
	logInMotorTest lt =new logInMotorTest();
	logInMotorTest k =PageFactory.initElements(driver,logInMotorTest.class);
    
	@Given("login the vizza portal")
	   
	public void one () throws InterruptedException, AWTException, IOException {
	     k.login("TESTING1","2");
		}
	  @ And ("click the policy type")
	   public void two () {
		              
	    }
	  @When ("fill the basic details")
	   public void three () {
		 
		
	}
	   
	 @ And("fill the all details in ckys page")
	   public void four() {
		
		
	}
	   
	@ And ("fill the all fiels in personal details page") 
	   public void five () {
		 
		

		  
		   
		   
	}
	
	  @And ("fill the all details in vehicle details") 
	   public void six () {
		
		
	}
	 @ And ("fill tha nominee details") 
	   public void seven () {
			
			
		}
	 @Then  ("proposal will created")
	   public void  eight () {
			
			
		}
	

}
