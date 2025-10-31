public class Bike extends Vehicle {
    public Bike(String plate, long entryTime){ super(plate, entryTime); }
    @Override public double ratePerHour(){ return 20.0; }
}
