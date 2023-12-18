package com.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class MyConfig {
	@Value("${jdbc.driverClass}")
	private String driverClass;
	@Value("${jdbc.jdbcUrl}")
	private String jdbcUrl;
	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.password}")
	private String password;
	
	// 配置数据源
	@Bean
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() throws PropertyVetoException {
		return new DataSourceTransactionManager(dataSource());
	}
	
}
