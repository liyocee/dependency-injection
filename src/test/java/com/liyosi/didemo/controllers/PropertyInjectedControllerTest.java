package com.liyosi.didemo.controllers;

import com.liyosi.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by liyosi on Aug, 2018
 */
public class PropertyInjectedControllerTest {

  private PropertyInjectedController propertyInjectedController;

  @Before
  public void setUp() throws Exception {
    this.propertyInjectedController = new PropertyInjectedController();
    this.propertyInjectedController.greetingService = new GreetingServiceImpl();
  }

  @Test
  public void testGreeting() throws Exception {
   assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello()) ;
  }

}
