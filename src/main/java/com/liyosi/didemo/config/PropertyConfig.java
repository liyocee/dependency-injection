package com.liyosi.didemo.config;

import com.liyosi.didemo.services.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by liyosi on Aug, 2018
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

  @Value("${liyosi.username}")
  String user;

  @Value("${liyosi.password}")
  String password;

  @Value("${liyosi.dburl}")
  String url;

  @Bean
  public FakeDataSource fakeDataSource () {

    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUrl(url);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUsername(user);

    return fakeDataSource;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties () {
    return new PropertySourcesPlaceholderConfigurer();
  }

}
