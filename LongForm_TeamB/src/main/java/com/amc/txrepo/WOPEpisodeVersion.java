
package com.amc.txrepo;





import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;

import junit.framework.Assert;

public class WOPEpisodeVersion extends TxBase {

	ExcelUtils ProductBrowserData = new ExcelUtils();
	
	ExcelUtils VersionData = new ExcelUtils();
		
	Screen productscreen = new Screen();
	
	public static String  duplicateVersion;
	
	public static String  AMCNID;
	
	public static String rlacheckpoint;
	
	public static String  Execution="Fail";
	
     // Episode Version Creation In WOP Product Browser
	
	
	public void EpisodeVersionCreation() throws Exception {
		
		productscreen.wait((double) 13.0);

		String BrowserSearch = "Pictures\\WopImages\\BrowserSearch.PNG";
		
		ProductBrowserData.readingexcelFiles("ProductBrowserData");
		
		imageEnterText(BrowserSearch,ProductBrowserData.excelData[1][0] ,10);
					
		Clickenter();
		
		String AmcnIDField = "Pictures\\WopImages\\AmcnIDField.PNG";
				
		imageClickAndTab(AmcnIDField,5);
		
		productscreen.wait((double) 2.0);
		
		String AmcnField2 = "Pictures\\WopImages\\AmcnField2.PNG";
		
		imageEnterText(AmcnField2,ProductBrowserData.excelData[1][1] ,10);
		
		Clickenter();
				
		String VersionMA = "Pictures\\WopImages\\VersionMA.PNG";
		
		imageDoubleClick(VersionMA, 5);
		
		productscreen.wait((double) 5.0);
		
		String Supplier = "Pictures\\WopImages\\Supplier.PNG";
		
		imageEnterText(Supplier,"Miramax",10);
		
		for(int i=0; i<=2;i++) {
			
			Clickenter();
		}
									
		productscreen.wait((double) 2.0);
		
		VersionData.readingexcelFiles("EPVersionData");
		
		// Product Version Selection 
		
		Version:
		
		for(int i=1; i<=VersionData.lastRow;  i++) {
			
			
	    String ProductMenu = "Pictures\\WopImages\\ProductMenu.PNG";
			
		imageFindClick(ProductMenu,10);
			
	    String NewVersionItem = "Pictures\\WopImages\\NewVersionItem.PNG";
			
	    imageFindClick(NewVersionItem,10);		
		
		productscreen.wait((double) 4.0);
		
		String FindBar = "Pictures\\WopImages\\FindBar.PNG";
		
		imageEnterText(FindBar,VersionData.excelData[i][0] ,10);
		
		productscreen.wait((double) 4.0);
		
        String CheckBox = "Pictures\\WopImages\\CheckBox.PNG";
		
		imageFindClick(CheckBox,10);
		
		productscreen.wait((double) 4.0);
		
		String ClearFindBar = "Pictures\\WopImages\\ClearFindBar.PNG";
		
		imageClearText(ClearFindBar, 10);
		
		productscreen.wait((double) 4.0);
		
		String FindBar2 = "Pictures\\WopImages\\FindBar2.PNG";
		
		imageEnterText(FindBar2,VersionData.excelData[i][1] ,10);
		
		productscreen.wait((double) 4.0);
		
        String CheckBox1 = "Pictures\\WopImages\\CheckBox.PNG";
		
		imageFindClick(CheckBox1,10);
		
		productscreen.wait((double) 4.0);
		
		String VersionOkButton = "Pictures\\WopImages\\VersionOkButton.PNG";
		
		imageFindClick(VersionOkButton,10);
		
		// Selected Version Duplicate
		
		productscreen.wait((double) 3.0);
		
		try {
			
			String SaveChanges = "Pictures\\WopImages\\SaveChanges.PNG";
			
		    imageFindClick(SaveChanges,10);
		    
		    productscreen.wait((double) 3.0);
						
		}catch (Exception e) {
			
			System.out.println("No Save Changes Winow is Displayed");
		}
				
		try {
        
			String SelectedVersionDuplicateWindow = "Pictures\\WopImages\\SelectedVersionDuplicateWindow.PNG";
		
		    imageFindClick(SelectedVersionDuplicateWindow,10);
		
		    duplicateVersion= "Selected Version Already Exist";
		    
		    productscreen.wait((double) 2.0);
		
		} catch (Exception e) {
			
			System.out.println("No Duplicate Version Exists");
			
			
		}
		
		if(duplicateVersion=="Selected Version Already Exist") {
			
			System.out.println("Duplicate Version Exist and Try For Another Version");
					
			duplicateVersion = null;
			
			String MARLA = "Pictures\\WopImages\\MARLA.PNG";
			
		    imageFindClick(MARLA,10);
		    
		    productscreen.wait((double) 3.0);
			
		} else {
			
			System.out.println("Selected Version:" + VersionData.excelData[i][0] + VersionData.excelData[i][1] );
			
			logStep("Episode Verison Creation is Success");
			
			break Version;
		}
		
				
		}
		
		
		
		
}

