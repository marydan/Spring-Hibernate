package com.stackroute.samplemvc;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.stackroute.samplemvc.model.Employee;

@Configuration
@EnableTransactionManagement

public class HibernateConfig {

	@Bean
	public DataSource getDataSource()
	{
		
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ustjdbc");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSession(DataSource ds) throws IOException
	{
		
		LocalSessionFactoryBean sessionbean=new LocalSessionFactoryBean();
		sessionbean.setDataSource(ds);
		Properties property=new Properties();
		property.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		property.put("hibernate.show_sql","true");
		property.put("hibernate.hbm2ddl.auto","update");
		
		sessionbean.setHibernateProperties(property);
		
		sessionbean.setAnnotatedClasses(Employee.class);
		sessionbean.afterPropertiesSet();
		return sessionbean;
		
	}
	
	@Bean
	public HibernateTransactionManager getTransaction(SessionFactory sess)
	{
		HibernateTransactionManager manager=new HibernateTransactionManager();
		manager.setSessionFactory(sess);
     return manager;
	}
	
}
