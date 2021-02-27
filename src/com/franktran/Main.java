package com.franktran;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main {

  public static void yell(String words) {
    Objects.requireNonNull(words, () -> "Error when calling API");
    System.out.printf("%s!!!%n", words);
  }

    public static void main(String[] args) {
      List<String> ingredients = Arrays.asList(
          "flour",
          "salt",
          null,
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
