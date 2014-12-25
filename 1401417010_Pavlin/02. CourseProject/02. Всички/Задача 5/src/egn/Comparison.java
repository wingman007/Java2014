package egn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparison {
        
    public void whoIsYounger(Person par1, Person par2){
        
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse(par1.getFormatedDate()); 
            Date date2 = sdf.parse(par2.getFormatedDate());


            if(date1.after(date2)) {
                System.out.println(par1.getName() + " is younger than " + par2.getName() + ".");
            }

            if(date1.before(date2)) {
                System.out.println(par2.getName() + " is younger than " + par1.getName() + ".");
            }

            if(date1.equals(date2)) {
                System.out.println(par1.getName() + " and " + par2.getName() + " are born on the same day!");
            }
        }
        
        catch(ParseException e) {
            
            e.getMessage();
        }
    }
}
