package encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {
        
        Fibonacci_Sequence object = new Fibonacci_Sequence();

        for(int i = 0; i <= 10; i++) {
        
            System.out.println(object.getSequence(i));
        }
    }
}
