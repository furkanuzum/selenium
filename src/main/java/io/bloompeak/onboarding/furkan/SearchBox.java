package io.bloompeak.onboarding.furkan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SearchBox extends BasePage{
    By searchBoxLocator = By.id("twotabsearchtextbox");
    By submitButtonLocator = By.id("now-search-submit-button");

    public SearchBox (WebDriver driver){
        super(driver);
    }

    public void search(String text){
        type(searchBoxLocator, text);
        click(submitButtonLocator);
    }
}
