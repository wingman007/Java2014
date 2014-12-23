package exercise_1;

import java.util.Scanner;

public class Exercise_1 {

    protected static int[] arr = new int[10];
    
    protected static Scanner input = new Scanner(System.in, "windows-1251");

    public static void main(String[] args) {
        
        System.out.println("Да се генерира по случаен начин едномерен масив от цели числа принадлежащи на интервала [–100,100].\n");
        
        populateArray();
        
        menu();
    }
    
    public static void populateArray() {
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = randomWithRange(-100, 100);
            
            System.out.print("|" + arr[i] + "|");
        }
    }
    
    public static int randomWithRange(int min, int max) {
        
        return (int)(Math.random() * (max - min + 1) + min);
    }
    
    public static void menu() {

        System.out.println("\n\nДа се намери:");
        System.out.println("а) сумата на тези елементи, чиято абсолютна стойност надхвърля 30;");
        System.out.println("б) произведението на ненулевите нечетни елементи;");
        System.out.println("в) броят на елементите с четен индекс, които са в интервала [–30,30];");
        System.out.println("г) средно аритметично на елементите, които се делят на 5 без остатък;");
        System.out.println("д) средно квадратично на елементите, чиито пореден номер се дели на 3 без остатък (всяко 3–то);");
        System.out.println("е) средно геометрично на елементите, които принадлежат на интервала (6, 50];");
        System.out.println("ж) средно хармонично на елементите, които не принадлежат на интервала (–6, 50].");
        System.out.println("\nЗа изход напиши \"изход\".\n");
        System.out.print("Въведи избора си: ");
        
        switch (input.nextLine()) {
            case "а":
                AbsoluteValue.absoluteValue();
                menu();
                break;
            case "б":
                OddElements.oddElements();
                menu();
                break;
            case "в":
                EvenIndex.evenIndex();
                menu();
                break;
            case "г":
                Average.average();
                menu();
                break;
            case "д":
                MeanSquare.meanSquare();
                menu();
                break;
            case "е":
                GeometricMean.geometricMean();
                menu();
                break;
            case "ж":
                HarmonicMean.harmonicMean();
                menu();
                break;
            case "изход":
                System.out.println("Излизане...");
                break;
            default:
                System.out.print("\nВъведете от а до ж на кирилица!");
                menu();
                break;
        }  
    }
}