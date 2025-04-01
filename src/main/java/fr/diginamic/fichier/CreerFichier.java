package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreerFichier {
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("./src/main/resources/recensement.csv");
        String file = Files.readString(path);
        String[] lines = file.split("\n", 101);
        Path filePath = Paths.get("./src/main/java/fr/diginamic/fichier/file.csv");
        Files.deleteIfExists(filePath);
        Files.createFile(Paths.get(filePath.toUri()));
        String allLines = "";
        for(int i = 0; i<lines.length-1; i++){
            allLines += lines[i]+"\n";
        }
        Files.writeString(filePath,allLines);

    }
}
