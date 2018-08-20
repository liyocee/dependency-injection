package com.liyosi.didemo.services;

/**
 * Created by liyosi on Aug, 2018
 */
public class PrimarySpanishGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hii ni spanish ya Africa, hujambo";
  }
}
