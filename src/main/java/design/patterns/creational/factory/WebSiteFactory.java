package design.patterns.creational.factory;

import design.patterns.creational.factory.blogPages.Blog;
import design.patterns.creational.factory.shopPages.EShop;

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

