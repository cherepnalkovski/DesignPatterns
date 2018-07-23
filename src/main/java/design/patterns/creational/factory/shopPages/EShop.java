package design.patterns.creational.factory.shopPages;

import design.patterns.creational.factory.WebSite;
import design.patterns.creational.factory.shopPages.CartPage;
import design.patterns.creational.factory.shopPages.ItemPage;
import design.patterns.creational.factory.shopPages.SearchPage;

public class EShop extends WebSite {

    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
