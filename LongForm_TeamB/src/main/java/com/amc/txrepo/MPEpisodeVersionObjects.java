package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;

import junit.framework.Assert;

public class MPEpisodeVersionObjects extends TxBase{
	
	
    ExcelUtils ProductBrowserData = new ExcelUtils();
	
	ExcelUtils VersionData = new ExcelUtils();
		
	Screen productscreen = new Screen();
	
	
	
	public void MPEpisodeVersion() throws FindFailed, HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		
		screen.wait((double) 2.0);
		
        String MataVaultLibrary = "Pictures\\WopImages\\MataVaultLibrary.PNG";
		
        imageFindClick(MataVaultLibrary ,10);
		
        screen.wait((double) 3.0);
        
        String MataVaultLibraryTitles = "Pictures\\WopImages\\MataVaultLibraryTitles.PNG";
		
        imageFindClick(MataVaultLibraryTitles ,10);
        
        screen.wait((double) 4.0);
       
        String AdvancedSearch = "Pictures\\WopImages\\AdvancedSearch.PNG";
		
        imageFindClick(AdvancedSearch ,10);

        screen.wait((double) 5.0);
        
        String EnterAmcnField = "Pictures\\WopImages\\EnterAmcnFiedl.PNG";
		
        imageEnterText(EnterAmcnField, WOPEpisodeVersion.rlacheckpoint,10);
        
        //imageEnterText(EnterAmcnFiedl, "RLA178218.2",10);
        
		Clickenter();
		
		screen.wait((double) 4.0);
			
		try {
		
        String ResultClick = "Pictures\\WopImages\\ResultClick.PNG";
		
        imageFindClick(ResultClick ,10);		
		
        screen.wait((double) 7.0);
        
        logStep("WOP to MP Integration is Success");
        
        logStep("WOP to MP Integration Data:" + WOPEpisodeVersion.rlacheckpoint);
        
        System.out.println("WOP to MP Integration Data:" + WOPEpisodeVersion.rlacheckpoint);
        
        //logStep("WOP to MP Integration Data:" + "RLA177304.2");
        
       //System.out.println("WOP to MP Integration Data:" + "RLA177304.2");
        
		} catch(Exception e) {
			
			logStep("WOP to MP Integration is failed");
			
			System.out.println("WOP to MP Integration is failed");
			
			Assert.fail(String.format("WOP to MP Intehration is failed..." , e.getMessage())) ;
						
		}
        
		screen.wait((double) 2.0);
		
		// Taking Fields 
		
		String MPAMCNID = "Pictures\\WopImages\\MPAMCNID.PNG";
		   
		imagedoubleclickcopyText(MPAMCNID,10);
		
		String mpAMCNID = "AMCNID:";
		   
		mpEpisodeVersionData(mpAMCNID);
		
		screen.wait((double) 2.0);
	    
		String MPShowType = "Pictures\\WopImages\\MPShowType.PNG";
		
		imagecopyText(MPShowType,10);
		
		String  mpShowType= "ShowType:"; 
		
		mpEpisodeVersionData(mpShowType);
	
		
		tabforProductionmode();
		
		String MPProductionMode = "Pictures\\WopImages\\MPProductionMode.PNG";
		
		imagecopyText(MPProductionMode,10);
		
		String  mpProductionMode= "ProductionMode:"; 
   		
		mpEpisodeVersionData(mpProductionMode);
	    
		
		String mporgin = "Pictures\\WopImages\\mpOrigin.PNG";
		
	    imagecopyText(mporgin,10);
		
		String  mpOrigin= "Origin:"; 
		
		mpEpisodeVersionData(mpOrigin);
		
	    
	    String MPSecurityStatus = "Pictures\\WopImages\\MPSecurityStatus.PNG";
		
	    imagecopyText(MPSecurityStatus,10);
		
		String  mpSecurityStatus= "SecurityStatus:"; 
		
		mpEpisodeVersionData(mpSecurityStatus);
	    
	    
	    String MPEditRestricted = "Pictures\\WopImages\\MPEditRestricted.PNG";
		
		imagecopyText(MPEditRestricted,10);
		
		String  mpEditRestricted= "EditRestricted:"; 
		
		mpEpisodeVersionData(mpEditRestricted);
	    	    
	  
	    String MPEpisodeVersionType = "Pictures\\WopImages\\MPEpisodeVersionType.PNG";
		
		imagecopyText(MPEpisodeVersionType,10);
		
		String  mpEpisodeVersionType= "EpisodeVersionType:"; 
		
		mpEpisodeVersionData(mpEpisodeVersionType);
		
		
		String MPOwnerNetwork = "Pictures\\WopImages\\MPOwnerNetwork.PNG";
		   
		imagedoubleclickcopyText(MPOwnerNetwork,10);
		
		String MPOwner = "Ownernetwork:";
		   
		mpEpisodeVersionData(MPOwner);
		
		screen.wait((double) 2.0);
			
		String MPSupplier = "Pictures\\WopImages\\MPSupplier.PNG";
		   
		imagedoubleclickcopyText(MPSupplier,10);
		
		String MPSupp = "Supplier:";
		   
		mpEpisodeVersionData(MPSupp);
		
		
		try {
			
		screen.wait((double) 2.0);
		
		String MPEpisodeNumber = "Pictures\\WopImages\\MPEpisodeNumber.PNG";
		   
		imagedoubleclickcopyText(MPEpisodeNumber,10);
		
		String MPEpi = "EpisodeNumber:";
		   
		mpEpisodeVersionData(MPEpi);
		
		}catch(Exception e) {
			
			System.out.println("Unable to Fetch Episode Number Value.. ");
		}
		
		try {
			
			screen.wait((double) 2.0);
			
			String MPAiringOrder = "Pictures\\WopImages\\MPAiringOrder.PNG";
			   
			imagedoubleclickcopyText(MPAiringOrder,10);
			
			String MPAir = "AiringOrder:";
			   
			mpEpisodeVersionData(MPAir);
			
			}catch(Exception e) {
				
				System.out.println("Unable to Fetch MPAiringOrder Value.. ");
			}
		
		
		String MPTheatricalLength = "Pictures\\WopImages\\MPTheatricalLength.PNG";
		   
		imagedoubleclickcopyText(MPTheatricalLength,10);
		
		String MPLength = "ExpectedDuration:";
		   
		mpEpisodeVersionData(MPLength);
		
		screen.wait((double) 2.0);
				
	          
        
	}
	
        
	
}

