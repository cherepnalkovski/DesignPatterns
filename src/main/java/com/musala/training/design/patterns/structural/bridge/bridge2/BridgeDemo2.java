package com.musala.training.design.patterns.structural.bridge.bridge2;

public class BridgeDemo2 {

    public static void main(String[] args) {

         // Create movie object
         Movie movie = new Movie();
         movie.setTitle("Vikend na mrtovci");
         movie.setRuntime("2h");
         movie.setYear("2000");
         movie.setClassification("Makedonski biseri");

         // instantiate moviePrinter object with movie as a parameter
         Printer moviePrinter = new MoviePrinter(movie);

         // create instance of printFormatter
         Formatter printFormatter = new PrintFormatter();
         //create instance of HTMLFormatter
         Formatter htmlFormatter = new HTMLFormatter();

         // moviePrinter is creating string from movie with the given formatter - PrintFormatter
         String printedMovie =  moviePrinter.print(printFormatter);
         System.out.println(printedMovie);

         // moviePrinter is creating string from movie with the given formatter - HTMLFormatter
         String htmlMovie = moviePrinter.print(htmlFormatter);
         System.out.println(htmlMovie);

         Book book = new Book();
         book.setClassification("Makedonski Biseri");
         book.setAuthor("Stale Popov");
         book.setTitle("Krpen Zivot");
         book.setPages(200);

         Printer bookPrinter = new BookPrinter(book);

         // bookPrinter is creating string from book with the given formatter - PrintFormatter
         String printedBook = bookPrinter.print(printFormatter);
         System.out.println(printedBook);
         // bookPrinter is creating string from book with the given formatter - htmlFormatter
         String htmlBook = bookPrinter.print(htmlFormatter);
         System.out.println(htmlBook);

    }



}
