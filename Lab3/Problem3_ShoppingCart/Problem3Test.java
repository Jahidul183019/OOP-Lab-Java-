public class Problem3Test {
    public static void main(String[] args){
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(new Product(1,"Pen",10));
        sc.addProduct(new Product(2,"Book",100));
        sc.addProduct(new Product(3,"USB",250));
        Assert.assertEquals(3, sc.size(), "P3: size after adds");
        Assert.assertEquals(360.0, sc.getTotalCost(), "P3: total before discount");

        sc.applyDiscount(10.0);
        Assert.assertEquals(324.0, sc.getTotalCost(), "P3: total after 10%");

        Assert.assertTrue(sc.removeProductById(2), "P3: removed Book");
        Assert.assertEquals( (10+250) * 0.9, sc.getTotalCost(), "P3: total after remove + discount");
        boolean thrown = false;
        try { sc.applyDiscount(95.0); } catch(IllegalArgumentException e){ thrown = true; }
        Assert.assertTrue(thrown, "P3: discount > 90 rejected");
        Assert.summary();
    }
}
