package com.amc.txrepo;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.amc.txbase.TxBase;



public class DryRunObj extends TxBase{

	public static ArrayList<String> Chaitanya = new ArrayList<String>();

	public static ArrayList<String> Sunkara = new ArrayList<String>();

	SoftAssert sa = new SoftAssert();
	


	public void addingtest() {


		Chaitanya.add("Expected:" + "HD");

		Chaitanya.add("Actual:" + "SD");

		Chaitanya.add("Format:" + "KID");

		Chaitanya.add("Segments:" + "5");

		
		Sunkara.add("Actual:" + "SD");

		Sunkara.add("Segments:" + "55");

		Sunkara.add("Format:" + "KID");

		Sunkara.add("FileStatus:" + "Ready");
		
		Sunkara.add("Expected:" + "HD");






	}

	public void dryRun(String data) throws Exception {

	String TestData=null;
	
	String cccc = null;
	String sss = null;

		for(int i=0; i<Chaitanya.size(); i++) {
			
			if (Chaitanya.get(i).contains(data)) {
			
				cccc = Chaitanya.get(i);
				
			}
			
				TestData="Start";	
		}
			
			for(int j=0; j<Sunkara.size();j++) {

				if(cccc.equalsIgnoreCase(Sunkara.get(j))) {

					 sss = Sunkara.get(j);

					if(cccc.contains(data)) {

						Assert.assertEquals(cccc, sss);	

						System.out.println("WOP Data"+" [ " + cccc + " ]"+" Matched With"+" MP Data"+" [ " + sss + " ] " );	

						logStep("WOP Data"+" [ " + cccc + " ]"+" Matched With"+" MP Data"+" [ " + sss + " ] " );

						TestData="Pass";
						
						break;
						
					}else {
						
						TestData="Fail";
					}


				}else {

					TestData="Fail";
				}
                  
				if(TestData.equalsIgnoreCase("Fail")&&j==Sunkara.size()-1) {
				
					sa.fail(cccc+" --- Not Matched with --- "+Sunkara.toString());
				
				}
			
				
			}
			
			sa.assertAll();
		}
		
		
	}

