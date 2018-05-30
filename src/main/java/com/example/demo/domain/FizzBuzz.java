package com.example.demo.domain;

public class FizzBuzz {

  public String queryValueByIndex(int index) {
    if (index % 3 == 0) {
      return "Fizz";
    } else if (index % 5 == 0) {
      return "Buzz";
    } else if ((index % 3 == 0) && (index % 5 == 0)) {
      return "FizzBuzz";
    } else {
      return String.valueOf(index);
    }
  }
}
