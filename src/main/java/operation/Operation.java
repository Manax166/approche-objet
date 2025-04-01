package operation;

public abstract class Operation {
    String date;
    double montant;

    protected Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }
    public abstract String getType();
    public double getMontant() {
        return montant;
    }

}
