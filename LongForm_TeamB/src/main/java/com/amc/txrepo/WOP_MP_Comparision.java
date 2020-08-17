package com.amc.txrepo;



import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.amc.txbase.TxBase;

public class WOP_MP_Comparision extends TxBase{
	
	SoftAssert sa = new SoftAssert();
	
	
	// Comparing WOP to MP Data Validations:
	
	public void WOPtoMPDataComparisions(String param) {
		
		

		
		String TestCaseParam=null;
		 
		 String wopFields=null;
		 
		 String mpFields = null;
		 
		 
		 for(int i=0; i<wopEpisodeVersionData.size(); i++) {
				
				if (wopEpisodeVersionData.get(i).contains(param)) {
				
					wopFields = wopEpisodeVersionData.get(i);
					
				}
				
				TestCaseParam="Start";	
			}
		 
		 
		 for(int j=0; j<TxBase.mpEpisodeVersionData.size(); j++) {
				
				
				if(wopFields.equalsIgnoreCase(mpEpisodeVersionData.get(j))) {
					
					mpFields = mpEpisodeVersionData.get(j);
					
					
					if(wopFields.contains(param)) {

						Assert.assertEquals(wopFields, mpFields);	

						System.out.println("WOP Data"+" [ " + wopFields + " ]"+" Matched With"+" MP Data"+" [ " + mpFields + " ] " );	

						logStep("WOP Data"+" [ " + wopFields + " ]"+" Matched With"+" MP Data"+" [ " + mpFields + " ] " );

						TestCaseParam="Pass";
						
						break;
						
					}else {
						
						TestCaseParam="Fail";
					}
						
						
				}else {

					TestCaseParam="Fail";
				}
					
				if(TestCaseParam.equalsIgnoreCase("Fail")&&j==mpEpisodeVersionData.size()-1) {
					
					sa.fail(wopFields+" --- Not Matched with --- "+mpEpisodeVersionData.toString());
				
				}
				
			
				
				}
				
				sa.assertAll();		   
		   
		
		
	}
	
	
	
	
	

}
