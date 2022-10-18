package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseTest{

    @Steps
    private HomePageSteps homePageSteps;

    @Before
    public void openURL(){
        homePageSteps.navigateToUrl();
    }

    @Test
    public void verifyLogoDisplayedInHomePage(){
        homePageSteps
                .verifyLogoIsDisplayed();
    }

}
