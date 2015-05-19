package course_aasignment.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author SanyaNo
 */
public class Person {

    private String EGN;
    private String name;
    private String formatedDate;
    // private String[] dateID = {"year", "month", "day"};
    private static Scanner listener = new Scanner(System.in,  "windows-1251");

   
    
    Person() {

        System.out.println("Please enter your name: ");
        String fName = listener.nextLine();
        String name = nameFormat(fName);
        setName(name);
        System.out.printf("Welcome %s! Please enter your EGN: ", name);

        while (true) {
            String EGN = listener.nextLine();
            EGN = EGN.trim();
            if (!eval(EGN)) {
                System.out.println("Invalid EGN! Please try again: ");
            } else {
                setEGN(EGN);

                System.out.println("Success!");
                break;

            }
        }


    }
    /**
     * 
     * @param name
     * @return 
     */
    public String nameFormat(String name) {
        
        String formatedName = name.toLowerCase();
        formatedName = formatedName.trim();
        formatedName = Character.toUpperCase(formatedName.charAt(0)) + formatedName.substring(1);
        return formatedName;
    }
    
    /**
     * 
     * @param formatedDate 
     */

    public void setFormatedDate(String formatedDate) {

        this.formatedDate = formatedDate;
    }
    
    /**
     * 
     * @return 
     */

    public String getFormatedDate() {
        return formatedDate;
    }
    /**
     * 
     * @param EGN 
     */
    public void setEGN(String EGN) {
        this.EGN = EGN;
    }
    /**
     * 
     * @return 
     */
    public String getEGN() {
        return EGN;
    }
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * PIN Evaluation
     * @param EGN
     * @return 
     */
    public boolean eval(String EGN) {
        
        boolean eval = true;

        if (!EGN.matches("[0-9]{10}")) {
            eval = false;
            return eval;
        }
        
        // Date evaluation
        int[] date = getDate(EGN);
        String fDate = formatDate(date);

        if (fDate.equals("")) {
            eval = false;
            return eval;
        }

        if (!isValidDate(fDate)) {
            eval = false;
            return eval;
        }
        
        //Control number evaluation

        if (!controlNum(EGN)) {
            eval = false;
            return eval;
        }
        setFormatedDate(fDate);
        return eval;

    }

    /*
     * Source:
     * www.java2s.com
     * 
     * @param inDate
     * @return 
     */
    public boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }

        return true;
    }
    
    /**
     * Get the date of birth
     * 
     * @param EGN
     * @return 
     */

    public int[] getDate(String EGN) {

        int[] date = new int[3];
        int start = 0;
        for (int i = 0; i < date.length; i++) {

            date[i] = getIntVal(EGN, start, (start + 1));
            start += 2;

        }

        return date;

    }
    
    /**
     * The integer value of a random number represented by string
     * 
     * @param someNumber
     * @param start
     * @param end
     * @return value
     * TODO: Evaluation of the expected values of the string when 
     * cast into integer
     */

    public int getIntVal(String someNumber, int start, int end) {
        
        
        int val = Integer.parseInt(someNumber.substring(start, (end + 1)));

        return val;

    }
    
    /**
     * Get yyyy-MM-dd format of a date in yy-MM-dd format
     * 
     * @param date
     * @return 
     */

    public String formatDate(int[] date) {
        String formatedDate = "";

        if (date[1] > 0 && date[1] < 13) {
            date[0] += 1900;
        }

        if (date[1] > 20 && date[1] < 33) {
            date[0] += 1800;
            date[1] -= 20;
        }

        if (date[1] > 40 && date[1] < 53) {
            date[0] += 2000;
            date[1] -= 40;
        }

        formatedDate = "" + date[0] + "-" + date[1] + "-" + date[2];

        return formatedDate;
    }
    
    /**
     * Evaluation of the control number in a PIN
     * 
     * @param EGN
     * @return 
     */

    public boolean controlNum(String EGN) {
        boolean eval = true;

        int[] digits = new int[EGN.length()];
        for (int i = 0; i < EGN.length(); i++) {
            String digit = "" + EGN.charAt(i);
            digits[i] = Integer.parseInt(digit);

        }

        int cntNum = digits[0] * 2 + digits[1] * 4 + digits[2] * 8 + digits[3] * 5 + digits[4] * 10
                + digits[5] * 9 + digits[6] * 7 + digits[7] * 3 + digits[8] * 6;
        cntNum = cntNum % 11;

        if (cntNum == 10) {

            cntNum = 0;
        }

        if (cntNum != digits[9]) {
            eval = false;
        }


        return eval;
    }
}
