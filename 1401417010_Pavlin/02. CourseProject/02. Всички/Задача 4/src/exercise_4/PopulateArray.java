package exercise_4;

public class PopulateArray extends Exercise_4 {
    
    protected static int counter = 0;   
            
    protected static void condition() {
        
        System.out.println("За ръчно запълване, въведете \"add\".");
        System.out.println("За автоматично, въведете \"auto\".");
        System.out.print("Въведи: ");
        
        switch (input.nextLine()) {
            case "add":
                populateArray();
                break;
            case "auto":
                autoPopulateArray();
                break;
            default:
                System.out.println("\nВъведете нещо смислено.\n");
                break;
        }
    }

    protected static void populateArray() {
        
        if(counter == arr.length) {
            
            System.out.println("Масивът е пълен!");
        }
        
        else {
            System.out.print("Въведи име на града: ");
            
            for (int i = counter; i < arr.length; i++) {

                arr[i] = input.nextLine();

                System.out.print("\n" + arr[i] + " беше записан!\n\n");
                break;
            }
            counter++;
        }
    }
    
    protected static String randTown() {
        
        String[] townsArray = {
            
        "Албена","Асеновград","Ахтопол","Балчик","Банско","Батак","Берковица","Благоевград","Ботевград","Брацигово","Бургас","Бяла Слатина","Варна","Велико Търново",
        "Велинград","Видин","Враца","Габрово","Годеч","Горна Оряховица","Гоце Делчев","Девня","Димитровград","Добрич","Доленица","Долен Чифлик","Дряново","Дупница",
        "Елена","Елин Пелин","Елхово","Етрополе","Златица","Златоград","Исперих","Ихтиман","Казанлък","Карлово","Козлодуй","Кубрат","Кърджали","Кюстендил","Ловеч",
        "Лом","Мездра","Мелник","Монтана","Несебър","Нова Загора","Нови пазар","Омуртаг","Оряхово","Павликени","Пазарджик","Панагюрище","Перник","Петрич","Пещера",
        "Пирдоп","Плевен","Пловдив","Поморие","Попово","Правец","Провадия","Първомай","Разград","Раковски","Русе","Сандански","Свиленград","Свищов","Севлиево",
        "Силистра","Сливен","Смолян","Созопол","София","Стамболийски","Стара Загора","Стражица","Стралджа","Стрелча","Троян","Трявна","Търговище","Харманли",
        "Хасково","Чепеларе","Чирпан","Шумен","Ямбол"
        
        };

        return townsArray[(int)Math.floor(Math.random()*townsArray.length)];
    }
    
    protected static void autoPopulateArray() {
        
        System.out.println("\nМасивът беше запълнен!\n");
        
        for (int i = counter; i < arr.length; i++) {
            
            arr[i] = randTown();
        }
        counter = arr.length;
    }
}
