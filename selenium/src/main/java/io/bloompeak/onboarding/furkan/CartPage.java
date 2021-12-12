package io.bloompeak.onboarding.furkan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;

public class CartPage extends BasePage{
    By productNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-medium");
    public CartPage(WebDriver driver){super(driver);}

    public Boolean checkİfProductAdded() {
        return getProducts().size() > 0; 
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }


}