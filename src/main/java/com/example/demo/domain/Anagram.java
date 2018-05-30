package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

  public static List<String> of(String input) {
    List<String> list = new ArrayList<>();

    if(input.isEmpty()){
      return list;
    }
    
    if (input.length() == 1) {
      list.add(input);
    }

    if (input.length() >= 2) {
      for (int i = 0; i < input.length(); i++) {
        for (int j = 0; j < of(drop(input, i)).size(); j++) {
          String str = input.charAt(i) + of(drop(input, i)).get(j);
          list.add(str);
        }
      }
    }

    return list;
  }

  private static String drop(String input, int index) {
    return new StringBuilder(input).deleteCharAt(index).toString();
  }
}
