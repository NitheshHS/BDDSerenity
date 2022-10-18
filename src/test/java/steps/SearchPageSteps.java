package steps;

import UIScreen.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchPageSteps {

    SearchPage searchPage;

    @Step
    public void verifyTheSearchResult(){
        int listResult = searchPage.productList().size();
        searchPage.productList().stream().forEach(System.out::println);
        String[] arr = searchPage.productResultAfterSearch().replace("-", " ").split(" ");
        if(Character.isDigit(Integer.parseInt(arr[1])))
        {
            int searchNumber = Integer.parseInt(arr[1]);
            System.out.println(searchNumber);
            Assert.assertTrue(searchNumber >= listResult);
        }else{
            System.out.println("not a number "+Integer.parseInt(arr[1]));
        }
    }
}
