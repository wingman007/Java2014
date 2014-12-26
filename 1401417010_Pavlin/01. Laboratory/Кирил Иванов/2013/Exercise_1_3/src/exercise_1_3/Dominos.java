package exercise_1_3;

public class Dominos {
    
    private int number1;
    private int number2;
    
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public final void setNumber1(int number1) {
        this.number1 = number1;
    }

    public final void setNumber2(int number2) {
        this.number2 = number2;
    }
    
    public Dominos(int par1, int par2) {
        
        setNumber1(par1);
        setNumber2(par2);
    }
    
    protected void intro() {
        System.out.println("Номерата върху доминото са: |" + getNumber1() + "|" + getNumber2() + "|");
    }
    
    protected void canStitched(Dominos par1) {
        
        if(getNumber1() == par1.getNumber1() || getNumber1() == par1.getNumber2()) {
            
            System.out.println("\nПлочка 2 МОЖЕ да се долепи към първата част на Плочка 1.");
        }
        
        if(getNumber2() == par1.getNumber1() || getNumber2() == par1.getNumber2()) {
            
            System.out.println("\nПлочка 2 МОЖЕ да се долепи към втората част на Плочка 1.");
        }
        
        else {
            System.out.println("\nДвете плочки НЕ МОГАТ да се долепят.");
        }
    }
}
