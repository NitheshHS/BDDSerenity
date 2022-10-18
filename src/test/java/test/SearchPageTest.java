package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;
import steps.SearchPageSteps;

import java.util.Arrays;

@RunWith(SerenityRunner.class)
public class SearchPageTest extends BaseTest{

    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private SearchPageSteps searchPageSteps;

    @Before
    public void open(){
        homePageSteps.navigateToUrl();
    }

    @Test
    public void verifyTheSearchResult(){
        homePageSteps.searchProduct("iPhone");
        searchPageSteps.verifyTheSearchResult();
    }
    
}
