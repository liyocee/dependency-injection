package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  @Qualifier("greetingServiceImpl")
  public GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
