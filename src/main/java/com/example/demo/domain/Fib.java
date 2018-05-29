package com.example.demo.domain;

public class Fib {

  private Fib() {
  }
  public static int getFibIn(int index) {
    int fib2 = 1;
    int fib1 = 1;
    if (index == 1) {
      return fib1;
    }
    if (index == 2) {
      return fib2;
    }
    return getFibIn(index - 1) + getFibIn(index - 2);
  }
}
