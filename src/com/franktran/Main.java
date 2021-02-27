package com.franktran;

import java.util.Arrays;
import java.util.List;

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

      boolean hasEggs = false;
//      for (int i = 0; i < ingredients.size(); i++) {
//        String ingredient = ingredients.get(i);
//        if (ingredient.equals("eggs")) {
//          hasEggs = true;
//          break;
//        }
//      }
//      if (hasEggs) {
//        System.out.println("Sorry sweetheart! It has eggs :(");
//      }

//      for (String ingredient : ingredients) {
//        if (ingredient.equals("eggs")) {
//          hasEggs = true;
//          break;
//        }
//      }
//      if (hasEggs) {
//        System.out.println("Sorry sweetheart! It has eggs :(");
//      }

      if (ingredients.contains("eggs")) {
        System.out.println("sorry sweetheart! It has eggs :(");
      }
    }
}
