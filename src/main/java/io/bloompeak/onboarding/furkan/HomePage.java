package io.bloompeak.onboarding.furkan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator = By.id("nav-cart-count");
    By cartCountainerLocator = By.id("nav-cart-count-container");

    public HomePage(WebDriver driver){
        super(driver);   
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox; 
    }

    public Boolean isProductCountUp() {
        return getCartCount() > 0;        
    }

    public void goToCart() {
        click(cartCountainerLocator);
    }


    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }


}