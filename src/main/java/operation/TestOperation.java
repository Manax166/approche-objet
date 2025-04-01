package operation;

public class TestOperation {
    public static void main(String[] args){
        Operation[] tab = {
                new Credit("26/03/2025", 27.55),
                new Credit("25/03/2025", 54.71),
                new Debit("24/03/2025", 15.50),
                new Debit("23/03/2025", 20.00)
        };
        double total = 0;
        for(Operation val : tab){
            System.out.println(val);
            System.out.println(val.getType());
            if(val.getType().equals("CREDIT")) total += val.getMontant();
            else total -= val.getMontant();
        }
        System.out.println(total);
    }
}