	       // Linking Media Asset to Created Version
	
	       public void MediaAssetLinking() throws java.lang.Exception {
	    	   
	    	   
	    	   
	    	   productscreen.wait((double) 2.0);
	    	   
	    	   String NewMediaAssetVersion = "Pictures\\WopImages\\NewMediaAssetVersion.PNG";
				
			   imageFindClick(NewMediaAssetVersion,10);
			   
			   String SaveChanges = "Pictures\\WopImages\\SaveChanges.PNG";
				
			   imageFindClick(SaveChanges,10);
			   
			   String PrototypeFind = "Pictures\\WopImages\\PrototypeFind.PNG";				
			   
			   imageEnterText(PrototypeFind,ProductBrowserData.excelData[1][2] ,10);
			   
			   productscreen.wait((double) 2.0);
			   
			   String PrototypeCreate = "Pictures\\WopImages\\PrototypeCreate.PNG";
				
			   imageFindClick(PrototypeCreate,10);
			   
			   // Giving Protoype Data
			   
			   String VideoComponent = "Pictures\\WopImages\\VideoComponent.PNG";
			   
			   imageFindClick(VideoComponent,10);
			   
			   productscreen.wait((double) 4.0);
			   			   
			   String ExpectedScanType = "Pictures\\WopImages\\ExpectedScanType.PNG";
			   
			   EnterTextandTabVersion(ExpectedScanType,ProductBrowserData.excelData[1][3],10);
			   
			   productscreen.wait((double) 3.0);
			   
			   String FormatAssignMent = "Pictures\\WopImages\\FormatAssignMent.PNG";
			   
			   imageFindClick(FormatAssignMent,10);
			   
			   productscreen.wait((double) 3.0);
			   
			   String ExpectedSegments = "Pictures\\WopImages\\EpectedSegments.PNG";
			   
			   imageFindClick(ExpectedSegments,10);
			   
			   ClickandUpArrow();
			   
			   //imageEnterText(ExpectedSegments,ProductBrowserData.excelData[1][4],10);
			   
			   productscreen.wait((double) 4.0);
			   
			   String EstimatedTRTVersion = "Pictures\\WopImages\\ExpectedTRTVersion.PNG";
			   
			   imageEnterText(EstimatedTRTVersion,ProductBrowserData.excelData[1][10],10);
			   
			   productscreen.wait((double) 4.0);
			   
			   String ReadyToPublishVersion = "Pictures\\WopImages\\ReadyToPublishVersion.PNG";
			   
			   imageFindClick(ReadyToPublishVersion,10);
			   
			   productscreen.wait((double) 5.0);
			   
			   String MediaAssetLsit = "Pictures\\WopImages\\MediaAssetLsit.PNG";
			   
			   imagecopyMat(MediaAssetLsit , 10);
			   
			   productscreen.wait((double) 2.0);
			   
			   String SavePrototype = "Pictures\\WopImages\\SavePrototype.PNG";
			   
			   imageFindClick(SavePrototype,10);
			   
			   productscreen.wait((double) 2.0);
			   
			   String File1 = "Pictures\\WopImages\\File1.PNG";
			   
			   imageFindClick(File1,10);
			   
			   productscreen.wait((double) 2.0);
			   
			   String PrototypeClose = "Pictures\\WopImages\\PrototypeClose.PNG";
			   
			   imageFindClick(PrototypeClose,10);
			      
			   logStep("Created Media Asset In WOP Business System:" + ProductBrowserData.excelData[1][2]);
			   
			   
			   // for(int i=1; i<=10;i++) {
			    
			   logStep("Waited 120 Seconds For WOP Services UP And Run ");
			    
			   productscreen.wait((double) 2.0);
			   
			   // Checkpoint to Validate WOP Services
			 
			   try {
				   
			   //String CheckPoint = "Pictures\\WopImages\\CheckPoint.PNG";
			   
			   //imagecopyDecimalText(CheckPoint,10);
			   
			    //rlacheckpoint = TxBase.textvalueDecimal;
				   
				   rlacheckpoint="RLA177304.2";
			    		    	
			   if(rlacheckpoint.contains("RLA")) {
				   
				   //logStep("WOP Services Up And Running :" + TxBase.textvalueDecimal);
				   
				   logStep("WOP Services Up And Running :" + rlacheckpoint);
				   				   
				   //System.out.println(" WOP Services UP And Running:" + TxBase.textvalueDecimal);
				   
				   System.out.println(" WOP Services UP And Running:" + rlacheckpoint);
				   
				   Execution ="Pass";
				   
				  // break;
			   
			   //}else {
				  // if(i==10) {
				   
			   }  else {
				   
				   logStep("WOP Services are not Up & Running");
				   
				   System.out.println("WOP Services are not Up&Running");
				   
				   Execution ="Fail";
				   
				   Assert.fail("Id was not changed to RLA,-WOP services are not running..." + rlacheckpoint.contains("RLA"));
				   
				   //}else {
					  // logStep(i*10+" Seconds Waited for WOP Services Up & Running");
					   
					   //System.out.println(i*10+" Seconds Waited for WOP Services Up & Running");
				   //}
			   //}
			   
				   }
			   
			   }
			   
			   catch(Exception e) {
					   
				   System.out.println(e.getMessage());
				   
				   Execution ="Fail";
					   
				   }
			    
	       }   	   
	       
	       

	       
       
	       
	       // WOP Source Data:
	       
