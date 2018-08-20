package com.liyosi.didemo.controllers;

import com.liyosi.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

;

/**
 * Created by liyosi on Aug, 2018
 */
public  class SetterInjectedControllerTest {
  private SetterInjectedController setterInjectedController;

  @Before
  public void setUp() {
    this.setterInjectedController = new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello()) ;
  }

}
