package iterator;

public class Song {
    private String title;
    private String artist;
    private double length;
    private Genre genre;

    public Song(String title, String artist, double length, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getLength() { return length; }
    public Genre getGenre() { return genre; }

    @Override
    public String toString() {
        return String.format("%s by %s (%.2f min, %s)", title, artist, length, genre);
    }
}
