package com.spring.cloud.master;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zengfeiyue
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.spring.cloud.master.dao")
@EnableCaching
@EnableDiscoveryClient
public class SecurityServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecurityServiceApplication.class, args);
	}
}
