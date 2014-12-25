package egn;

// @author SanyaNo (github.com/SanyaNo)
// Направени са модификации по оригиналния код, там където смятам за по-удачно.
// Не разбирам от ЕГН'та и не ми се занимава да чета и пресъздавам всички валидации, които има при нея.

public class EGNMain {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        
        Comparison egn = new Comparison();
        egn.whoIsYounger(person1, person2);
    }
}