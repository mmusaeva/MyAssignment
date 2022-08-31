package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchbox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton;



    @FindBy(xpath = "//div[@class='autocomplete-results-container']/div[last()]")
    public WebElement lastElement;

}
