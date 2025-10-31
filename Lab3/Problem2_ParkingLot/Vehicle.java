public abstract class Vehicle {
    private String plate;
    private long entryTime; // epoch seconds

    public Vehicle(String plate, long entryTime){
        this.plate = plate;
        this.entryTime = entryTime;
    }
    public String getPlate(){ return plate; }
    public long getEntryTime(){ return entryTime; }

    // Return hourly rate for this vehicle
    public abstract double ratePerHour();
}
