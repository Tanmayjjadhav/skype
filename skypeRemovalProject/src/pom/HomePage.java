package pom;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import ganeric.WorkLib;

public class HomePage {

	@FindBy(xpath = "//div[@data-text-as-pseudo-element='Got it!']") private WebElement gotitButtElement;
	@FindBy(xpath = "//div[text()='People, groups, messages']") private WebElement searchBox;
	@FindBy(xpath = "//button[@aria-label='Groups']") private WebElement gruopsButton;
	@FindBy(xpath = "//input[@placeholder='Search Groups']") private WebElement searchGroupsTB;
	@FindBy(xpath="//button[contains(@title,'participants')]") private WebElement participantsButton;
	@FindBy(xpath = "(//button[@role='checkbox' and (@aria-label='Share group via link')])[1]") private WebElement SharegroupLink ;
	@FindBy(xpath = "//div[@style='position: relative; display: flex; flex-direction: column; flex-grow: 0; flex-shrink: 0; overflow: hidden; align-items: center; justify-content: center; padding-left: 15px; padding-right: 15px; border-width: 1px; border-color: rgb(43, 44, 51); border-style: solid; border-radius: 14px; min-height: 30px; opacity: 1; transform: scale(1) translateX(0px) translateY(0px);']") private WebElement removeButton;
	@FindBy(xpath = "//div[@aria-label='GROUP GALLERY']") private WebElement groupGallery;
	@FindBy(xpath = "//button[@aria-label='Show more']") private WebElement showMoreLink;
	@FindBy(xpath = "//div[@role='group' and (@tabindex='0') ] ") private List<WebElement> listOfMembers;
	@FindBy(xpath = "(//div[@role='group' ])[2]") private WebElement parti;




	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}


	public WebElement getGotitButtElement() {
		return gotitButtElement;
	}


	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getGruopsButton() {
		return gruopsButton;
	}


	public WebElement getParticipantsButton() {
		return participantsButton;
	}


	public WebElement getSharegroupLink() {
		return SharegroupLink;
	}


	public WebElement getRemoveButton() {
		return removeButton;
	}


	public WebElement getShowMoreLink() {
		return showMoreLink;
	}



	public WebElement getGroupGallery() {
		return groupGallery;
	}


	public WebElement getSearchGroupsTB() {
		return searchGroupsTB;
	}



	public List<WebElement> getListOfMembers() {
		return listOfMembers;
	}



	public WebElement getParti() {
		return parti;
	}


	public void searchGroup(String groupName) throws InterruptedException, AWTException
	{
		WorkLib wb = new WorkLib();
		wb.doubleClick(gotitButtElement);
		Thread.sleep(3000);
		searchBox.click();
		Thread.sleep(3000);
		gruopsButton.click();
		Thread.sleep(3000);
		wb.activeEle(groupName);
		Thread.sleep(3000);
		wb.hitEnter();
		Thread.sleep(3000);
		wb.hitEnter();
		Thread.sleep(3000);
		participantsButton.click();
		Thread.sleep(1000);
		SharegroupLink.click();
		Thread.sleep(3000);
		// wb.scrollTillperticularWebElement(groupGallery);
		showMoreLink.click();
		Thread.sleep(3000);
		wb.mouseHover(parti);
		wb.mouseHover(removeButton);
		Thread.sleep(3000);
		removeButton.click();
		wb.hitEnter();


	}




}
