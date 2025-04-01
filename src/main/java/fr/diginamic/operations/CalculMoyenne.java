package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] array = new double[0];
    public void ajout(double newValue){
        agrandirArray();
        array[array.length-1] = newValue;
    }
    public double calcul(){
        double total = 0;
        if(array.length > 0) {
            for (double val : array) {
                total += val;
            }
            total = total/array.length;
        }
        return total;
    }

    private void agrandirArray() {
        double[] temp = new double[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = new double[temp.length+1];
        System.arraycopy(temp, 0, array, 0, temp.length);
    }


}
