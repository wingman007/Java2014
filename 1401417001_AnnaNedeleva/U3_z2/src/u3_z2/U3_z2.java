/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_z2;

/**
 *
 * @author User
 */
public class U3_z2 {
    
    public static void средноАритметично(double m[]) {
        double suma = 0; // в тази променлива ще записваме сумата
        for (int i = 0; i < m.length; i++)
            suma += m[i];
        double rezultat = suma / m.length;
        System.out.println("Средно аритметичната сума е: " + rezultat);
        }
    
    public static void сумаНаПоложителнитеЕлементи(double m[]) {
        double suma = 0;
        for (int i = 0; i < m.length; i++)
        if (m[i] > 0)
        suma += m[i];
        System.out.println("Сумата на положителните елементи: " + suma);
    }
    
    public static void средноКвадратично(double m[]) {
        double suma = 0;
        for (int i = 0; i < m.length; i++)
            suma += Math.pow(m[i], 2);
        double rezultat = Math.sqrt(suma);
        System.out.println("Средно квадратично: " + rezultat);
    }

    public static void сумаОтКвадратите(double m[]) {
        double suma = 0;
        for (int i = 0; i < m.length; i++)
            if (m[i] > 3)
            suma += Math.pow(m[i], 2);
        System.out.println("zad 5: " + suma);
    }
    
    public static void сумаОтАбсолютнитеСтойности(double m[]) {
    double suma = 0;
    for (int i = 0; i < m.length; i++)
       suma += Math.abs(m[i]);
    System.out.println("zad 6: " + suma);
    }

    public static void максималенЕлемент(double m[]) {
    double maxElement = m[0]; // избираме първия елемент от масива за максимален
    for (int i = 1; i < m.length; i++)
        if (maxElement < m[i]) // ако текущия елемент e по-голям от максималния
            maxElement = m[i]; // задаваме текущия като максимален
    System.out.println("Максимален елемент: " + maxElement);
}

    public static void минималенЕлемент(double m[]) {
        double minElement = m[0];
        for (int i = 1; i < m.length; i++)
            if (minElement < m[i])
            minElement = m[i];
        System.out.println("Минимален елемент: " + minElement);
    }
    
    public static void сумаОтЕлементиНаЧетнаПозиция(double m[]) {
    double suma = 0;
    for (int i = 0; i < m.length; i+=2)
    //if (i % 2 == 0) // Ако остатъка при делене на индекса i на 2 е нула, значи i е четно
    suma += m[i];
        System.out.println("Сума от числата на четна позиция: " + suma);
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double m[] = { 4.5, -8.5, 9, -3, 8 };
        средноАритметично(m);
        сумаНаПоложителнитеЕлементи(m);
        сумаОтКвадратите(m);
        максималенЕлемент(m);
        сумаОтЕлементиНаЧетнаПозиция(m);
        // TODO code application logic here
    }
    
}
