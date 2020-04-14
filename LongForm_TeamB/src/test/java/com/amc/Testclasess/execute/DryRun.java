package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;

public class DryRun extends TxBase {
	
	public static String  Execution="Pass";
	
public static ArrayList<String> one = new ArrayList<String>();
	
	public static ArrayList<String> two = new ArrayList<String>();
	
	public static String value;
	
	
	@Test
	public void dryRun() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
		
		try {
		 
			value = "A";
			 
		if(value.contains("RLA")) {
			
			System.out.println("HIiiii");
		}else {
			
			Execution ="Fail";
		}
		
		}
		
		catch(Exception e) {
			   
			   System.out.println(e.getMessage());
			   
			   Execution ="Fail";
				   
			   }
		
	}

}