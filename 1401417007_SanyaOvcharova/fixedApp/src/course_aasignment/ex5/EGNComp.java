
package course_aasignment.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author SanyaNo
 */
public class EGNComp {
    
    /**
     * 
     * @param per1
     * @param per2
     * @return 
     */
    
    public void whoIsOlder(Person per1, Person per2){
        
        try{
 
            
            
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	Date date1 = sdf.parse(per1.getFormatedDate()); 
        	Date date2 = sdf.parse(per2.getFormatedDate());
               
 
        	if(date1.after(date2)){
        		System.out.println(per2.getName() + " is older than " + per1.getName());
        	}
 
        	if(date1.before(date2)){
        		System.out.println(per1.getName() + " is older than " + per2.getName());
        	}
 
        	if(date1.equals(date2)){
        		System.out.println(per1.getName() + " and " + per2.getName() + " are born on the same day!");
        	}
 
    	}catch(ParseException ex){
    		ex.printStackTrace();
    	}
        
        
    }
    
    

}
