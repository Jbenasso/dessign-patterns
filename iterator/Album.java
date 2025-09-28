package iterator;

import java.util.*;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSong(String title, String artist, double length, Genre genre) {
        songs.add(new Song(title, artist, length, genre));
    }

    public Iterator<Song> createInOrderIterator() {
        return new InOrderIterator(songs);
    }

    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(songs);
    }
}
