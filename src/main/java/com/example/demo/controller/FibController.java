package com.example.demo.controller;

import com.example.demo.domain.Fib;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fib")
public class FibController {



  @RequestMapping(path = "/{index}", method = RequestMethod.GET)
  public Integer getFib(@PathVariable int index) {
    return Fib.getFibIn(index);
  }
}