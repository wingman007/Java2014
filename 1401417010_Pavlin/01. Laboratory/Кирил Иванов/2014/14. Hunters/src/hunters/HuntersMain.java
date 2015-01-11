package hunters;

public class HuntersMain {

    public static void main(String[] args) {
        
        Hunter hunterOne = new Hunter("Стоян", new Lion("Лъв", "бозайници", "хищници"));
        Hunter hunterTwo = new Hunter("Иван", new Penguin("Пингвин", "птици", false));

        receivingStation(hunterOne);
        receivingStation(hunterTwo);
        
        hunterOne.setAnimal(null);
        hunterTwo.setAnimal(new Lion("Лъвица", "бозайници", "хищници"));

        receivingStation(hunterOne);
        receivingStation(hunterTwo);
    }
    
    protected static void receivingStation(Hunter hunter) {
        
        System.out.println("Името на ловеца е \"" + hunter.getName() + "\".");
        
        if(hunter.getAnimal() != null) {
            
            System.out.println("Животното, което предава е " + hunter.getAnimal().returnParam() + ".\n");
        }
        
        else {
            
            System.out.println("Той няма животно.\n");
        }
    }
}
