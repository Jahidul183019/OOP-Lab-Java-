package edu.lab.tests;
import java.util.*;
import edu.lab.shapes.api.Shape;
import edu.lab.shapes.impl.Circle;
import edu.lab.shapes.impl.Rectangle;

public class Problem11Test {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0));
        shapes.add(new Rectangle(2.0, 3.0));

        Shape c = shapes.get(0);
        Shape r = shapes.get(1);

        // approximate checks
        Assert.assertTrue(Math.abs(c.area() - Math.PI) < 1e-9, "P11: circle area");
        Assert.assertTrue(Math.abs(c.perimeter() - 2*Math.PI) < 1e-9, "P11: circle perim");
        Assert.assertTrue(Math.abs(r.area() - 6.0) < 1e-9, "P11: rect area");
        Assert.assertTrue(Math.abs(r.perimeter() - 10.0) < 1e-9, "P11: rect perim");
        Assert.summary();
    }
}
