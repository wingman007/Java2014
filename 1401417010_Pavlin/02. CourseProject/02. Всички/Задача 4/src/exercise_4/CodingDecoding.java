package exercise_4;

public class CodingDecoding extends Exercise_4 {
    
    protected static void choice() {
        
        System.out.println("За кодиране напишете \"code\", за декодиране - \"decode\".");
        System.out.print("Въведете избора си: ");
        
        switch (input.nextLine()) {
            case "code":
                coding();
                break;
            case "decode":
                decoding();
                break;
            default:
                System.out.println("\nВъведете нещо смислено.\n");
                choice();
                break;
        }
    }
    
    protected static String[] codedArr = new String[50];
    
    protected static int shift = (int)Math.ceil(Math.random()*5);
    
    protected static void coding() {
        
        System.out.println("\nИзместването е: +" + shift + "\n");
        
        if(arr[0] == null) {
            
            System.out.println("Масивът е празен.\n");
        }

        int count = 0;
        
        for(String elements : arr) {

            if(elements == null) {

                break;
            }

            String codedElement = "";

            for(int i = 0; i < elements.length(); i++) {
                
                codedElement += (char)(elements.charAt(i) + shift);
                //codedElement = codedElement.concat(Character.toString((char)(elements.charAt(i) + shift)));
            }
            
            codedArr[count] = codedElement;
            count++;
        }

        for(String codedElements : codedArr) {
            
            if(codedElements == null) {

                break;
            }
            
            System.out.println(codedElements);
        }
    }
    
    protected static void decoding() {
        
        System.out.println("\nИзместването е: -" + shift + "\n");

        if(codedArr[0] == null) {
            
            System.out.println("Масивът е празен.\n");
        }
        
        for(String elements : codedArr) {

            if(elements == null) {

                break;
            }

            String decodedElement = "";

            for(int i = 0; i < elements.length(); i++) {
                
                decodedElement += (char)(elements.charAt(i) - shift);
                //decodedElement = decodedElement.concat(Character.toString((char)(elements.charAt(i) - shift)));
            }
            System.out.println(decodedElement);
        }
    }
}
