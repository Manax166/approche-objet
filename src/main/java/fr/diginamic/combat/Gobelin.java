package fr.diginamic.combat;

public class Gobelin extends Monstre{
    public Gobelin() {
        super(0, 0, 2);
        this.setForce((int) (5+Math.random()*6));
        this.setPointsDeSante((int) (10+Math.random()*6));
    }
}
