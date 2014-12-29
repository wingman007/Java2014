package batches;

public class BatchesMain {

    public static void main(String[] args) {
        
        Batch apples = new Batch("Ябълки", 5, 2);
        
        Batch oranges = new Batch(Input.validationName(), Input.validationQuantity(), Input.validationPricePerKg());
        
        BatchesFunctions batches = new BatchesFunctions();
        
        batches.overallQuantity(apples, oranges);
        
        batches.averagePricePerKg(apples, oranges);
    }
}
