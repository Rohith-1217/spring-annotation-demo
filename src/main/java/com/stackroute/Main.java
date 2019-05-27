package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import com.stackroute.domain.Actor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);

        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1);

        Movie movie2 = (Movie) ctx.getBean("movie");
        System.out.println(movie2);

        System.out.println(movie == movie2);
        Movie movie3 = (Movie) ctx.getBean("movie");

        Movie movie4 = (Movie) ctx.getBean("movie1");


        System.out.println("Autowiring Done = " + "Id : " + movie3.getId() + " Movie Name=" + movie3.getMovieName() + " actor was " + movie3.getActor());

        ctx.close();
    }
}