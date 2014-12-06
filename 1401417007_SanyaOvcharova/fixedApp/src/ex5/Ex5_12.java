package ex5;

/**
 *
 * @author SanyaNo
 */
public class Ex5_12 {
    /*
     * Декларитайте клас който може да върне броя на обектите си.
     */

    static int counter = 0;

    public static void main(String[] args) {
    }

    Ex5_12() {
        counter++;
    }

    public static void getNumberInst() {
        System.out.println("The number of instances of this class is " + counter);
    }
}
