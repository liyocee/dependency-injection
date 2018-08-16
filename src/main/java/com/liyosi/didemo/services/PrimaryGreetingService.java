package com.liyosi.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello - Primary greeting service";
  }
}
