package com.springJDBC;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages= {"com.springJDBC"})
public class JlcConfig {

	@Bean
	public DataSource getDS() {
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/jlcdb");
		bds.setUsername("root");
		bds.setPassword("sbootdb");
		bds.setMaxActive(25);
		bds.setInitialSize(5);
		return bds;
	}
	
	@Bean
	public JdbcTemplate getT(DataSource ds) {
		return new JdbcTemplate(ds);
		
	}
}
