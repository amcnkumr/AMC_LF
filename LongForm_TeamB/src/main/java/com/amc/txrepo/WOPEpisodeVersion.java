
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

	public static String duplicateVersion;

	public static String AMCNID;

	public static String rlacheckpoint;

	public static String Execution = "Fail";

	// Episode Version Creation In WOP Product Browser

	public void EpisodeVersionCreation() throws Exception {

		// productscreen.wait((double) 13.0);

		String BrowserSearch = "Pictures\\WopImages\\BrowserSearch.PNG";

		ProductBrowserData.readingexcelFiles("ProductBrowserData");

		imageEnterText(BrowserSearch, ProductBrowserData.excelData[1][0], 10);

		Clickenter();

		String AmcnIDField = "Pictures\\WopImages\\AmcnIDField.PNG";

		imageClickAndTab(AmcnIDField, 5);

		productscreen.wait((double) 2.0);

		String AmcnField2 = "Pictures\\WopImages\\AmcnField2.PNG";

		imageEnterText(AmcnField2, ProductBrowserData.excelData[1][1], 10);

		Clickenter();

		String VersionMA = "Pictures\\WopImages\\VersionMA.PNG";

		imageDoubleClick(VersionMA, 5);

		productscreen.wait((double) 5.0);

		String Supplier = "Pictures\\WopImages\\Supplier.PNG";

		imageEnterText(Supplier, "Miramax", 10);

		for (int i = 0; i <= 2; i++) {

			Clickenter();
		}

		productscreen.wait((double) 2.0);

		String ProductionMode = "Pictures\\WopImages\\ProductionMode.PNG";

		imagecopyText(ProductionMode, 10);

		String wopProductionMode = "ProductionMode:";

		wopEpisodeVersionData(wopProductionMode + TxBase.textvalue);

		productscreen.wait((double) 2.0);

		tabforMAVersion();

		tabforMAVersion();

		String expectedDuration = "Pictures\\WopImages\\ExpDuration.PNG";

		imagedoubleclickcopyText(expectedDuration, 10);

		String wopTheatricalLength = "ExpectedDuration:";

		wopEpisodeVersionData(wopTheatricalLength + TxBase.textvalue);

		// Taking Asset Source Field

		productscreen.wait((double) 2.0);

		String Tv = "Pictures\\WopImages\\TV.PNG";

		imageFindClick(Tv, 10);

		screen.wait((double) 1.0);

		tabforMAVersion();

		String Type = "Pictures\\WopImages\\Type.PNG";

		imagecopyText(Type, 10);

		String woptype = "AssetSource:";

		wopEpisodeVersionData(woptype + TxBase.textvalue);
			
		TxBase.mpEpisodeVersionData.add(woptype + TxBase.textvalue);

		screen.wait((double) 2.0);
		
		/*// Taking Season Field
		
		String season = "Pictures\\WopImages\\season.PNG";

		imagecopyText(season, 10);

		String wopseason = "Season:";

		wopEpisodeVersionData(wopseason + TxBase.textvalue);
		
		screen.wait((double) 2.0);
		*/
		// Taking Episode Number

		String EpisodeNumber = "Pictures\\WopImages\\EpisodeNumber.PNG";

		imagecopyText(EpisodeNumber, 10);

		String wopEpisodeNumber = "EpisodeNumber:";

		wopEpisodeVersionData(wopEpisodeNumber + TxBase.textvalue);

		productscreen.wait((double) 2.0);

		// Taking Airing Order

		String AiringOrder = "Pictures\\WopImages\\AiringOrder.PNG";

		imagecopyText(AiringOrder, 10);

		String wopAiringOrder = "AiringOrder:";

		wopEpisodeVersionData(wopAiringOrder + TxBase.textvalue);

		// Taking Show Type

		String ShowType = "Pictures\\WopImages\\ShowType.PNG";

		imagecopyText(ShowType, 10);

		String wopShowType = "ShowType:";

		wopEpisodeVersionData(wopShowType + TxBase.textvalue);

		tabforMAVersion();

		tabforMAVersion();

		// Taking Distributor Field

		productscreen.wait((double) 2.0);

		String Distributor = "Pictures\\WopImages\\Distributor.PNG";

		imagecopyText(Distributor, 10);

		String wopDistributor = "Distributor:";

		wopEpisodeVersionData(wopDistributor + TxBase.textvalue);
		
		TxBase.mpEpisodeVersionData.add(wopDistributor + TxBase.textvalue);

		productscreen.wait((double) 2.0);

		// Taking Security Status

		String SecurityStatus = "Pictures\\WopImages\\Secure.PNG";

		imagedoubleclickcopyText(SecurityStatus, 10);

		String wopSecurityStatus = "SecurityStatus:";

		wopEpisodeVersionData(wopSecurityStatus + TxBase.textvalue);

		// Taking Edit Restricted

		String EditRestricted = "Pictures\\WopImages\\EditRestricted.PNG";

		imagecopyText(EditRestricted, 10);

		String wopEditRestricted = "EditRestricted:";

		wopEpisodeVersionData(wopEditRestricted + TxBase.textvalue);

		// Taking Ownernetwork Field

		productscreen.wait((double) 2.0);

		String EOwnernetwork = "Pictures\\WopImages\\EOwnernetwork.PNG";

		imagecopyText(EOwnernetwork, 10);

		String wopEOwnernetwork = "Ownernetwork:";

		wopEpisodeVersionData(wopEOwnernetwork + TxBase.textvalue);
		
		
		productscreen.wait((double) 2.0);
		
		// Taking Origin Field
		
		String origin = "Pictures\\WopImages\\Origin.PNG";

		imagecopyText(origin, 10);

		String woporigin = "Origin:";

		wopEpisodeVersionData(woporigin + TxBase.textvalue);
		

		// Taking Title Field

		productscreen.wait((double) 2.0);

		String Titlesicon = "Pictures\\WopImages\\Titlesicon.PNG";

		imageFindClick(Titlesicon, 10);

		productscreen.wait((double) 3.0);

		String titleone = "Pictures\\WopImages\\Titlesone.PNG";

		imageFindClick(titleone, 10);

		productscreen.wait((double) 2.0);

		String titlecolor = "Pictures\\WopImages\\Titlecolour.PNG";

		imagedoubleclickcopyText(titlecolor, 10);

		String woptitile = "Title:";

		wopEpisodeVersionData(woptitile + TxBase.textvalue);
		
		TxBase.mpEpisodeVersionData.add(woptitile + TxBase.textvalue);
		
		productscreen.wait((double) 2.0);

		VersionData.readingexcelFiles("EPVersionData");

		// Product Version Selection

		Version:

		for (int i = 1; i <= VersionData.lastRow; i++) {

			String ProductMenu = "Pictures\\WopImages\\ProductMenu.PNG";

			imageFindClick(ProductMenu, 10);

			String NewVersionItem = "Pictures\\WopImages\\NewVersionItem.PNG";

			imageFindClick(NewVersionItem, 10);

			productscreen.wait((double) 4.0);

			String FindBar = "Pictures\\WopImages\\FindBar.PNG";

			imageEnterText(FindBar, VersionData.excelData[i][0], 10);

			productscreen.wait((double) 4.0);

			String CheckBox = "Pictures\\WopImages\\CheckBox.PNG";

			imageFindClick(CheckBox, 10);

			productscreen.wait((double) 4.0);

			String ClearFindBar = "Pictures\\WopImages\\ClearFindBar.PNG";

			imageClearText(ClearFindBar, 10);

			productscreen.wait((double) 4.0);

			String FindBar2 = "Pictures\\WopImages\\FindBar2.PNG";

			imageEnterText(FindBar2, VersionData.excelData[i][1], 10);

			productscreen.wait((double) 4.0);

			String CheckBox1 = "Pictures\\WopImages\\CheckBox.PNG";

			imageFindClick(CheckBox1, 10);

			productscreen.wait((double) 4.0);

			String VersionOkButton = "Pictures\\WopImages\\VersionOkButton.PNG";

			imageFindClick(VersionOkButton, 10);

			// Selected Version Duplicate

			productscreen.wait((double) 3.0);

			try {

				for(int save=0;save<=1;save++) {
				
				String SaveChanges = "Pictures\\WopImages\\SaveChanges.PNG";

				imageFindClick(SaveChanges, 10);
				
				productscreen.wait((double) 1.0);
				
				}

				productscreen.wait((double) 3.0);

			} catch (Exception e) {

				System.out.println("No Save Changes Winow is Displayed");
			}

			try {

				String SelectedVersionDuplicateWindow = "Pictures\\WopImages\\SelectedVersionDuplicateWindow.PNG";

				imageFindClick(SelectedVersionDuplicateWindow, 10);

				duplicateVersion = "Selected Version Already Exist";

				productscreen.wait((double) 2.0);

			} catch (Exception e) {

				System.out.println("No Duplicate Version Exists");

			}

			if (duplicateVersion == "Selected Version Already Exist") {

				System.out.println("Duplicate Version Exist and Try For Another Version");

				duplicateVersion = null;

				String MARLA = "Pictures\\WopImages\\MARLA.PNG";

				imageFindClick(MARLA, 10);

				productscreen.wait((double) 3.0);

			} else {

				System.out.println("Selected Version:" + VersionData.excelData[i][0] + VersionData.excelData[i][1]);

				logStep("Episode Verison Creation is Success");

				break Version;
			}

		}

	}

	// Linking Media Asset to Created Version

	public void servicesCheckPoint() throws java.lang.Exception {
		
		
		
		String save = "Pictures\\WopImages\\SavePrototype.PNG";

		imageFindClick(save, 10);

		productscreen.wait((double) 2.0);
				
		String EpisodeVersionType = "Pictures\\WopImages\\EpisodeVersionType.PNG";

		imagecopyText(EpisodeVersionType, 10);

		String wopEpisodeVersionType = "EpisodeVersionType:";

		wopEpisodeVersionData(wopEpisodeVersionType + TxBase.textvalue);

		productscreen.wait((double) 2.0);

		String General = "Pictures\\WopImages\\General.PNG";

		imageFindClick(General, 10);

		productscreen.wait((double) 130.0);

		// Checkpoint to Validate WOP Services

		try {

			String CheckPoint = "Pictures\\WopImages\\CheckPoint.PNG";

			imagecopyDecimalText(CheckPoint, 10);

			rlacheckpoint = ProductBrowserData.excelData[1][1] + ".2";

			// rlacheckpoint="RLA177304.2";

			if (rlacheckpoint.contains("RLA")) {

				logStep("WOP Services Up And Running :" + rlacheckpoint);

				// logStep("WOP Services Up And Running :" + rlacheckpoint);

				System.out.println(" WOP Services UP And Running:" + rlacheckpoint);

				// System.out.println(" WOP Services UP And Running:" + rlacheckpoint);

				Execution = "Pass";

			} else {

				logStep("WOP Services are not Up & Running");

				System.out.println("WOP Services are not Up&Running");

				Execution = "Fail";

				Assert.fail(
						"Id was not changed to RLA,-WOP services are not running..." + rlacheckpoint.contains("RLA"));

			}

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

			Execution = "Fail";

		}

	}

	// WOP Source Data:

	public void wopSourceData() throws FindFailed {

		AMCNID = ProductBrowserData.excelData[1][1];

		String amcnId = "AMCNID:";

		wopEpisodeVersionData(amcnId + rlacheckpoint);

		

		String supplier = "Miramax";

		String suppli = "Supplier:";

		wopEpisodeVersionData(suppli + supplier);

		
		productscreen.wait((double) 4.0);
	

	}

}
