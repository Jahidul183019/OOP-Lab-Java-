public class Problem1Test {
    public static void main(String[] args){
        Gradebook g = new Gradebook();
        Student a = new Student("S1","Ana");
        Student b = new Student("S2","Ben");
        a.addSubjectMark("Math", 90);
        a.addSubjectMark("CS", 80);
        b.addSubjectMark("Math", 100);
        b.addSubjectMark("CS", 50);
        g.addStudent(a);
        g.addStudent(b);

        Assert.assertEquals(85.0, a.average(), "P1: Ana avg");
        Assert.assertEquals("Math", a.highestSubject(), "P1: Ana top");
        Assert.assertEquals("CS", a.lowestSubject(), "P1: Ana low");

        Assert.assertEquals(75.0, b.average(), "P1: Ben avg");
        Assert.assertEquals(80.0, g.classAverage(), "P1: class avg");

        Assert.assertEquals("S1", g.topK(1).get(0).getId(), "P1: topK");
        // duplicate test
        boolean thrown = false;
        try { g.addStudent(new Student("S1","Another")); } catch(IllegalArgumentException e){ thrown = true; }
        Assert.assertTrue(thrown, "P1: duplicate ID rejected");

        Assert.summary();
    }
}
