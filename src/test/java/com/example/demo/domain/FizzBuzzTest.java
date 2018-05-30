package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void should_return_1_when_query_value_by_index_when_given_1() {
    String str = new FizzBuzz().queryValueByIndex(1);
    Assert.assertEquals(str, "1");
  }

  @Test
  public void should_return_Fizz_when_query_value_by_index_when_given_3() {
    String str = new FizzBuzz().queryValueByIndex(3);
    Assert.assertEquals(str, "Fizz");
  }

  @Test
  public void should_return_Buzz_when_query_value_by_index_when_given_5() {
    String str = new FizzBuzz().queryValueByIndex(5);
    Assert.assertEquals(str, "Buzz");
  }

  @Test
  public void should_return_FizzBuzz_when_query_value_by_index_when_given_15() {
    String str = new FizzBuzz().queryValueByIndex(15);
    Assert.assertEquals(str, "FizzBuzz");
  }


}
