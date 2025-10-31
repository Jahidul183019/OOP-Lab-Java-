public class Truck extends Vehicle {
    public Truck(String plate, long entryTime){ super(plate, entryTime); }
    @Override public double ratePerHour(){ return 120.0; }
}
