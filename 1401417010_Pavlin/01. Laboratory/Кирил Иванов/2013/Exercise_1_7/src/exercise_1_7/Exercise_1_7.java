package exercise_1_7;

public class Exercise_1_7 {

    public static void main(String[] args) {
        
        CylindricalCup cup = new CylindricalCup("кристал", 5, 20);
        cup.getParam();
        
        Fruits fruit =  new Fruits(Input.validationName(), Input.validationWeight(), Input.validationVolume100g());
        
        Volume volume = new Volume();
        
        volume.canFit(fruit, cup);
    }
}
