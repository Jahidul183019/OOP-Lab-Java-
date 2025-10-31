package edu.lab.tests;
public class Assert {
    private static int passed = 0;
    private static int failed = 0;
    public static void assertEquals(Object expected, Object actual, String msg){
        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            passed++;
        } else {
            failed++;
            System.out.println("FAIL: " + msg + " | expected=" + expected + " actual=" + actual);
        }
    }
    public static void assertTrue(boolean cond, String msg){
        if (cond) passed++;
        else { failed++; System.out.println("FAIL: " + msg); }
    }
    public static void catchNoThrow(Runnable r, String msg){
        try { r.run(); }
        catch(Throwable t){ failed++; System.out.println("FAIL: " + msg + " | threw: " + t); return; }
        passed++;
    }
    public static void summary(){
        System.out.println("----");
        System.out.println("PASS: " + passed);
        System.out.println("FAIL: " + failed);
        if (failed == 0) System.out.println("✅ All tests passed!");
        else System.out.println("❌ Some tests failed. Fix TODOs & retest.");
    }
}
