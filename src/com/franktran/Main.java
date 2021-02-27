package com.franktran;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

  public static void yell(String words) {
    System.out.printf("%s!!!%n", words);
  }

    public static void main(String[] args) {
      List<String> ingredients = Arrays.asList(
          "flour",
          "salt",
          "baking powder",
          "butter",
          "eggs",
          "milk"
      );

//      Consumer<String> printInConsole = System.out::println;

//      ingredients.forEach(System.out::println);

      Main.yell("But I want that cupcake");
      ingredients.forEach(Main::yell);
    }
}
