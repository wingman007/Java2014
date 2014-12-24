package exercise_2;

import java.util.Scanner;

public class Exercise_2 {
    
    static int[] arr1 = populateArray();
    static int[] arr2 = populateArray();
    static int[] arr3 = populateArray();
    
    protected static Scanner input = new Scanner(System.in, "windows-1251");
    
    public static void main(String[] args) {
        
        System.out.println("Да се генерират по случаен начин 3 едномерни масива от цели числа принадлежащи на интервала [–100,100], всеки от тях с до 20 на брой елементи.\n");

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        
        menu();
    }
    
    public static int[] populateArray() {
        
        int count = randomWithRange(1, 20);

        int[] arr = new int[count];
        
        for(int val = 0 ; val < count; val++) {
            
            arr[val] = randomWithRange(-100, 100); 
        }

        return arr;
    }

    public static int randomWithRange(int min, int max) {
        
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static void printArray(int[] arr) {
        
        for(int elements : arr) {

            System.out.print("|" + elements + "|");
        }

        System.out.println("");
    }
    
    public static void menu() {

        System.out.println("\nДа се намерят и изведат:");
        System.out.println("а) сумата на елементите на всеки масив, както и средноаритметичното на трите суми;");
        System.out.println("б) произведението на ненулевите нечетни елементи на всеки масив, както и средногеометричното на трите произведения;");
        System.out.println("в) броят на елементите на всеки масив, които са с четен индекс и принадлежат на интервала [–30,30], както и максималния от трите броя;");
        System.out.println("г) средно аритметичното на елементите на всеки масив, които се делят на 5 без остатък, както и минималното от трите средно аритметични;");
        System.out.println("д) средно квадратичното на елементите на всеки масив, както и сумата на трите средно квадратични;");
        System.out.println("е) средно геометричното на елементите на всеки масив, които принадлежат на интервала (6, 50], както и произведението на трите средно геометрични;");
        System.out.println("ж) средно хармонично на елементите на всеки масив, които не принадлежат на интервала (–6, 50].");
        System.out.println("\nЗа изход напиши \"изход\".\n");
        System.out.print("Въведи избора си: ");
        
        switch (input.nextLine()) {
            case "а":
                Amount.amount();
                menu();
                break;
            case "б":
                Product.product();
                menu();
                break;
            case "в":
                Number.number();
                menu();
                break;
            case "г":
                ArithmeticMean.arithmeticMean();
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
