package exercise_4;

import java.util.Scanner;

public class Exercise_4 {
    
    protected static String[] arr = new String[50];
    
    protected static Scanner input = new Scanner(System.in, "windows-1251");

    public static void main(String[] args) {
        
        menu();
    }

    private static void menu() {
                
        System.out.println("Елементите на масив са имена на населени места, започващи с главна буква. Да се съставят ППГ за:");
        System.out.println("а) въвеждане на елементите на масива (не повече от 50).");
        System.out.println("б) извеждане на екрана на всички населени места, които съдържат в името си подниз \"град\" или \"Град\". Например Ивайловград, Крумовград, Градешница;");
        System.out.println("в) извеждане на екрана на всички населени места, чиито имена започват с \"Долен\". Например Долен Чифлик, Доленица;");
        System.out.println("г) извеждане на екрана на всички населени места, чиито имена се състоят от две думи, разделени с един или няколко интервала. Например Долен Чифлик, Стара Загора;");
        System.out.println("д) извеждане на екрана на всички населени места, чиито имена завършват на \"ово\". Например Хасково, Долно Калугерово.");
        System.out.println("е) извеждане на екрана на всички населени места, в чиито имена буквата \"о\" или \"О\" се среща повече от 3 пъти;");
        System.out.println("ж) извеждане на екрана на всички населени места, в чиито имена буквата \"е\" или \"Е\" се среща 2, 3 или 4 пъти, а буквата \"р\" не се среща нито веднъж;");
        System.out.println("з) намиране на максимална дължина на име на населено място и извеждане на екрана на всички населени места, чиито имена са с тази максимална дължина;");
        System.out.println("и) намиране на средната дължина на име на населено място и извеждане на екрана на всички населени места, чиито имена са с по-малка дължина от средната;");
        System.out.println("й) кодиране/декодиране на имената посредством добавяне/изваждане на число от 1 до 5 към/от кода на всяка буква;");
        System.out.println("к) сортиране в азбучен ред.");
        System.out.println("\nЗа да изпринтиш масива напиши \"print\".");
        System.out.println("\nЗа изход напиши \"exit\".\n");
        System.out.print("Въведи избора си: ");
        
        switch (input.nextLine()) {
            case "а":
                PopulateArray.condition();
                menu();
                break;
            case "б":
                Contains.contains();
                menu();
                break;
            case "в":
                StartsWith.startsWith();
                menu();
                break;
            case "г":
                ContainsSpace.containsSpace();
                menu();
                break;
            case "д":
                EndsWith.endsWith();
                menu();
                break;
            case "е":
                RepeatO.repeatO();
                menu();
                break;
            case "ж":
                RegEx.regEx();
                menu();
                break;
            case "з":
                MaxLength.maxLength();
                menu();
                break;
            case "и":
                AverageLength.averageLength();
                menu();
                break;
            case "й":
                CodingDecoding.choice();
                menu();
                break;
            case "к":
                AlphabeticSort.alphabeticSort();
                menu();
                break;
            case "print":
                PrintArray.printArray();
                menu();
                break;
            case "exit":
                System.out.println("Излизане...");
                break;
            default:
                System.out.print("\nВъведете от а до к на кирилица!\n\n");
                menu();
                break;
        }  
    }
}
