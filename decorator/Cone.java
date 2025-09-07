import java.util.ArrayList;

/**
 * Cone class extends IceCream.
 * Reads ASCII art from cone.txt file.
 */
public class Cone extends IceCream {

    public Cone() {
        asciiArt = FileReader.getLines("txt/cone.txt");
        numScoops = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : asciiArt) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
