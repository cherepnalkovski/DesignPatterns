package design.patterns.creational.factory;

public class FactoryDemo {
    public static void main(String args[]) {
        WebSite site = WebSiteFactory.getWebSite(WebSiteType.BLOG);

        System.out.println(site.getPages() );
        site = WebSiteFactory.getWebSite(WebSiteType.SHOP);

        System.out.println(site.getPages() );
    }
}
