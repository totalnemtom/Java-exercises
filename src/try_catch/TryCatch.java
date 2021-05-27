package try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("C://Users//KomPhone//Desktop//file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
