package inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

       Human human = new Human();
       human.introduceYourSelf("Иван", "Стоянов", 23);
       
       Student student = new Student();
       student.introduceYourSelf("Станимир", "Стефанов", 21, 1401237312);
    }
}
