package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

    @FindBy(xpath = "//div[@id='sc-active-cart']//span[contains(text(), 'Subtotal (3 items)')]")
    public WebElement totalPrice;

    @FindBy(xpath = " //input[@data-action='delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//h1[contains(text(),'Your Amazon Cart is empty')]")
    public WebElement emptyMessage;
}
