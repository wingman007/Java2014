package tree_book;

public class Tree implements ITreeBook {

    private String type;
    private int age;

    protected String getType() {
        return type;
    }

    protected int getAge() {
        return age;
    }

    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setAge(int age) {
        this.age = age;
    }

    protected Tree(String type, int age) {
        setType(type);
        setAge(age);
    }

    @Override
    public String returnParam() {
        
        return "Дървото е от тип \"" + getType() + "\" и е на " + getAge() + " годишна възраст.";
    }
}
