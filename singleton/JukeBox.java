package singleton;

import java.util.ArrayList;

/**
 * This is the JukeBox. Basically it’s the music player for the program.
 * It uses the Singleton thing so there’s only ONE jukebox ever running.
 * It loads songs from the DataLoader and lets you play them.
 */
public class JukeBox {
    /** The one and only JukeBox */
    private static JukeBox jukeBox;

    /** List of all the songs we loaded */
    private ArrayList<Song> songs;

    /**
     * Private so no one else can make a JukeBox.
     * When it starts up, it loads all the songs from DataLoader.
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
    }

    /**
     * Gives back the jukebox. If it doesn’t exist yet,
     * it makes it first, then hands it over.
     *
     * @return the single JukeBox object
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Shows all the songs we loaded up.
     *
     * @return list of songs
     */
    public ArrayList<Song> getAllSongs() {
        return songs;
    }

    /**
     * Play a song from the list. You pass in the number
     * and it finds the right one and plays it.
     *
     * @param num index of the song (starting at 0)
     */
    public void requestSong(int num) {
        if (num >= 0 && num < songs.size()) {
            Song song = songs.get(num);
            System.out.println("Now playing: " + song);
            song.play();
        } else {
            System.out.println("Bad song number, try again.");
        }
    }
}
