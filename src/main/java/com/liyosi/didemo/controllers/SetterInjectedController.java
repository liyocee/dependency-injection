package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by liyosi on Aug, 2018
 */
public class SetterInjectedController {

  private GreetingService greetingService;

  String sayHello() {
    return greetingService.sayGreeting();
  }

  @Autowired
  public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}
