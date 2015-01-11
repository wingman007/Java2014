package exercise_3;

public class Exercise_3 {
            
    protected static String[] arr = new String[10];

    public static void main(String[] args) {
        
        populateArray();
        
        printArray();
        
        printSpecialArray();
    }
    
    private static String[] populateArray() {
                
        for(int i = 0 ; i < arr.length; i++) {
            
            arr[i] = randNames(); 
        }

        return arr;
    }
    
    private static String randNames() {
        
        String[] arrayNames = {
            
        "Инна Иванова Стоянова","Иванка Анева Пелова","Ана Иванова Гогова","Ненка Монева Караиванова","Денислава Драганова Черешарова",
        "Силвия Иванова Кирилова","Даниела Стоянова Спасова","Павлета Иванова Стоянова","Жанета Иванова Тодорова","Мирослава Дениславова Ватева",
        "Саня Недялкова Овчарова","Екатерина Захариева Александрова","Гергана Иванова Попова","Христина Спасова Каджелянска","Мария Тодорова Генова"
                
        };

        return arrayNames[(int)Math.floor(Math.random()*arrayNames.length)];
    }
    
    private static void printArray() {
        
        System.out.println("Всички елементи на масива са :");
        for(String elements : arr) {

            System.out.print("|" + elements + "|");
            System.out.println("");
        }
    }
    
    private static void printSpecialArray() {
        
        System.out.println("\nСпециалните елементи на масива са :");
        for(String elements : arr) {

            if(elements.endsWith("а") && (elements.contains("Иван") || elements.contains("иван"))) {
                
                System.out.print("|" + elements + "|");
                System.out.println(""); 
            }
        }
    }
}
