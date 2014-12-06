
package ex5;

/**
 *
 * @author SanyaNo
 */
public class Ex5_03 {

    /**
     * Създайте няколко обекта от класа дефиниран в Зад. 1. Назначете на
     * обектите различни данни. Накарайте всеки обект да се представи.
     */
    public static void main(String[] args) {
        Ex5_01_04 ivan = new Ex5_01_04("Ivan", "Petrov", 42);
        ivan.intro();
        Ex5_01_04 iordan = new Ex5_01_04("Iordan", "Dimov", 54);
        iordan.intro();
        Ex5_01_04 john = new Ex5_01_04("John", "Smith", 12);
        john.intro();
    }
}
