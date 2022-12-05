package config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import keywords.UIKeywords;
import keywords.Waitfor;

public class HomeTwo {
	@FindBy(xpath = "//div[@class=\"desktop-navLink\"]/a[contains( text(), 'Men')]")
	public WebElement MenMenu;
	@FindBy(xpath = "//a[@href='men-tshirts'] ")
	public WebElement MenTshirt;
	@FindBy(xpath = "//a[contains(text(),\"Topwear\")]")
	public WebElement menu_Topwear;
	@FindBy(xpath = "//a[contains(text(),'Formal Shirts')]")
	public WebElement FormalShirts;
	@FindBy(xpath = "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]")
	public WebElement CasualShirt;
	@FindBy(xpath = "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Sweatshirts')]")
	public WebElement sweatshirts;
	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[@class=\"product-base\"]/a[@href=\"sweatshirts/hm/hm-men-black-relaxed-fit-hoodie/15193748/buy\"]")
	public WebElement onesweatshirt;
	@FindBy(xpath = "//img[@title=\"max Men Black Turtle Neck Sweater\"]")
	public WebElement Swe;
	@FindBy(xpath = "//img[@src=\"https://assets.myntassets.com/w_245,c_limit,fl_progressive,dpr_2.0/assets/images/2022/9/19/d037de3b-59e8-4b09-b5a0-420cbc0f62e81663583369408-Main-Banner---Desktop-Template_02.jpg\"]")
	public WebElement nintypercentoffbutton;
	@FindBy(xpath = "//ul[@class='gender-list']/li[1]")
	public WebElement genderselect;
	@FindBy(xpath = "//img[@src=\"https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/12883616/2021/10/27/bae9798d-7980-4b30-8512-6977173e38bc1635332259431ZaveriPearlsGold-PlatedWhiteKundanPearlsStudedMultistrandCho1.jpg\"]")
	public WebElement whitenecklless;

	public HomeTwo() {
		PageFactory.initElements(UIKeywords.driver, this);
	}

	public void clickOnWhitneckless() {
		UIKeywords.click(whitenecklless);
	}

	public void clickOngenderselect() {
		UIKeywords.click(genderselect);

	}

	public void hoverOnMenMenu() {
		UIKeywords.mouseMove(MenMenu);
	}

	public void clickOnMenTshirt() {
		UIKeywords.click(MenTshirt);
	}

	public void clickOnCasualShirt() {
		UIKeywords.click(CasualShirt);
	}

	public void clickOnSweatShirt() {
		UIKeywords.click(sweatshirts);
	}

	public void clickOnOneSweatShirt() {
		UIKeywords.click(onesweatshirt);
	}

	public void clickOnSwe() {
		UIKeywords.click(Swe);
	}

	public void clickOnnintypercentoffbutton() {
		UIKeywords.click(nintypercentoffbutton);
	}

	public void clickOnFormalShirts() {
		Waitfor.time(3);
		UIKeywords.click(FormalShirts);
	}
}
