package com.liyosi.didemo;

import com.liyosi.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.liyosi.didemo.services", "com.liyosi.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

    System.out.println(controller.fakeDataSource.getPassword());
    System.out.println(controller.fakeDataSource.getUrl());
    System.out.println(controller.fakeDataSource.getUsername());


//    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

//    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
