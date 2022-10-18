package UIScreen;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

//@DefaultUrl("https://www.amazon.in/")
public class HomePage extends PageObject {

    public void navigateToHomePage(){
        open();
    }

    String logo = "#nav-logo-sprites";
    String searchTextField = "#twotabsearchtextbox";
    String searchBtn = "input[type='submit']";

    public boolean isLogoDisplayed(){
       return $(logo).isDisabled();
    }

    public void searchProduct(String productName){
        $(searchTextField).sendKeys(productName, Keys.ENTER);
//        $(searchBtn).click();
    }

}
