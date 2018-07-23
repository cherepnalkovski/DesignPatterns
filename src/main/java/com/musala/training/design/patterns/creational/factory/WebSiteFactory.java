package com.musala.training.design.patterns.creational.factory;

import com.musala.training.design.patterns.creational.factory.blogPages.Blog;
import com.musala.training.design.patterns.creational.factory.shopPages.EShop;

public class WebSiteFactory {

    public static WebSite getWebSite(WebSiteType siteType) {
        switch (siteType) {
            case BLOG:  {
                return new Blog();
            }
            case SHOP: {
                return new EShop();
            }
            default : {
                return null;
            }
        }
    }
}

