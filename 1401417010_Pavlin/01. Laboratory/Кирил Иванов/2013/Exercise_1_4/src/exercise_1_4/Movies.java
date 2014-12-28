package exercise_1_4;

public class Movies {

    private String title;
    private String tv;
    private int startHour;
    private int endHour;

    protected String getTitle() {
        return title;
    }

    protected String getTv() {
        return tv;
    }

    protected int getStartHour() {
        return startHour;
    }

    protected int getEndHour() {
        return endHour;
    }

    protected final void setTitle(String title) {
        this.title = title;
    }

    protected final void setTv(String tv) {
        this.tv = tv;
    }

    protected final void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    protected final void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    protected Movies(String title, String tv, int startHour, int endHour) {
        setTitle(title);
        setTv(tv);
        setStartHour(startHour);
        setEndHour(endHour);
    }
    
    protected void program() {
        System.out.println("Филмът " + getTitle() + " ще бъде излъчен по " + getTv() + " от " + getStartHour() + " до " + getEndHour() + " часа.\n");
    }
    
    protected void isWatchable(Movies movie) {
        
        if(getEndHour() <= movie.getStartHour() || getStartHour() >= movie.getEndHour()) {
            
            System.out.println("\"" + getTitle() + "\" и \"" + movie.getTitle() + "\" НЕ СЕ пресират по време.\n");
        }
        
        else {
            
            System.out.println("\"" + getTitle() + "\" и \"" + movie.getTitle() + "\" СЕ пресират по време.\n");
        }
    }
}
