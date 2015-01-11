package exercise_1_7;

public class Volume {

    protected void canFit(Fruits juice, CylindricalCup cup) {
        
        System.out.println("Обемът на сокът е " + juice.calculateVolume());
        System.out.printf("Обемът на чашата е %.3f\n", cup.calculateVolume());
        
        if(juice.calculateVolume() <= cup.calculateVolume()) {
            
            System.out.println("\nСокът МОЖЕ да се побере в чашата.");
        }
        
        else {
            
            System.out.println("\nСокът НЕ МОЖЕ да се побере в чашата.");
        }
    }
}
