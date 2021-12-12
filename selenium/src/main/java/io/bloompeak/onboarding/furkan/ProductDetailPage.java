package io.bloompeak.onboarding.furkan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage{
    By addToCartButtonLocator = By.id("add-to-cart-button");

    public ProductDetailPage(WebDriver driver){super(driver);}

    public Boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}