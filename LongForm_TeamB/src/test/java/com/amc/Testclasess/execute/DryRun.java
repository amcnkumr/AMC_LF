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
		
		String Supplier = "Pictures\\WopImages\\Supplier.PNG";
		
		imageEnterText(Supplier,"Miramax",10);
		
		for(int i=0; i<=2;i++) {
			
			Clickenter();
		}
		
	}

}