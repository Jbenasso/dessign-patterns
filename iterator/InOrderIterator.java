package iterator;

import java.util.Iterator;
import java.util.List;

public class InOrderIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;

    public InOrderIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
