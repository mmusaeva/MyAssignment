package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage {

    //@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']//h2[1]")
    @FindBy(xpath = "//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']")
    public WebElement firstResult;
}
