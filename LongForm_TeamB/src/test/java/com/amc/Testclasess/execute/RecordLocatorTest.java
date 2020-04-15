package com.amc.Testclasess.execute;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.amc.txbase.TxBase;
import com.amc.txrepo.RecordLocatorObjects;
import com.amc.txrepo.WOPEpisodeVersion;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class RecordLocatorTest extends TxBase {

	RecordLocatorObjects recordLocator;

	
	
	
	@Features("Long Form Data Integration")
	@Stories("Portal")	
	@Title("WOP to MP to Portal Integration")	
	@Test
	
	public void recordSearchField() throws Throwable {
		
       if(WOPEpisodeVersion.Execution.equalsIgnoreCase("Fail")) {
			
			logStep("WOP is Not Up and Running");
			
			Assert.fail("WOP is Not Up and Running");
			
		}else {
		

		recordLocator = PageFactory.initElements(driverWOP, RecordLocatorObjects.class);
		
		recordLocator.recordLocatorSelection();
		
		recordLocator.recordSearchField();
		
		recordLocator.portalMetaDataScreen("ExpectedSegments:","Expected Number of Segments");
		
		recordLocator.portalMetaDataScreen("ExpectedScanType:","Scan Type Expected");
		
		recordLocator.portalMetaDataScreen("ExpectedFrameRate:","Frame Rate Expected");
		
		recordLocator.portalMetaDataScreen("ExpectedAspectRatio:","Aspect Ratio Expected");

		recordLocator.portalMetaDataScreen("ExpectedVideoCodec:","Codec Expected");
		
		recordLocator.portalMetaDataScreen("ExpectedFormat:","Format Expected");
		
		recordLocator.portalMetaDataScreen("EstimatedTRT:","Expected TRT");




	}
    
	
	}
}
