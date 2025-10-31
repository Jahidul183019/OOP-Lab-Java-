public class Manager extends Employee {
    private double base;
    private double bonus;
    public Manager(String id, String name, double base, double bonus){
        super(id, name); this.base = base; this.bonus = bonus;
    }
    @Override public double getPayment(){ return base + bonus; }
    @Override public void raiseByPercent(double pct){
        // TODO: increase base and bonus by pct%
        // throw new UnsupportedOperationException("TODO");
        if (pct < 0) throw new IllegalArgumentException("Percentage must be non-negative");
        base = Math.round(base * (1 + pct / 100.0) * 100.0) / 100.0;
        bonus = Math.round(bonus * (1 + pct / 100.0) * 100.0) / 100.0;
    }
}
