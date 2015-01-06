package hunters;

public class Hunter {

    private String name;
    private IAnimals animal;
    
    protected String getName() {
        return name;
    }
    
    protected IAnimals getAnimal() {
        return animal;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setAnimal(IAnimals animal) {
        this.animal = animal;
    }
    
    protected Hunter(String name, IAnimals animal) {
        setName(name);
        setAnimal(animal);
    }
}
