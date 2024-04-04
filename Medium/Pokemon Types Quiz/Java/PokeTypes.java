import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
public class PokeTypes {
    public static void main(String[] args) throws Exception {

    }
    public static Map<String, List<String>> getPokeTypes() {
        // look two directories upward to get the "pokemon.json" file 
        // if the file is in the same directory, you can just use: new File("pokemon.json")
        String path = new File(".").getParentFile().getParent() + "/pokemon.json";
        

    }
}
