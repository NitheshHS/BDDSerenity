package UIScreen;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends PageObject {

    String productList = "//h2/descendant::span[text()]";
    String resultText = "//span[contains(text(),'results for')]";

    public List<String> productList(){
        waitForElement().until(ExpectedConditions.visibilityOf($(productList)));
        List<String> list = $$(productList).texts();
        return list;
    }

    public String productResultAfterSearch(){
       return $(resultText).getText();
    }
}
