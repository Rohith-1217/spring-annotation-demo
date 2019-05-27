package com.stackroute.domain;

public class Movie {

    private int id;
    private String movieName;
    private Actor actor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(int id, String movieName, Actor actor) {
        this.id = id;
        this.movieName = movieName;
        this.actor = actor;
    }


}