package com.mavenproject.MavenProject;

import com.pageobjectmanager.Pom;




public class RunerClass extends BaseClass{
	
	public static Pom pom = new Pom(driver);

	public static void main(String[] args) {

		webBrowser();
		

		getUrl("http://adactinhotelapp.com/");
		
	// LoginPage lp = new LoginPage(driver);


	  passInput(pom.getLogin().getUsername(), "Darkknight");
   
		passInput(pom.getLogin().getPassword(),"EWQI81");



		clickOnElement(pom.getLogin().getBtn());
	}
	
}
		

//        index(pom.getInstanceLogin1().getLocation(), 7);
//
//
//		value(pom.getInstanceLogin1().getHotel(), "Hotel Sunshine");
//
//
//	visibleText(pom.getInstanceLogin1().getRoom(), "Super Deluxe");
//
//
//	visibleText(pom.getInstanceLogin1().getNos(),"2 - Two");
//
//
//
//	visibleText(pom.getInstanceLogin1().getAdultRoom(),"2 - Two");
//
//
//	visibleText(pom.getInstanceLogin1().getChildRoom(),"2 - Two");
//
//
//
//	clickOnElement(pom.getInstanceLogin1().getBtn2());
//
//
//
//		clickOnElement(pom.getInstanceLogin2().getBtn3());
//
//
//		clickOnElement(pom.getInstanceLogin2().getBtn4());
//
//
//
//		passValue(pom.getInstanceLogin3().getFirstName(),"Bharath");
//
//
//		passValue(pom.getInstanceLogin3().getLastName(), "Napa");
//
//		passValue(pom.getInstanceLogin3().getAddress(), "new 31 Chennai -21");
//
//		passValue(pom.getInstanceLogin3().getCard(), "1234567890123456");
//
//		visibleText(pom.getInstanceLogin3().getCtype(), "VISA");
//
//		index(pom.getInstanceLogin3().getMonth(), 3);
//
//		index(pom.getInstanceLogin3().getYear(), 12);
//
//		passValue(pom.getInstanceLogin3().getCvv(), "123");
//
//		clickOnElement(pom.getInstanceLogin3().getBtn6());
//
//	}


	

	

	


