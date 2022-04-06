package com;

import java.util.List;

public class Singer {
    private int id;
    private String name;
    private List<String> songs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
    public void  display(){
        System.out.println("Id "+getId());
        System.out.println("Name "+getName());
        List<String> song=getSongs();
        for(String s:song){
            System.out.println(s);
        }
    }
}
