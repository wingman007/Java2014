package caesar_cipher;

import java.io.IOException;

public class CipherMain {

    public static void main(String[] args) {

        try {
            
            String path = "src\\caesar_cipher\\Tests.cod";
            
            String[] result = ReadFile.readFromFile(path);
            
            for (String row : result) {
                
                String alphabet;
                
                alphabet = row.replace("е", "а");
                alphabet = alphabet.replace("ж", "б");
                alphabet = alphabet.replace("з", "в");
                alphabet = alphabet.replace("и", "г");
                alphabet = alphabet.replace("й", "д");
                alphabet = alphabet.replace("к", "е");
                alphabet = alphabet.replace("л", "ж");
                alphabet = alphabet.replace("м", "з");
                alphabet = alphabet.replace("н", "и");
                alphabet = alphabet.replace("о", "й");
                alphabet = alphabet.replace("п", "к");
                alphabet = alphabet.replace("р", "л");
                alphabet = alphabet.replace("с", "м");
                alphabet = alphabet.replace("т", "н");
                alphabet = alphabet.replace("у", "о");
                alphabet = alphabet.replace("ф", "п");
                alphabet = alphabet.replace("х", "р");
                alphabet = alphabet.replace("ц", "с");
                alphabet = alphabet.replace("ч", "т");
                alphabet = alphabet.replace("ш", "у");
                alphabet = alphabet.replace("щ", "ф");
                alphabet = alphabet.replace("ъ", "х");
                alphabet = alphabet.replace("ь", "ч");
                alphabet = alphabet.replace("ы", "ц");
                alphabet = alphabet.replace("э", "ш");
                alphabet = alphabet.replace("ю", "щ");
                alphabet = alphabet.replace("я", "ъ");
                
                alphabet = alphabet.replace("Е", "А");
                alphabet = alphabet.replace("Ж", "Б");
                alphabet = alphabet.replace("З", "В");
                alphabet = alphabet.replace("И", "Г");
                alphabet = alphabet.replace("Й", "Д");
                alphabet = alphabet.replace("К", "Е");
                alphabet = alphabet.replace("Л", "Ж");
                alphabet = alphabet.replace("М", "З");
                alphabet = alphabet.replace("Н", "И");
                alphabet = alphabet.replace("О", "Й");
                alphabet = alphabet.replace("П", "К");
                alphabet = alphabet.replace("Р", "Л");
                alphabet = alphabet.replace("С", "М");
                alphabet = alphabet.replace("Т", "Н");
                alphabet = alphabet.replace("У", "О");
                alphabet = alphabet.replace("Ф", "П");
                alphabet = alphabet.replace("Х", "Р");
                alphabet = alphabet.replace("Ц", "С");
                alphabet = alphabet.replace("Ч", "Т");
                alphabet = alphabet.replace("Ш", "У");
                alphabet = alphabet.replace("Щ", "Ф");
                alphabet = alphabet.replace("Ъ", "Х");
                alphabet = alphabet.replace("Ю", "Щ");
                alphabet = alphabet.replace("Я", "Ш");
                                
                alphabet = alphabet.replace("f", "a");
                alphabet = alphabet.replace("d", "_6");
                alphabet = alphabet.replace("u", "p");
                alphabet = alphabet.replace("v", "q");
                alphabet = alphabet.replace("n", "i");
                alphabet = alphabet.replace("s", "n");
                alphabet = alphabet.replace("h", "c");
                alphabet = alphabet.replace("v", "q");
                
                alphabet = alphabet.replace("E", "ВЕРЕН");
                alphabet = alphabet.replace("%", " ");
                alphabet = alphabet.replace("&", "!");
                alphabet = alphabet.replace("ЃЃ", "||");
                alphabet = alphabet.replace("D", "?");
                alphabet = alphabet.replace("‰", "„");
                alphabet = alphabet.replace("-", "(");
                alphabet = alphabet.replace(".", ")");
                alphabet = alphabet.replace("™", "“");
                
                alphabet = alphabet.replace("0", "+");
                alphabet = alphabet.replace("1", ",");
                alphabet = alphabet.replace("2", "-");
                alphabet = alphabet.replace("3", ".");
                alphabet = alphabet.replace("4", "/");
                alphabet = alphabet.replace("5", "0");
                alphabet = alphabet.replace("6", "1");
                alphabet = alphabet.replace("7", "2");
                alphabet = alphabet.replace("8", "3");
                alphabet = alphabet.replace("9", "4");
                alphabet = alphabet.replace(":", "5");
                alphabet = alphabet.replace(";", "6");
                alphabet = alphabet.replace("<", "7");
                alphabet = alphabet.replace("=", "8");
                alphabet = alphabet.replace(">", "9");
                
                alphabet = alphabet.replace("?", ":");
                alphabet = alphabet.replace("B", "=");
                
                alphabet = alphabet.replace("F", "A");
                alphabet = alphabet.replace("G", "B");
                alphabet = alphabet.replace("H", "C");
                alphabet = alphabet.replace("I", "D");
                alphabet = alphabet.replace("J", "E");
                alphabet = alphabet.replace("K", "F");
                alphabet = alphabet.replace("L", "G");
                alphabet = alphabet.replace("O", "J");
                alphabet = alphabet.replace("R", "M");
                alphabet = alphabet.replace("[", "V");
                alphabet = alphabet.replace("{", "v");
                alphabet = alphabet.replace("N", "I");
                alphabet = alphabet.replace("S", "N");
                alphabet = alphabet.replace("Z", "U");

                // with hard replace
                alphabet = alphabet.replace("ywzj", "true");
                alphabet = alphabet.replace("kaqxj", "false"); 
                alphabet = alphabet.replace("Ftwywan", "Fortran");
                alphabet = alphabet.replace("Ujwq", "Perl");
                alphabet = alphabet.replace("C00", "C++");
                alphabet = alphabet.replace("Maym3wtzsi(338)", "Math.round(3.8)");
                alphabet = alphabet.replace("16/(8/16*4/2)", "16/(8*16%4/2)");
                
                System.out.println(alphabet);
            }
        }
        
        catch(IOException err) {
            
            System.out.println(err.getMessage());
        }
    }
}