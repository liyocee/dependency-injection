package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.FakeDataSource;
import com.liyosi.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class MyController {

  private GreetingService greetingService;

  @Autowired
  public FakeDataSource fakeDataSource;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public void hello() {
    System.out.println(greetingService.sayGreeting());
  }
}
