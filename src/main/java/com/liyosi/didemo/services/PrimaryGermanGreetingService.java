package com.liyosi.didemo.services;

/**
 * Created by liyosi on Aug, 2018
 */
public class PrimaryGermanGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }


  @Override
  public String sayGreeting() {
    return "it's sha german kagreet, ke service";
  }
}
