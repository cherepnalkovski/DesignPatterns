package design.patterns.creational.factory.blogPages;

import design.patterns.creational.factory.WebSite;
import design.patterns.creational.factory.blogPages.AboutPage;
import design.patterns.creational.factory.blogPages.ContactPage;
import design.patterns.creational.factory.blogPages.PostPage;

public class Blog extends WebSite {
    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
