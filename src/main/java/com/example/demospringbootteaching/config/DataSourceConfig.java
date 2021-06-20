package com.example.demospringbootteaching.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    ds.setUrl("jdbc:oracle:thin:@192.168.0.100:1521:xe");
    ds.setUsername("assignment_db");
    ds.setPassword("123456");
    return ds;
  }

  @Bean
  public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
    LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
    sfb.setDataSource(dataSource);
    sfb.setPackagesToScan(new String[]{"com.example.demospringbootteaching"});
    Properties props = new Properties();
    props.setProperty("dialect", "org.hibernate.dialect.OracleDialect");
    sfb.setHibernateProperties(props);
    return sfb;
  }

}
