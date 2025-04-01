package fr.diginamic.recensement;

import fr.diginamic.recensement.Ville;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
    List<Ville> listVilles = new ArrayList<>();
    Path path = Paths.get("./src/main/resources/recensement.csv");
    public Recensement(){
        try {
            initListVilles();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void initListVilles() throws IOException {
        List<String> lines = Files.readAllLines(path);
        for(String line : lines){
            if(lines.get(0).equals(line)) continue;
            String[] fragments = line.split(";");
            listVilles.add(new Ville(Integer.parseInt(fragments[0]), fragments[1], fragments[2], Integer.parseInt(fragments[5]), fragments[6],Integer.parseInt(fragments[9].replaceAll(" ", ""))));
        }
    }

    public List<Ville> getListVilles() {
        return listVilles;
    }
}
