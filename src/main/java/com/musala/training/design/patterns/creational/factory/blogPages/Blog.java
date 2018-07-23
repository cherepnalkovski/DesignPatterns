package com.musala.training.design.patterns.creational.factory.blogPages;

import com.musala.training.design.patterns.creational.factory.WebSite;

public class Blog extends WebSite {
    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
