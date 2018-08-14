package com.liyosi.didemo.services;

/**
 * Created by liyosi on Aug, 2018
 */
public class GreetingServiceImpl implements GreetingService {

  public static final String HELLO_GURUS = "Hello Gurus!!!";

  @Override
  public String sayGreeting() {

    System.out.println("Hello buddy!");

    return HELLO_GURUS;
  }
}
