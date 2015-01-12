package zad2v;

import java.util.Random;

public class Zad2v {

    public static void main(String[] args) {

        int[] arr = generateArray(6);
        double average = getAverage(arr);
        System.out.println("average ->" + average);
    }

    /*
     * Generiram masiva s random generator ot -100 do 100
     */
    private static int[] generateArray(int elementsCount) {

        RandomGenerator rg = new RandomGenerator();
        int[] toReturn = new int[elementsCount];
        int counter = 0;
        int element;

        while (counter < elementsCount) {
            element = rg.nextInt(-100, 100);
            toReturn[counter] = element;
            System.out.println(counter + " => " + element);
            counter++;
        }
        return toReturn;
    }

    /*
     * Tuk trqbva da napravim funkcia ili s drugi dumi metod chrez koito da izpulnbil uslovieto na zadachata no tui kato 
     * predstava si niamam kakvo e cheten indeks......
     */
    private static double getOddIndex(int[] arr) {
        int elementsSum = 0;
        int elementsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (/*uslovieto kato razberem kakvo e cheten indeks go formulirame tuk :D*/) {
                /*Tuka volizat operaciite*/
            }
        }

    }

}

/*
 * Ekstendvam Random
 */
class RandomGenerator extends Random {

    public int nextInt(int lower, int upper) {
        return nextInt((upper - lower + 1)) + lower;
    }
}
