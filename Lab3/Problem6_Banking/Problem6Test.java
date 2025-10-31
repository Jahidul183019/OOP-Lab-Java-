public class Problem6Test {
    public static void main(String[] args){
        BankAccount a = new BankAccount(1,"Ana",1000);
        BankAccount b = new BankAccount(2,"Ben",500);
        Assert.assertEquals(2, BankAccount.getTotalAccounts(), "P6: total accounts");

        a.deposit(250);
        Assert.assertEquals(1250.0, a.getBalance(), "P6: deposit");

        Assert.assertTrue(a.withdraw(200), "P6: withdraw ok");
        Assert.assertEquals(1050.0, a.getBalance(), "P6: post-withdraw");

        Assert.assertTrue(a.transferTo(b, 300), "P6: transfer ok");
        Assert.assertEquals(750.0, a.getBalance(), "P6: a after transfer");
        Assert.assertEquals(800.0, b.getBalance(), "P6: b after transfer");

        Assert.summary();
    }
}
