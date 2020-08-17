package com.amc.Testclasess.execute;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import com.amc.txbase.TxBase;
import com.amc.txrepo.DryRunObj;

import ru.yandex.qatools.allure.annotations.Features;

import ru.yandex.qatools.allure.annotations.Title;

public class DryRun extends TxBase {
	
	DryRunObj dd= new DryRunObj();
	
	Screen productscreen = new Screen();
	
	@Features("Dry Test")
	 
	@Title("ValidatingexpectedField")
	
	@Test(priority=1)
	public void ValidatingexpectedField() throws Exception {
		
		
		/*String MPAssetSource = "Pictures\\WopImages\\MPAssetSource.PNG";
		   
		imagedoubleclickcopyText(MPAssetSource,10);
		
		String mpAssetsource = "AssetSource:";
		   
		mpEpisodeVersionData(mpAssetsource);*/
		
	    
		String MPTitle = "Pictures\\WopImages\\MPTitle.PNG";
		   
		imagedoubleclickcopyText(MPTitle,10);
		
		String MPtitle = "Title:";
		   
		mpEpisodeVersionData(MPtitle);
   	    
		
	}
	

	

}
