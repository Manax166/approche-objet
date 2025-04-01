package fr.diginamic.combat;

public class Personnage {
    private int force;
    private int pointsDeSante;

    public Personnage(int force, int pointsDeSante) {
        this.force = force;
        this.pointsDeSante = pointsDeSante;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    public void setPointsDeSante(int pointsDeSante) {
        this.pointsDeSante = pointsDeSante;
    }
}
