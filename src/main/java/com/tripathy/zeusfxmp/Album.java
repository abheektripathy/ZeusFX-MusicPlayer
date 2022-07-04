package com.tripathy.zeusfxmp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<song> songs;
    //instance variables

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<song>();
        // initialising constructor
    }

    public Album(){
        //still dunno what to do with this
    }



    public song findSong(String title){
        /*
          it uses a for loop to iterate through all songs in song class/arraylist and use equals to compare names and returns true false*/

        for(song checkedSong : songs) {
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;


    }

    public boolean addSong(String title, double duration) {
        // this boolean returning function uses function find song to check song is there in database if not then it adds it.
        if(findSong(title) == null){
            songs.add(new song(title,duration));
            System.out.println(title +"Successfully added to the list");
            return true;
        } else {
            System.out.println("Song with name"+ title + "already exist in the list");
            return false;
        }
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<song> PlayList) {
        // adds songs to playlist as a linked list and assigns tracknumber
        int index = trackNumber - 1;
        // indexing in java is from 0 and here tracknumber starts from one so this.
        if(index>0 && index<= this.songs.size()) {
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album doesn't have song with trackNumber" + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<song> Playlist) {
        for(song checkedSong : this.songs) {
            if(checkedSong.getTitle().equals(title)){
                Playlist.add(checkedSong);
                return true;
            }


        }
        System.out.println("There's no such song in album");
        return false;
    }
}
