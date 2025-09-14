package singleton;

/**
 * A Song is just one track in the jukebox.
 * Has the title, artist, and the file it plays from.
 */
public class Song {
    private String title;
    private String artist;
    private String filePath;

    /**
     * Makes a new Song with all its info.
     *
     * @param title name of the song
     * @param artist who made it
     * @param filePath file where the song lives
     */
    public Song(String title, String artist, String filePath) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
    }

    /**
     * Returns the song as text like: "Song Title by Artist".
     */
    @Override
    public String toString() {
        return title + " by " + artist;
    }

    /**
     * Actually plays the song using SongPlayer.
     */
    public void play() {
        SongPlayer.play(filePath);
    }
}
