package volume_to_mass;

public class VolumeToMassMain {

    public static void main(String[] args) {

        Figures figure;
        
        if (Input.validationChoice() == 1) {
            
            figure = new Parallelepiped();
        }
        
        else {
            
            figure = new Sphere();
        }
        
        figure.typeParameters();
        System.out.println("Масата на фигурата е " + figure.calculateMass());
    }
}
