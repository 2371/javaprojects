package com.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;


@Configuration
@ComponentScan(basePackages = {"com.login.*"})
public class AppConfig {

}
