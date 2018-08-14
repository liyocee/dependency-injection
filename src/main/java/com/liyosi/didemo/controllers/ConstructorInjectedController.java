package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingService;

/**
 * Created by liyosi on Aug, 2018
 */
public class ConstructorInjectedController {
  private GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  String sayHello() {
    return greetingService.sayGreeting();
  }
}
