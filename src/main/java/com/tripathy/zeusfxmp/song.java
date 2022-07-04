package com.tripathy.zeusfxmp;

public class song {
    String title;
    double duration;
    //instance variables

    public song(String name, double duration){
        this.title = name;
        this.duration= duration;
        //constructor to initialise instance variables

    }

    public String getTitle() {
        return title;
        // getters
    }

    public double getDuration() {
        return duration;
        // getters
    }

    public song(){
        // even i dont know whats this for

    }

    @Override
    public String toString() {
        return "song{" +
                "name='" + title + '\'' +
                ", duration=" + duration +
                '}';
        //returns properties of class overriding existing to string func
    }



}
