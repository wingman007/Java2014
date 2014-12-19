package composition;
 
public class Person2 {
 
    private Job job;
    
    public Person2() {
        
        this.job=new Job();
        job.setSalary(2000);
    }
    
    public int getSalary() {
        return job.getSalary();
    }
}