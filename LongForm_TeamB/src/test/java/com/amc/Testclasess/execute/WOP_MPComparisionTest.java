package com.amc.Testclasess.execute;


import org.testng.annotations.Test;

import com.amc.txbase.TxBase;

import com.amc.txrepo.WOP_MP_Comparision;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class WOP_MPComparisionTest extends TxBase {

	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Production Mode Field")
	@Test(priority = 1)
	public void ValidateProductionModeTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("ProductionMode:");

	}

	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Expected Duration Field")
	@Test(priority = 2)
	public void ValidateExpectedDurationTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("ExpectedDuration:");

	}
	
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate AssetSource Field")
	@Test(priority = 3)
	public void ValidateAssetSourceTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("AssetSource:");

	}
	
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate EpisodeNumber Field")
	@Test(priority = 4)
	public void ValidateEpisodeNumberTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("EpisodeNumber:");

	}
	
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate AiringOrder Field")
	@Test(priority = 5)
	public void ValidateAiringOrderTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("AiringOrder:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate ShowType Field")
	@Test(priority = 6)
	public void ValidateShowTypeTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("ShowType:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Distributor Field")
	@Test(priority = 7)
	public void ValidateDistributorTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("Distributor:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate SecurityStatus Field")
	@Test(priority = 8)
	public void ValidateSecurityStatusTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("SecurityStatus:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate EditRestricted Field")
	@Test(priority = 9)
	public void ValidateEditRestrictedTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("EditRestricted:");

	}
	
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Ownernetwork Field")
	@Test(priority = 10)
	public void ValidateOwnernetworkTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("Ownernetwork:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Origin Field")
	@Test(priority = 11)
	public void ValidateOriginTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("Origin:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Title Field")
	@Test(priority = 12)
	public void ValidateTitleTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("Title:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate EpisodeVersion Type Field")
	@Test(priority = 13)
	public void ValidateEpisodeVersionTypeTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("EpisodeVersionType:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate AMCNID Field")
	@Test(priority = 14)
	public void ValidateAMCNIDTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("AMCNID:");

	}
	
	
	@Features("Long Form Data Integration")
	@Stories("WOP to MP Data Validations")
	@Title("Validate Supplier Field")
	@Test(priority = 15)
	public void ValidateSupplierTest() throws java.lang.Exception {

		WOP_MP_Comparision comparison = new WOP_MP_Comparision();

		comparison.WOPtoMPDataComparisions("Supplier:");

	}
	
	
	
	
	

}
