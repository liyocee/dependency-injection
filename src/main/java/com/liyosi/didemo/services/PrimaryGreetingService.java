package com.liyosi.didemo.services;

/**
 * Created by liyosi on Aug, 2018
 */
public class PrimaryGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hello - Primary greeting service";
  }
}
