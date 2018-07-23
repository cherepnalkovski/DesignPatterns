package com.musala.training.design.patterns.creational.factory.shopPages;

import com.musala.training.design.patterns.creational.factory.WebSite;

public class EShop extends WebSite {

    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
