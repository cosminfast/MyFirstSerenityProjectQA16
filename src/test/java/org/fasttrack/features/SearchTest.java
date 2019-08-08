package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest  {


    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
   private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchForProductTest(){
        loginSteps.navigateToHomepage();
        searchSteps.searchForKeyword("men");
        searchSteps.checkProductInResults("SUEDE LOAFER, NAVY");
    }

}
