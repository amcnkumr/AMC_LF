package com.amc.Testclasess.execute;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.MPEpisodeVersionObjects;
import com.amc.txrepo.WOPEpisodeVersion;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class MPEpisodeVersionTest extends TxBase {
	
	MPEpisodeVersionObjects mpepisode = new MPEpisodeVersionObjects();
	
	
	
	@Features("Long Form Data Integration")

	@Stories("MP")

	@Title("WOP to MP Integration")
	
	@Test	
	public void MPEpisodeVersionIntegrationTest() throws java.lang.Exception {
				
		Thread.sleep(2000);
		
		if(WOPEpisodeVersion.Execution.equalsIgnoreCase("Fail")) {
			
			logStep("WOP is Not Up and Running");
			
			Assert.fail("WOP is Not Up and Running");
			
		}
		else {
		
		mpepisode = PageFactory.initElements(driverWOP, MPEpisodeVersionObjects.class);
		
		mpepisode.MPEpisodeVersion();
		
		
		
	}
	
	
	}
}

