package com.cytrogene.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableJpaRepositories this is used in case of multiple DB and bind repo with entity manager.
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "domainsEntityManager",
//        transactionManagerRef = "domainsTransactionManager",
//        basePackages = {"org.springdemo.multiple.datasources.repository.domains"}
//        )+
// @EnableJpaRepositories(
//        entityManagerFactoryRef = "serversEntityManager",
//        transactionManagerRef = "serversTransactionManager",
//        basePackages = {"org.springdemo.multiple.datasources.repository.servers"}
//        )
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced // This is to resolve http://DEPARTMENT-SERVICE/departments/
	public RestTemplate getRestTemplate(){
		return  new RestTemplate();
	}

}
