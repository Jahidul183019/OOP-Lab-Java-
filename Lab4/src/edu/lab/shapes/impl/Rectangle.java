package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;

public class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double width, double height){ this.width=width; this.height=height; }
    public double getWidth(){ return width; }
    public double getHeight(){ return height; }

    @Override public double area(){
        // TODO: w * h
        // throw new UnsupportedOperationException("TODO");
        return width * height; // TODO: w * h
    }
    @Override public double perimeter(){
        // TODO: 2*(w+h)
        // throw new UnsupportedOperationException("TODO");
        return 2 * (width + height); // TODO: 2 * (w + h)
    }
    @Override public String toString(){
        // TODO: "Rectangle{w=.., h=.., area=.., perim=..}"
        // throw new UnsupportedOperationException("TODO");
        return String.format("Rectangle{w=%.2f, h=%.2f, area=%.2f, perim=%.2f}",
                width, height, area(), perimeter()); // TODO: formatted string
    }
}
