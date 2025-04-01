package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String args[]) throws IOException {
        List<Ville> listVilles = new ArrayList<>();
        Path path = Paths.get("./src/main/resources/recensement.csv");
        String[] files = Files.readString(path).split("\n");
        //readAllLines permet de générer une liste ce qui évite de faire le split
        for(String line : files){
            if(files[0].equals(line)) continue;
            String[] fragments = line.split(";");
            System.out.println(fragments[9]);
            listVilles.add(new Ville(fragments[6], fragments[0], fragments[1], Integer.parseInt(fragments[9].replaceAll(" ", ""))));
        }
        //System.out.println(listVilles);
        Path filePath = Paths.get("./src/main/java/fr/diginamic/fichier/biggestcities.csv");
        Files.deleteIfExists(filePath);
        Files.createFile(Paths.get(filePath.toUri()));
        String fileContent = "Nom de la ville; Code département; Nom de la région; Population totale\n";
        for(Ville ville : listVilles){
            if(ville.getPopTotale() > 25000) fileContent += ville.toString();
        }
        Files.writeString(filePath, fileContent);
        //System.out.println(Files.readString(path));
    }
}
