public class Problem2Test {
    public static void main(String[] args){
        ParkingLot lot = new ParkingLot();
        long t0 = 1_000_000L;
        lot.park(new Car("C-11", t0));
        lot.park(new Bike("B-22", t0));
        boolean again = lot.park(new Car("C-11", t0));
        Assert.assertTrue(!again, "P2: duplicate park rejected");
        Assert.assertEquals(2, lot.getOccupancy(), "P2: occupancy");

        double fee1 = lot.leave("C-11", t0 + 30*60); // 0.5h => ceil to 1h => 50
        Assert.assertEquals(50.0, fee1, "P2: Car fee 0.5h");
        Assert.assertEquals(1, lot.getOccupancy(), "P2: occupancy after leave");

        double fee2 = lot.leave("B-22", t0 + 3*3600 + 1); // 3.00027h => 4h => 80
        Assert.assertEquals(80.0, fee2, "P2: Bike fee 3.0003h");

        Assert.assertEquals(130.0, lot.getRevenue(), "P2: revenue sum");
        Assert.summary();
    }
}
