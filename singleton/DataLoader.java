package singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * DataLoader is just here to read the songs.txt file
 * and turn each line into a Song object.
 */
public class DataLoader {
    /**
     * Reads songs.txt line by line and makes Song objects out of it.
     *
     * @return a list of all the songs it found
     */
    public static ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("singleton/songs.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Format in songs.txt is: Title , Artist , FilePath
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String artist = parts[1].trim();
                    String filePath = parts[2].trim();
                    songs.add(new Song(title, artist, filePath));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading songs.txt: " + e.getMessage());
        }
        return songs;
    }
}
