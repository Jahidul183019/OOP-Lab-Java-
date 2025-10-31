public abstract class Employee {
    private String id;
    private String name;
    public Employee(String id, String name){
        this.id = id; this.name = name;
    }
    public String getId(){ return id; }
    public String getName(){ return name; }
    public abstract double getPayment(); // monthly
    public void raiseByPercent(double pct){
        // optional override by subclasses; default no-op
    }
}
