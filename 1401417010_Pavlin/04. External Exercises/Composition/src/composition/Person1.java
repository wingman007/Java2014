package composition;
 
public class Person1 {
 
    private Job job;
    
    public Person1() {
        
        this.job=new Job();
        job.setSalary(1000);
    }
    
    public int getSalary() {
        return job.getSalary();
    }
}