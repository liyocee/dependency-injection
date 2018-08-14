package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  public GreetingServiceImpl greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
