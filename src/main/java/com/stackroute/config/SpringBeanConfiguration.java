package com.stackroute.config;

import com.stackroute.awareinterface.ApplicationContextAwareDemo;
import com.stackroute.awareinterface.BeanFactoryAwareDemo;
import com.stackroute.awareinterface.BeanNameAwareDemo;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name = "actor")
    public Actor getActor(){
        return new Actor("rohith","male",22);
    }

    @Bean(name = "actor1")
    public Actor getActor1(){
        return new Actor("vijay","male",23);
    }
    @Bean(name="movie")
    @Scope("prototype")
    public Movie getMovie(){
        return new Movie(1,"temper",getActor1());

    }

    @Bean(name="movie1")
    public Movie getMovie1(){
        return new Movie(2,"rabhasa",getActor());
    }
/*
    @Bean(name="applicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo(){
        return new ApplicationContextAwareDemo();
    }

    @Bean(name="beanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
        return new BeanFactoryAwareDemo();
    }

    @Bean(name="beanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
        return new BeanNameAwareDemo();
    } */

    @Bean(name={"beanLifecycleDemoBean"},initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifecycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }
}