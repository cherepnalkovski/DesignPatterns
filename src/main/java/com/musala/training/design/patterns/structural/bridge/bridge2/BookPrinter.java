package com.musala.training.design.patterns.structural.bridge.bridge2;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {

    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected String getHeader() {
        return book.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title" , book.getTitle()));
        details.add(new Detail("Author" ,book.getAuthor()));
        details.add(new Detail("Pages" , book.getPages() + ""));
        return details;
    }
}
