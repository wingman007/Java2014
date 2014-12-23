package towns_array;

import java.util.Scanner;

public class TownsArray {

    private static int counter = 0;
    
    protected static String[] arr = new String[50];
    
    protected static Scanner input = new Scanner(System.in, "windows-1251");
    
    public static void main(String[] args) {
        
        menu();
    }
    
    private static void menu() {
        
        System.out.println("МЕНЮ:");
        System.out.println("1. Въведи стойности в масива.");
        System.out.println("2. Автоматично запълни масива.");
        System.out.println("3. Изпринти целият масив.");
        System.out.println("4. Изпринти само елементи по зададен филтър.");
        System.out.println("5. Изход от програмата.");
        System.out.print("Въведи избора си: ");
        
        switch (input.nextLine()) {
            case "1":
                array();
                menu();
                break;
            case "2":
                autoArray();
                menu();
                break;
            case "3":
                printAll();
                menu();
                break;
            case "4":
                printSpecial();
                menu();
                break;
            case "5":
                System.out.println("Излизане...");
                break;
            default:
                System.out.println("Въведете от 1 до 5!");
                menu();
                break;
        }  
    }
    
    private static void array() {
        
        if(counter == arr.length) {
            
            System.out.println("Масивът е пълен!");
        }
        
        else {
            
            System.out.print("Въведи име на града: ");
            
            for (int i = counter; i < arr.length; i++) {

                arr[i] = input.nextLine();

                System.out.print(arr[i] + " беше записан!\n");
                break;
            }
            counter++;
        }
    }
    
    private static String randTown() {
        
        String[] townsArray = {
            
        "Албена","Асеновград","Ахтопол","Балчик","Банско","Батак","Берковица","Благоевград","Ботевград","Брацигово","Бургас","Бяла Слатина","Варна","Велико Търново",
        "Велинград","Видин","Враца","Габрово","Годеч","Горна Оряховица","Гоце Делчев","Девня","Димитровград","Добрич","Дряново","Дупница","Елена","Елин Пелин","Елхово",
        "Етрополе","Златица","Златоград","Исперих","Ихтиман","Казанлък","Карлово","Козлодуй","Кубрат","Кърджали","Кюстендил","Ловеч","Лом","Мездра","Мелник","Монтана",
        "Несебър","Нова Загора","Нови пазар","Омуртаг","Оряхово","Павликени","Пазарджик","Панагюрище","Перник","Петрич","Пещера","Пирдоп","Плевен","Пловдив","Поморие",
        "Попово","Правец","Провадия","Първомай","Разград","Раковски","Русе","Сандански","Свиленград","Свищов","Севлиево","Силистра","Сливен","Смолян","Созопол","София",
        "Стамболийски","Стара Загора","Стражица","Стралджа","Стрелча","Троян","Трявна","Търговище","Харманли","Хасково","Чепеларе","Чирпан","Шумен","Ямбол"
        
        };

        return townsArray[(int)Math.floor(Math.random()*townsArray.length)];
    }
    
    private static void autoArray() {
        
        System.out.print("Масивът беше запълнен!\n");
        
        for (int i = counter; i < arr.length; i++) {
            
            arr[i] = randTown();
        }
        counter = arr.length;
    }
    
    private static void printAll() {
        
        if(arr[0] == null) {
            
            System.out.println("Масивът е празен.");   
        }
        
        else {
            System.out.println("Въведените стойности в масива са:");

            for (String elements : arr) {

                if (elements == null) {
                    break;
                }

                System.out.print("|" + elements + "|\n");
            }
        }
    }
    
    private static void printSpecial() {
        
        int specialCounter = 0;
        
        if(arr[0] == null) {
            
            System.out.println("Масивът е празен.");   
        }
        
        for (String elements : arr) {
            
            if (elements == null) {
                
                break;
            }
            
            if (elements.matches("^([^реЕ]*[еЕ][^реЕ]*){2,4}$")) {

                System.out.print("|" + elements + "|\n");
                
                specialCounter++;
            }
        }
        
        if(arr[0] != null && specialCounter == 0) {
            
            System.out.println("Няма специални елементи.");
        }
    }
}