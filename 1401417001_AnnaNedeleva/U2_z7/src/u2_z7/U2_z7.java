/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z7;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class U2_z7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Меню"); // Извеждане на менюто в конзолата
        System.out.println(" 1. Теглене на сума");
        System.out.println(" 2. Промяна на PIN");
        System.out.println(" 3. Проверка на наличност");
        System.out.println(" 4. Настройки");
        System.out.println(" 5. Изход");
        System.out.print("Изберете възможност (1-5): ");

        Scanner s = new Scanner(System.in);
        int избор = s.nextInt(); // В променлива “избор” се записва въведеното от конзолата число
        String текст; // В текст ще записваме описание на избраната операция
        
        switch(избор){ /* В зависимост от стойността на „избор”...
        Ако „избор е равно на 1 се изпълняват всички оператори след съвпадението,
        до срещане на оператор за прекъсване(break).
        Ако няма “break”, ще се изпълнят и оператори, които са в следващ “case”.
        Оператор по подразбиране, който се изпълнява ако не е срещнато съвпадение на „избор”
        с case-стойност. */
            case 1: текст = "Вие избрахте 1: Теглене на сума"; break; 
            case 2: текст = "Вие избрахте 2: Промяна на PIN"; break;
            case 3: текст = "Вие избрахте 3: Проверка на наличност"; break;
            case 4: текст = "Вие избрахте 4: Настройки"; break;
            case 5: текст = "Вие избрахте 5: Изход"; break;
            default: текст = "Въвели сте грешен избор!"; 
            }
        System.out.println(текст);
        s.close();
        // TODO code application logic here
    }
    
}
