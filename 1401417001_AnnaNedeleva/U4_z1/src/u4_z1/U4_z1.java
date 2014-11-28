/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4_z1;

/**
 *
 * @author User
 */
public class U4_z1 {
    
    public static void низовеЗапочващиС(String m[], String search){

    System.out.println("Низове започващи с " + search + ":");
    for(String element:m)
        if(element.startsWith(search))
        System.out.println(element);
    }

    public static void низовеЗапочващиС_2(String m[], String search){

        System.out.println("Низове започващи с " + search + ":");
        for(int i=0; i<m.length; i++)
            if(m[i].trim().toLowerCase().startsWith(search.toLowerCase()))
            System.out.println(m[i].trim());
        // ако желаем " ивайло" да попада в резултата от търсенето, може условието да е следното
    }
    
    public static void низовеСъдържащи(String m[], String search){

        System.out.println("Низове съдържащи " + search + ":");
        for(int i=0; i<m.length; i++)
        if(m[i].toLowerCase().contains(search.toLowerCase()))
            System.out.println(m[i]);
    }
    
    public static void сГолемиБукви(String m[]){
        System.out.println("Низове с големи букви:");
        for (String element:m){
            if (element.matches("[А-Я]*"))
                System.out.println(element);
        }
    }
    
    public static void започващисГолеми(String m[]){
        System.out.println("Низове започващи с големи букви:");
        for (String element:m)
            if (element.startsWith("[А-Я]"))
            System.out.println(element);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String imena[] = {"Иван", "МАРИЯ", "Петър", "Иванка", "Марин", " ивайло"};
        низовеЗапочващиС_2(imena, "Ив");
        низовеСъдържащи(imena,"ин");
        сГолемиБукви(imena);
        започващисГолеми(imena);
        // TODO code application logic here
    }
    
}
