package scenarios;

import java.awt.AWTException;
import java.util.logging.Level;


import org.openqa.selenium.By;

import allclasses.CommonParaFun;
import allclasses.buttonsForm;

public class AutomatedScenarios {
	
	public static CommonParaFun com;
	
	
	
	//config and launch chrome
	public void launchBrowser() {
			com=new CommonParaFun();
			com.configDriver("E:\\automation\\chrome driver\\chromedriver.exe", "chrome", "https://barqstaging.crm4.dynamics.com/");
	}
	
	//login with crm1
	public void login() {
			com.LoginOnline("crm1@barqsystems.com", "P@ssw0rd1");
	}
	
	//navigate to department and press new
	public void navigateToDept() {
		try {
			com.createNewRecord("BARQ Marketing", "Departments");
		}catch(InterruptedException|AWTException e) {
			CommonParaFun.logger.log(Level.SEVERE, e.toString());
		}
	}
	
	
	//create record
	public void newDeptRecord() {
		try {
			Thread.sleep(2000);
	//		com.switchFrame("contentIFrame1");
	//		com.element(By.id("FormTitle")).click();
	//		com.element(By.id("new_name")).sendKeys("testing BDD");
			com.copyPaste("testing BDD");
			com.FormCRMButtons(buttonsForm.Save.toString());
		}catch(AWTException|InterruptedException e) {
			CommonParaFun.logger.log(Level.SEVERE, e.toString());
		}
	}
	
	
	public boolean isCreated() throws InterruptedException {
		Thread.sleep(2000);
		boolean created=false;
		if(com.isPresent(By.id("new_department|NoRelationship|Form|Mscrm.Form.new_department.Deactivate"))) {
			created=true;
		}
		return created;
	}
	

}
