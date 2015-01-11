package exercise_1_6;

public class Exercise_1_6 {

    public static void main(String[] args) {
        
        Sphere ball = new Sphere("кожа", 10);
        
        ball.printParam();
        
        System.out.println("Въведете един по един размерите на кашонът (ширина, дължина и височина).\n");
        Parallelepiped carton = new Parallelepiped(Input.validationInt(), Input.validationInt(), Input.validationInt());
        
        carton.printParam();
        
        Volume volume = new Volume();
        volume.canFit(ball, carton);
    }
}
