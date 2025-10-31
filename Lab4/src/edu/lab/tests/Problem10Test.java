package edu.lab.tests;
import java.util.*;
import edu.lab.model.Employee;

public class Problem10Test {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(2, "alice"));
        list.add(new Employee(3, "carol"));
        list.add(new Employee(1, "Bob"));
        Collections.sort(list);
        Assert.assertEquals("alice", list.get(0).getName(), "P10: sort #1");
        Assert.assertEquals("Bob",   list.get(1).getName(), "P10: sort #2");
        Assert.assertEquals("carol", list.get(2).getName(), "P10: sort #3");

        Employee e1 = new Employee(10,"bob");
        Employee e2 = new Employee(11,"Bob");
        Assert.assertTrue(e1.compareTo(e2)==0, "P10: compareTo case-insensitive");
        // equals/hashCode consistency (not strictly required by Comparable, but we test here)
        Assert.assertTrue(e1.equals(e2), "P10: equals ignore case");
        Assert.assertTrue(e1.hashCode()==e2.hashCode(), "P10: hashCode consistent");
        Assert.summary();
    }
}
