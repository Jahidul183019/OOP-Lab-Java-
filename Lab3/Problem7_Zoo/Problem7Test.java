public class Problem7Test {
    public static void main(String[] args){
        Zoo z = new Zoo();
        z.add(new Lion("Leo", 5));
        z.add(new Elephant("Ellie", 12));
        z.add(new Monkey("Momo", 3));
        Assert.assertEquals(3, z.size(), "P7: size");

        Animal old = z.oldest();
        Assert.assertEquals("Ellie", old.getName(), "P7: oldest");

        // feedAll is manual-visual: run and see printed lines.
        // We'll just call it to ensure no exceptions after implementation.
        try {
            z.feedAll();
            Assert.assertTrue(true, "P7: feedAll ran");
        } catch(Exception e){
            Assert.assertTrue(false, "P7: feedAll threw");
        }

        Assert.summary();
    }
}
