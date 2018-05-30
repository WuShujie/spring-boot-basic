package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnagramTest {
  @Test
  public void should_return_empty_list_given_empty_string() {
    List<String> result = Anagram.of("");
    Assert.assertEquals(result.size(), 0);
  }

  @Test
  public void should_return_a_given_a() {
    List<String> result = Anagram.of("a");
    Assert.assertEquals(result.get(0), "a");
  }

  @Test
  public void should_return_ab_N_ba_given_ab() {
    List<String> result = Anagram.of("ab");
    System.out.println(result);
    Assert.assertEquals(result.contains("ab"), true);
    Assert.assertEquals(result.contains("ba"), true);
  }

  @Test
  public void should_return_abc_acb_bac_bca_cab_cba_given_abc() {
    List<String> result = Anagram.of("abc");
    System.out.println(result);
    Assert.assertEquals(result.contains("abc"), true);
    Assert.assertEquals(result.contains("acb"), true);
    Assert.assertEquals(result.contains("bac"), true);
    Assert.assertEquals(result.contains("bca"), true);
    Assert.assertEquals(result.contains("cab"), true);
    Assert.assertEquals(result.contains("cba"), true);
  }

  @Test
  public void should_return_24_elements_given_abcd() {
    List<String> result = Anagram.of("abcd");
    Assert.assertEquals(result.size(), 24);
  }
}
