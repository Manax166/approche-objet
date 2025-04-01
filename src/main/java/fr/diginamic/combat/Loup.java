package fr.diginamic.combat;

public class Loup extends Monstre{
    public Loup() {
        super(0, 0, 1);
        this.setForce((int) (3+Math.random()*6));
        this.setPointsDeSante((int) (5+Math.random()*6));
    }
}
