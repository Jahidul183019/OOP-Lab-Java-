import java.util.*;

public class ParkingLot {
    private HashMap<String, Vehicle> parked = new HashMap<>(); // plate -> vehicle
    private double revenue = 0.0;

    public boolean park(Vehicle v){
        // TODO: if already parked, return false; else add and return true
        // throw new UnsupportedOperationException("TODO");
        if(parked.containsKey(v.getPlate())){
            return false;
        }
        parked.put(v.getPlate(),v);
        return true;
    }

    public double leave(String plate, long exitTime){
        // TODO: compute hours (ceil to next hour if any fraction), fee = hours * rate
        // Remove from map, add to revenue, return fee
        // If not found, return -1
        // throw new UnsupportedOperationException("TODO");
        
         Vehicle v = parked.get(plate);
        if (v == null) return -1;

        double hours = (exitTime - v.getEntryTime()) / 3600.0;
        hours = Math.ceil(hours);

        double fee = hours * v.ratePerHour();

        parked.remove(plate);
        revenue += fee;

        return fee;
    }
         

    public double getRevenue(){ return revenue; }
    public int getOccupancy(){ return parked.size(); }
}
