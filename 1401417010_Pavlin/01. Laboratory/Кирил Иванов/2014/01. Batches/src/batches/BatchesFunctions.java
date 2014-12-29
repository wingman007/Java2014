package batches;

public class BatchesFunctions {
    
    protected void overallQuantity (Batch product1, Batch product2) {
        
        int overallQuantity = product1.getFruitQuantity() + product2.getFruitQuantity();
        
        System.out.println("Общото количество на две дадени партиди е " + overallQuantity);
    }
    
    protected void averagePricePerKg (Batch product1, Batch product2) {

        double averagePricePerKg = (product1.getPricePerKg() + product2.getPricePerKg()) / 2;

        System.out.println("Средната цена за килограм за две дадени партиди е " + averagePricePerKg);
    }
}
