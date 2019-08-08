package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps {

    private SearchResultsPage searchResultsPage;
    private HomePage homePage;

    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearch();
    }

    @Step
    public void checkProductInResults(String productName){
        Assert.assertTrue("Product not on the page.",searchResultsPage.isProductOnPage(productName));
    }
}
