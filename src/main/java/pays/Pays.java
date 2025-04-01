package pays;

import java.util.Objects;

public class Pays {
    private String name;
    private int population;

    public Pays(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pays p) {
            return Objects.equals(this.name, p.getName()) && this.population == p.getPopulation();
        }
        return false;
    }
}
