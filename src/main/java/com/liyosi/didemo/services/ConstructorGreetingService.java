package com.liyosi.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello, am injected by the ctor";
  }
}
