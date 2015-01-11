package egn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Person {

    private String EGN;
    private String name;
    private String formatedDate;
    
    private static final Scanner listener = new Scanner(System.in, "windows-1251");

    protected Person() {

        System.out.print("Please enter your name: ");
        String fName = listener.nextLine();
        
        name = nameFormat(fName);
        
        setName(name);
        
        System.out.printf("Welcome %s! Please enter your EGN: ", name);

        while (true) {
            
            EGN = listener.nextLine();
            
            EGN = EGN.trim();
            
            if (!eval(EGN)) {
                System.out.println("Invalid EGN! Please try again: ");
            } 
            
            else {
                setEGN(EGN);

                System.out.println("Success!");
                break;
            }
        }
    }

    protected final String nameFormat(String name) {
        
        String formatedName = name.toLowerCase();
        formatedName = formatedName.trim();
        formatedName = Character.toUpperCase(formatedName.charAt(0)) + formatedName.substring(1);
        return formatedName;
    }
    
    protected String getEGN() {
        return EGN;
    }

    protected String getName() {
        return name;
    }
    
    protected String getFormatedDate() {
        return formatedDate;
    }

    protected final void setEGN(String EGN) {
        this.EGN = EGN;
    }

    protected final void setName(String name) {
        this.name = name;
    }
    
    protected final boolean eval(String EGN) {
        
        boolean eval = true;

        if (!EGN.matches("[0-9]{10}")) {
            eval = false;
            return eval;
        }
        
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

        if (!controlNum(EGN)) {
            eval = false;
            return eval;
        }
        
        setFormatedDate(fDate);
        return eval;
    }
    
    protected void setFormatedDate(String formatedDate) {
        this.formatedDate = formatedDate;
    }
    
    protected boolean isValidDate(String inDate) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        
        try {
            dateFormat.parse(inDate.trim());
        } 
        
        catch (ParseException e) {
            return false;
        }

        return true;
    }

    protected int[] getDate(String EGN) {

        int[] date = new int[3];
        int start = 0;
        
        for (int i = 0; i < date.length; i++) {

            date[i] = getIntVal(EGN, start, (start + 1));
            start += 2;
        }

        return date;
    }
    
    protected int getIntVal(String someNumber, int start, int end) {

        int val = Integer.parseInt(someNumber.substring(start, (end + 1)));
        return val;
    }

    protected String formatDate(int[] date) {

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

    protected boolean controlNum(String EGN) {
        
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
