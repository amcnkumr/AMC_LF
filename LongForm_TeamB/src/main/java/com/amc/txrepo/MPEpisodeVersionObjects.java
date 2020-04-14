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
	
	
	
	public void MPEpisodeVersion() throws FindFailed {
		
		screen.wait((double) 2.0);
		
        String MataVaultLibrary = "Pictures\\WopImages\\MataVaultLibrary.PNG";
		
        imageFindClick(MataVaultLibrary ,10);
		
        screen.wait((double) 4.0);
        
        String MataVaultLibraryTitles = "Pictures\\WopImages\\MataVaultLibraryTitles.PNG";
		
        imageFindClick(MataVaultLibraryTitles ,10);
        
        screen.wait((double) 4.0);
       
        String AdvancedSearch = "Pictures\\WopImages\\AdvancedSearch.PNG";
		
        imageFindClick(AdvancedSearch ,10);

        screen.wait((double) 5.0);
        
        String EnterAmcnFiedl = "Pictures\\WopImages\\EnterAmcnFiedl.PNG";
		
        //imageEnterText(EnterAmcnFiedl, WOPEpisodeVersion.rlacheckpoint,10);
        
        imageEnterText(EnterAmcnFiedl, "RLA177290.2",10);
        
		Clickenter();
		
		screen.wait((double) 4.0);
			
		try {
		
        String ResultClick = "Pictures\\WopImages\\ResultClick.PNG";
		
        imageFindClick(ResultClick ,10);		
		
        screen.wait((double) 7.0);
        
        logStep("WOP to MP Integration is Success");
        
        logStep("WOP to MP Integration Data:" + WOPEpisodeVersion.rlacheckpoint);
        
        System.out.println("WOP to MP Integration Data:" + WOPEpisodeVersion.rlacheckpoint);
        
		} catch(Exception e) {
			
			logStep("WOP to MP Integration is failed");
			
			System.out.println("WOP to MP Integration is failed");
			
			Assert.fail(String.format("WOP to MP Intehration is failed..." , e.getMessage())) ;
						
		}
        
		screen.wait((double) 2.0);
		
        String MediaAssets = "Pictures\\WopImages\\MediaAssets.PNG";
		
        imageFindClick(MediaAssets ,10);
        
        refresh:
        for(int i=1; i<=20; i++) {
          
        try {
        	
        	String MPChekPoint = "Pictures\\WopImages\\MPChekPoint.PNG";
        	
        	imageFindClick(MPChekPoint,3);
        	
        	break refresh;
        }
          catch(Exception e){
        	  
        	  String Refresh = "Pictures\\WopImages\\Refresh.PNG";
              
              imageFindClick(Refresh,5);
        	  
          }
          
    
        
        }
        
        screen.wait((double) 4.0);
        
        String LSIT = "Pictures\\WopImages\\LSIT.PNG";
        
        imageFindClick(LSIT,5);
		
        imageFindClick(LSIT,5);
	}
	
        
	// WOP Episode Data
	
	public void MPEpisodeData() throws FindFailed, HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		
		screen.wait((double) 4.0);
		
		String Wheel = "Pictures\\WopImages\\Wheel.PNG";
		
		imageFindClick(Wheel, 2);
		
		screen.wait((double) 2.0);			
		
	    String  amcnId= "AMCNID:";  
       
		//mpEpisodeVersionData(amcnId+WOPEpisodeVersion.rlacheckpoint);
		
		TxBase.mpEpisodeVersionData.add(amcnId+WOPEpisodeVersion.rlacheckpoint);
			
		
		String mpScanType = "Pictures\\WopImages\\mpScanType.PNG";
		
		imagedoubleclickcopyText(mpScanType,10);
   		
   		String  scantype= "ExpectedScanType:"; 
   		
   		mpEpisodeVersionData(scantype);
		
		
   	    String mpSegments = "Pictures\\WopImages\\mpSegments.PNG";
   	    
   	    imagedoubleclickcopyText(mpSegments,10);
		
		String  segments= "ExpectedSegments:"; 
		
		mpEpisodeVersionData(segments);
   		
   		
		String mpFrameRate =  "Pictures\\WopImages\\mpFrameRate.PNG";
		
		imagedoubleclickcopyText(mpFrameRate,10);
   		
  		String  framerate= "ExpectedFrameRate:"; 
  		
  		mpEpisodeVersionData(framerate);
   		
   		
  		String mpVideoCodec = "Pictures\\WopImages\\mpVideoCodec.PNG";
  		
  		imagedoubleclickcopyText(mpVideoCodec,10);
   		
   	    String  videocodec= "ExpectedVideoCodec:"; 
		
   	    mpEpisodeVersionData(videocodec);
   	    
   	    
   	    String mpAspectRatio = "Pictures\\WopImages\\mpAspectRatio.PNG";
		
		imagedoubleclickcopyText(mpAspectRatio,10);
		
	    String AspectRatio= "ExpectedAspectRatio:"; 
		
	    mpEpisodeVersionData(AspectRatio);
   		 		
   		
	    String mpFormat = "Pictures\\WopImages\\mpFormat.PNG";
		
		imagedoubleclickcopyText(mpFormat,10);
		
	    String format= "ExpectedFormat:"; 
		
	    mpEpisodeVersionData(format);
   		
   		
        String mpTRT = "Pictures\\WopImages\\mpTRT.PNG";
		
		imagedoubleclickcopyText(mpTRT,10);
		
	    String trt= "ExpectedFormat:"; 
		
	    mpEpisodeVersionData(trt);
   		
   		
   		
   		
   		
		
	}
}

