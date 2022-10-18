package steps;

import UIScreen.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class HomePageSteps {

    HomePage homePage;

    @Step
    public HomePageSteps navigateToUrl(){
        homePage.open();
        return this;
    }

    @Step
    public void verifyLogoIsDisplayed(){
        Assert.assertTrue(homePage.isLogoDisplayed());
    }

    @Step
    public void searchProduct(String productName){
        homePage.searchProduct(productName);

    }
}
