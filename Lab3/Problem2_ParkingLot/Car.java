public class Car extends Vehicle {
    public Car(String plate, long entryTime){ super(plate, entryTime); }
    @Override public double ratePerHour(){ return 50.0; }
}
