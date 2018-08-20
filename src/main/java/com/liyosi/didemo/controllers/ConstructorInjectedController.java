package com.liyosi.didemo.controllers;

import com.liyosi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class ConstructorInjectedController {

  private GreetingService greetingService;

  @Autowired
  public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
