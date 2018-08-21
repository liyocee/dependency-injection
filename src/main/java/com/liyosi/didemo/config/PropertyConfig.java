package com.liyosi.didemo.config;

import com.liyosi.didemo.services.FakeDataSource;
import com.liyosi.didemo.services.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by liyosi on Aug, 2018
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//    @PropertySource("classpath:datasource.properties"),
//    @PropertySource("classpath:jms.yml")
//})
public class PropertyConfig {

  @Autowired
  Environment environment;

  @Value("${liyosi.username}")
  String user;

  @Value("${liyosi.password}")
  String password;

  @Value("${liyosi.dburl}")
  String url;

  @Value("${liyosi.jms.url}")
  String jmsUrl;

  @Value("${liyosi.jms.username}")
  String jmsUser;

  @Value("${liyosi.jms.password}")
  String jmsPassword;


  @Bean
  public FakeDataSource fakeDataSource () {

    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUrl(url);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUsername(environment.getProperty("USERNAME"));

    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker () {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();

    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    fakeJmsBroker.setUsername(jmsUser);

    return fakeJmsBroker;
  }

//  @Bean
//  public static PropertySourcesPlaceholderConfigurer properties () {
//    return new PropertySourcesPlaceholderConfigurer();
//  }

}
