package com.liyosi.services;

import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class SetterGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello, am injected by the setter";
  }
}
