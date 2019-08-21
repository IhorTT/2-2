package net.ukr.tigor;

import java.io.FileWriter;
import java.io.IOException;

public class TextContainer {

    private String myString = "Save me!";

    public TextContainer() {

    }

    @Saver
    public void saveToDisk(String path){
        try (FileWriter pw = new FileWriter(path)) {
            pw.write(myString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
