package fr.diginamic.recensement;

public class Departement {
    private int code;
    private int popDept;

    public Departement(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public int getPopDept() {
        return popDept;
    }

    public void setPopDept(int popDept) {
        this.popDept = popDept;
    }
}
