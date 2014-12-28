package exercise_1_8;

public class Exercise_1_8 {

    public static void main(String[] args) {
        
        Sphere sphere = new Sphere(10);
        
        sphere.getParam();
        
        Cube cube = new Cube(sphere.getCubeSide());
        
        cube.getParam();
        cube.calculateVolume(); 
    }
}
