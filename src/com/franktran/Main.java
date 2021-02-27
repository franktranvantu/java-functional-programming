package com.franktran;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
      List<String> ingredients = Arrays.asList(
          "flour",
          "salt",
          "baking powder",
          "butter",
          "eggs",
          "milk"
      );

//      ingredients.forEach(ingredient -> System.out.println(ingredient));

      Consumer<String> printInConsole = ingredient -> System.out.println(ingredient);
      ingredients.forEach(printInConsole);
    }
}
