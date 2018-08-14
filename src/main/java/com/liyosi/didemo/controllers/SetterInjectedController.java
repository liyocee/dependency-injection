package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingServiceImpl;

/**
 * Created by liyosi on Aug, 2018
 */
public class SetterInjectedController {

  private GreetingServiceImpl greetingService;

  String sayHello() {
    return greetingService.sayGreeting();
  }

  public void setGreetingService(GreetingServiceImpl greetingService) {
    this.greetingService = greetingService;
  }
}
