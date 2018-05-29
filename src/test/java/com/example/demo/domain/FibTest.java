package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FibTest {
  @Test
  public void when_input_1_then_return_1() {
    int result = Fib.getFibIn(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void when_input_2_then_return_1() {
    int result = Fib.getFibIn(2);
    assertThat(result,is(1));
  }

  @Test
  public void when_input_3_then_return_2() {
    int result = Fib.getFibIn(3);
    assertThat(result, is(2));
  }

}