package com.musala.training.design.patterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String argsp[]) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in JAVA");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getTitle());
    }
}
