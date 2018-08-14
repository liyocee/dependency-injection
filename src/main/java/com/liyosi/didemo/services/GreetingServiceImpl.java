package com.liyosi.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class GreetingServiceImpl implements GreetingService {

  public static final String HELLO_GURUS = "Hello Gurus!!!";

  @Override
  public String sayGreeting() {

    System.out.println("Hello buddy!");

    return HELLO_GURUS;
  }
}
