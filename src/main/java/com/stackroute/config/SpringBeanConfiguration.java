package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    public Actor getActor(){
        return new Actor("rohith","male",22);
    }

    public Actor getActor1(){
        return new Actor("vijay","male",23);
    }
    @Bean(name="movie")
    @Scope("prototype")
    public Movie getMovie(){
        return new Movie(1,"temper",getActor());

    }

    @Bean(name="movie1")
    public Movie getMovie1(){
        return new Movie(2,"rabhasa",getActor1());
    }
}