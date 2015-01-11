package exercise_1_6;

public class Volume {

    protected void canFit(Sphere ball, Parallelepiped carton) {
        
        System.out.printf("Обемът на топката е %.3f.\n", ball.calculateVolume());
        System.out.println("Обемът на кашона е " + carton.calculateVolume() + ".");
        
        if(ball.calculateVolume() <= carton.calculateVolume()) {
            
            System.out.println("\nТопката МОЖЕ да се побере в кашона.");
        }
        
        else {
            
            System.out.println("\nТопката НЕ МОЖЕ да се побере в кашона.");
        }
    }
}
