public class Intern extends Employee {
    private double stipend;
    public Intern(String id, String name, double stipend){
        super(id, name); this.stipend = stipend;
    }
    @Override public double getPayment(){ return stipend; }
    @Override public void raiseByPercent(double pct){
        // TODO: increase stipend by pct%
        // throw new UnsupportedOperationException("TODO");
        if (pct < 0) throw new IllegalArgumentException("Percentage must be non-negative");
         stipend = stipend * (1 + pct / 100.0);
         stipend = Math.round(stipend * 100.0) / 100.0;
    }
}
