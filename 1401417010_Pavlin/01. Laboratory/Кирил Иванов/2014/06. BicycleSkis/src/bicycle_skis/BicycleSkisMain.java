package bicycle_skis;

public class BicycleSkisMain {

    public static void main(String[] args) {
        
        Bicycle bicycle = new Bicycle("Планинаско колело", 689.95);
        Ski ski = new Ski(1.3, 0.2, 237);
        
        System.out.println(bicycle);
        System.out.println(ski);

        System.out.println("По-ниската цена е : " + compareProducts(ski, bicycle));
    }
    
    private static double compareProducts(Products pr1, Products pr2) {
        return (pr1.getPrice() < pr2.getPrice()) ? pr1.getPrice() : pr2.getPrice(); 
    } 
}
