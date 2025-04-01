package fr.diginamic.recensement;

public class Region {
    private int code;
    private int popRegion;

    public Region(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public int getPopRegion() {
        return popRegion;
    }

    public void setPopRegion(int popRegion) {
        this.popRegion = popRegion;
    }
}
