package com.amc.Testclasess.execute;






import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amc.txbase.TxBase;
import com.amc.txrepo.DryRunObj;

import ru.yandex.qatools.allure.annotations.Features;

import ru.yandex.qatools.allure.annotations.Title;

public class DryRun extends TxBase {
	
	DryRunObj dd= new DryRunObj();
	
	
	@Features("Dry Test")
	 
	@Title("ValidatingexpectedField")
	
	@Test(priority=1)
	public void ValidatingexpectedField() throws Exception {
		
		dd= PageFactory.initElements(driverWOP, DryRunObj.class);
		
		dd.addingtest();

		 data = "Expected:";
	
		dd.dryRun(data);
	}
	
	
	@Features("Dry Test")
	 
	@Title("ValidatingActual")
	
	@Test(priority=2)
	public void ValidatingActual() throws Exception {
		
		dd= PageFactory.initElements(driverWOP, DryRunObj.class);
		
		 data = "Actual:";
		
		dd.dryRun(data);
		
	}
	
	
	@Features("Dry Test")
	 
	@Title("ValidatingFormat")
	
	@Test(priority=3)
	public void ValidatingFormat() throws Exception {
		
		dd= PageFactory.initElements(driverWOP, DryRunObj.class);
		
		 data = "Format:";
		
		dd.dryRun(data);
		
	}
	
	
	
	@Features("Dry Test")
	 
	@Title("ValidatingSegments")
	@Test(priority=4)
	public void ValidatingSegments() throws Exception {
		
		dd= PageFactory.initElements(driverWOP, DryRunObj.class);
		
		String data = "Segments:";
		
		dd.dryRun(data);
		
	}
	
	
	
	
	

}
