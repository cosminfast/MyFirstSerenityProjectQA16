package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = "a[href*='customer/account'] .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "button[title='Search']")
    private WebElementFacade searchButton;

    public void clickAccount(){
        System.out.println(accountLink.getText());
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

    public void setSearchField(String text){
        typeInto(searchField,text);
    }

    public void clickSearch(){
        clickOn(searchButton);
    }
}
