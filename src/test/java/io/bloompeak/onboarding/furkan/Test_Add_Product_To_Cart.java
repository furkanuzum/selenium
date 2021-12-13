package io.bloompeak.onboarding.furkan;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;

public class Test_Add_Product_To_Cart extends Base_Test {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_a_Product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Laptop");
        Assertions.assertTrue(productsPage.isOnProductPage() ,
        " Not on product page");
    }   

    @Test
    @Order(2)
    public void select_a_Product(){
        productDetailPage = new ProductDetailPage(driver);
       productsPage.selectProduct(1);
       Assertions.assertTrue(productDetailPage.isOnProductDetailPage() ,
       " Not on product detail page");
    }

    @Test
    @Order(3)
    public void add_Product_a_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp() ,
        " Product count did not increase ");
    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkİfProductAdded() ,
        " product was not added to cart");
    }




}
