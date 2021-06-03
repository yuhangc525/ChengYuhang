package com.codeblock;

public class movie{
    public static void main(String[] args) {
        Movie1 movie = new Movie1("hello");

    }
}

class Movie1 {
    private String name;
    private double price;
    private String director;
    {
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
    }

    public Movie1(String name) {
        this.name = name;
    }

    public Movie1(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie1(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
