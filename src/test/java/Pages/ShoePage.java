package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoePage {

    @FindBy(id = "a-autoid-37-announce")
    public WebElement quantity;

    @FindBy(xpath = "//div[@class='a-popover-wrapper']//li[@aria-labelledby='quantity_2']/a")
    public WebElement quantity3;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    public WebElement addToCart;

    @FindBy(linkText = "Go to Cart")
    public WebElement goToCart;
}