	       public void wopSourceData() throws FindFailed {
	    	   
	         //AMCNID = ProductBrowserData.excelData[1][1];
	   		
	   		//String  amcnId= "AMCNID:";  
	   		   		
	        //wopEpisodeVersionData(amcnId+rlacheckpoint);
	        
	        String EscandType = ProductBrowserData.excelData[1][3];
	   		
	   		String  scantype= "ExpectedScanType:"; 
	   		
	   	    wopEpisodeVersionData(scantype+EscandType);
	   	    
	   	    
	   	    String Esegments = ProductBrowserData.excelData[1][4];
	   		
	   		String  segments= "ExpectedSegments:"; 
	   		
	   	    wopEpisodeVersionData(segments+Esegments);
	   	    
	   	    
	   	     String Eframerate = ProductBrowserData.excelData[1][5];
	   		
	   		 String  framerate= "ExpectedFrameRate:"; 
	   		
	   	    wopEpisodeVersionData(framerate+Eframerate);
	   	    
	   	    
	   	    String EvideoCodec = ProductBrowserData.excelData[1][6];
	   		
	   	    String  videocodec= "ExpectedVideoCodec:"; 
   		
	   	    wopEpisodeVersionData(videocodec+EvideoCodec);
	   	    
	   	    
	   	    String EaspectRatio = ProductBrowserData.excelData[1][7];
	   		
	   	    String  aspectratio= "ExpectedAspectRatio:"; 
		
	   	    wopEpisodeVersionData(aspectratio+EaspectRatio);
	   	    
	   	 
	   	    String Eformat = ProductBrowserData.excelData[1][8];
	   		
	   	    String  format= "ExpectedFormat:"; 
		
	   	    wopEpisodeVersionData(format+Eformat);
	   	    
	   	    
	   	   /* String Eburnt = ProductBrowserData.excelData[1][9];
	   		
	   	    String  burnt= "ExpectedBurntInTitles:"; 
		
	   	    wopEpisodeVersionData(burnt+Eburnt);
	   	    */
	   	    
	   	    String ETRT = "1:30:00";
	   		
	   	    String  trt= "EstimatedTRT:"; 
		
	   	    wopEpisodeVersionData(trt+ETRT);
	   	    
	   	   productscreen.wait((double) 2.0);
		   
		   String SaveEpisodeVersion = "Pictures\\WopImages\\SavePrototype.PNG";
		   
		   imageFindClick(SaveEpisodeVersion,10);
		   
		   productscreen.wait((double) 2.0);
		   
		   for(int i=0; i<=1; i++) {
		   
		   String File1 = "Pictures\\WopImages\\File1.PNG";
		   
		   imageFindClick(File1,10);
		   
		   productscreen.wait((double) 2.0);
		   
		   String PrototypeClose = "Pictures\\WopImages\\PrototypeClose.PNG";
		   
		   imageFindClick(PrototypeClose,10);
		   
		   productscreen.wait((double) 2.0);
		   
		   }
	   	       	    
	   	   disconnectWop();
	       
	       }
	
}
