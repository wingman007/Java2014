package plant;

public class PlantMain {

    public static void main(String[] args) {
        
        Plants plant1 = new Plants("Бамбук", 2, 7);
        
        Plants plant2 = new Plants("Бегония", 1, 2, "март", "юни");
        
        priceSum(plant1, plant2);
    }
    
    protected static void priceSum(Plants plant1, Plants plant2) {
        
        System.out.println("Сумата от цените на две дадени декоративни растения е " + (plant1.getPrice() + plant2.getPrice()));
    }
}
