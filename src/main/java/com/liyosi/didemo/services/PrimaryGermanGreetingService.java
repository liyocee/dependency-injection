package com.liyosi.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Primary
@Profile("ge")
public class PrimaryGermanGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "it's sha german kagreet, ke service";
  }
}
