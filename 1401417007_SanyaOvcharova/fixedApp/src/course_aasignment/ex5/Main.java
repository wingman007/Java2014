package course_aasignment.ex5;


/*
 * Съставете програма, която сравнява две ЕГН-та и 
 * извежда съобщение, кой от притежателите им е по-млад.
 */
/**
 *
 * @author SanyaNo
 */
public class Main {

    public static void main(String[] args) {

        Person ivan = new Person();
        Person john = new Person();
        
        
        
        EGNComp cmp = new EGNComp();
        cmp.whoIsOlder(ivan, john);
       


    }

}