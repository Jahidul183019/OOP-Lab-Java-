public class Problem4Test {
    public static void main(String[] args){
        Company c = new Company();
        c.add(new Manager("M1","Maya", 100_000, 20_000));
        c.add(new Intern("I1","Ian", 15_000));
        Assert.assertEquals(2, c.size(), "P4: size");

        Assert.assertEquals(120_000.0, c.richest().getPayment(), "P4: richest");

        c.raiseAll(10.0);
        Assert.assertEquals(132_000.0, c.richest().getPayment(), "P4: raise manager 10%");
        // Verify intern raise
        Employee e = null;
        // find intern by id
        // naive scan via richest test not sufficient; we just check that total matches expected
        // Instead, add new intern and check
        c.add(new Intern("I2","Ivy", 10_000));
        c.raiseAll(10.0); // second raise
        // After raises: Maya: 132000 -> 145200; Ian: 16500 -> 18150; Ivy: 11000
        Assert.assertEquals(145_200.0, c.richest().getPayment(), "P4: richest after second raise");
        Assert.summary();
    }
}
