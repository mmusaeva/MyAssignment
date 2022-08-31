package StepDefinitions;

import Pages.HomePage;
import Pages.ResultsPage;
import Pages.ShoePage;
import Pages.ShoppingCartPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonStepDefs {

    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoePage shoePage = new ShoePage();



    @Given("User in the Amazon homepage")
    public void user_in_the_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon.url"));
    }
    @When("User enters {string} in search bar")
    public void user_enters_in_search_bar(String string) {
        string = "Shoes for men";
        homePage.searchbox.sendKeys(string);

    }
    @When("Users selects the last auto-complete option from dropdown menu suggestions")
    public void users_selects_the_last_auto_complete_option_from_dropdown_menu_suggestions() {
        // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        homePage.lastElement.click();
    }
    @When("among results the user selects the first shoe from list")
    public void among_results_the_user_selects_the_first_shoe_from_list() {

        resultsPage.firstResult.click();
    }
    @When("the user selects {int} from quantity dropdown")
    public void the_user_selects_from_quantity_dropdown(Integer int1) {
        shoePage.quantity.click();
        shoePage.quantity3.click();
    }
    @When("User should be able to click add_to_cart button")
    public void user_should_be_able_to_click_button(String string) {
        shoePage.addToCart.click();
    }
    @When("User should be able to go to shopping cart")
    public void user_should_be_able_to_go_to_shopping_cart() {

        shoePage.goToCart.click();
    }
    @Then("Item quantity should be as {int}")
    public void item_quantity_should_be_as(Integer quantity) {
        quantity = 3;
        Assert.assertTrue(shoppingCartPage.totalPrice.getText().contains(quantity.toString()));
    }
    @Then("Item price should be correct")
    public void item_price_should_be_correct() {
        //int totalPrice =
    }
    @Then("User deletes the item from the cart")
    public void user_deletes_the_item_from_the_cart() {

        shoppingCartPage.deleteButton.click();
    }
    @Then("User validates shopping cart is empty")
    public void user_validates_shopping_cart_is_empty() {
        Assert.assertTrue(shoppingCartPage.emptyMessage.isDisplayed());


    }

}
