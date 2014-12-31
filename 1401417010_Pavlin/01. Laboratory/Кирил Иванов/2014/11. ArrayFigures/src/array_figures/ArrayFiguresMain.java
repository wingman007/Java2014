package array_figures;

import java.util.Arrays;

public class ArrayFiguresMain {

    public static void main(String[] args) {
        
        int number = Input.validationNumber();
        
        String[][] arr = new String[number][4];
        
        for (String[] elements : arr) {
            
            elements[0] = Input.validationName();
            
            switch(elements[0]) {
                
                case "кръг":
                    System.out.println("Изисква се радиусът \"r\" на кръга.");
                    elements[1] = Input.validationDouble();

                    Figures circle = new Circle(Double.parseDouble(elements[1]));
                    elements[3] = Double.toString(circle.calculateSurface());
                break;
                    
                case "правоъгълник":
                    System.out.println("Изисква се страна \"a\" и страна \"b\" на правоъгълника.");
                    elements[1] = Input.validationDouble();
                    elements[2] = Input.validationDouble();

                    Figures rectangle = new Rectangle(Double.parseDouble(elements[1]), Double.parseDouble(elements[2]));
                    elements[3] = Double.toString(rectangle.calculateSurface());
                break;
                    
                case "триъгълник":
                    System.out.println("Изисква се страна \"a\" и височината към нея \"h\" на триъгълника.");
                    elements[1] = Input.validationDouble();
                    elements[2] = Input.validationDouble();

                    Figures triangle = new Triangle(Double.parseDouble(elements[1]), Double.parseDouble(elements[2]));
                    elements[3] = Double.toString(triangle.calculateSurface());
                break;
            }
        }
        
        System.out.println("Данните за фигурите в обратен ред са:");
        
        for(int i = arr.length -1; i >= 0; i--) {
            
            for(int j = 0; j < arr[i].length -1; j++) {
                
                if(arr[i][j] == null) {
                    continue;
                }
                
                System.out.print("| " + arr[i][j] + " ");
            }
            System.out.println("|");
        }
        
        int index = 0;
        String name = "";
        double maxSurface = 0;

        for(int i = 0; i < arr.length; i++) {
            
            if(maxSurface < Double.parseDouble(arr[i][3])) {
                
                index = i;
                name = arr[i][0];
                maxSurface = Double.parseDouble(arr[i][3]);
            }
        }
        
        System.out.println("\nМаксималното лице е " + maxSurface);
        System.out.println("Фигурата е \"" + name + "\".");
        System.out.println("Индексът и е " + index);
        
        System.out.println("\nДанните на копието са:");
        
        String[][] arrCopy = Arrays.copyOfRange(arr, index, index+1);
        
        for (String[] elements : arrCopy) {
            
            for (int j = 0; j < elements.length - 1; j++) {
                
                if (elements[j] == null) {
                    continue;
                }
                
                System.out.print("| " + elements[j] + " ");
            }
            System.out.println("|");
        }  
    }
}
