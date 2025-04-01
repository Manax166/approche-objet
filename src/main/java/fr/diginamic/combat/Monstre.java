package fr.diginamic.combat;

public class Monstre extends Personnage{
    int score;
    public Monstre(int force, int pointsDeSante, int score) {
        super(force, pointsDeSante);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
