package com.liyosi.didemo.services;

/**
 * Created by liyosi on Aug, 2018
 */
public class SetterGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello, am injected by the setter";
  }
}
