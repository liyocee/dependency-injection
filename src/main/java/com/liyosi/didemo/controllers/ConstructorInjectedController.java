package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class ConstructorInjectedController {

  private GreetingService greetingService;

  @Autowired
  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
