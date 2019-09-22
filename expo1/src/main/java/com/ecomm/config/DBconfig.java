package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.model.Category;
import com.ecomm.model.Product;
import com.ecomm.model.Supplier;
import com.ecomm.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class DBconfig {

	// creating the datasource bean 
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/cdtjepart2");
		datasource.setUsername("cdtjerahulpart2");
		datasource.setPassword("cdtjerahulpart2");
		System.out.println("=========Data source Object is Created=========");
		return datasource;
	}
		//Creating a session Factory Bean
		
		@Bean (name="sessionFactory")
		public SessionFactory getSessionFactory()
		{
			Properties hibernateProperties=new Properties();
			hibernateProperties.put("hibernate.hdm2ddl.auto","update");
			hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
			hibernateProperties.put("hibernate.show_sql", true);
			LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(this.getH2DataSource());
			factory.addProperties(hibernateProperties); 
			
			factory.addAnnotatedClass(Category.class);
			factory.addAnnotatedClass(Product.class);
			factory.addAnnotatedClass(Supplier.class);
			//factory.addAnnotatedClass(UserDetail.class);
			
			SessionFactory sessionFactory=factory.buildSessionFactory();
			System.out.println("=========SessionFactory Object Created===========");
			return sessionFactory;
		 }

		//Creating a HibernateTransactionManager Bean
        
		@Bean(name="txManager")
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
		{
			System.out.println("==========Hibernate Transaction Manager Object Created========");
			return new HibernateTransactionManager(sessionFactory);
		}

}

