/*
* Zada4a 5
* Sastavete programa, koqto sravnqva dve EGN-ta i izvejda saob6tenie, koi ot pritejatelite im e po-mlad.
* Izgotvil Atanas Avkov
* FMI 1vi kurs Softuerni tehnologii (2g.) FAK # 1401417004
* LICENSE: MIT 
*/

package egn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EGN {

    public static void main(String[] args) {
        String[] egnArr = getEGNs();
        System.out.println();
        compareEGNs(egnArr);
    }

    private static String[] getEGNs() {
        String[] egnArr = new String[2];
        String egn;
        Scanner in = new Scanner(System.in);
/*
* Eto edin cikul :D
*/
        while (true) {
            System.out.print("Molia vavedete purvoto EGN ");
            egn = in.nextLine();
            while (!isValid(egn)) {
                System.out.print(" Nevalidno EGN! Molia vavedete otnovo:  ");
                egn = in.nextLine();
            }
            if (isValid(egn)) {
                egnArr[0] = egn;
                System.out.println("EGN-to koeto vavedohte e validno. ");
                System.out.print("Molia vavedete vtoro EGN: ");
                egn = in.nextLine();
                while (!isValid(egn)) {
                    System.out.print(" Nevalidno EGN molia vuvedete EGN otnovo: ");
                    egn = in.nextLine();
                }
                if (isValid(egn)) {
                    egnArr[1] = egn;
                    System.out.println("Validno vtoro EGN ");
                    break;
                }
            }
        }
        in.close();
        return egnArr;
    }
/*
* proverka za validnost
*/
    private static boolean isValid(String egn) {

        if (egn.length() != 10) {
            return false;
        }
        if (!isInteger(egn)) {
            return false;
        }

        Date birthDay = parse(egn);

        if (birthDay.after(new Date())) {
            return false;
        }
        return true;
    }

    private static boolean isInteger(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
/*
* Dparsvame datite
*/
    private static Date parse(String egn) {

        Date parsed = new Date();
        String dateString = egn.substring(0, 6);
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
        try {
            parsed = format.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsed;
    }
/*
* sravnqvame stringovete
*/
    private static void compareEGNs(String[] egnArr) {
        Date date1 = parse(egnArr[0]);
        Date date2 = parse(egnArr[1]);

        if (date1.before(date2)) {
            System.out.println("Chovek 1 e po-star ot 2");
        }
        if (date1.after(date2)) {
            System.out.println("Chovek 2 e po-star 1");
        }
        if (date1.equals(date2)) {
            System.out.println("I dvamata sa na edna i su6ta vuzrast");
        }
    }
}