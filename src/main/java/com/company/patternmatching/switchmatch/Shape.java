package com.company.patternmatching.switchmatch;

public interface Shape {

    static double getPerimeter(Shape shape){
        return switch (shape){
            case Rectangle rectangle -> 2 * rectangle.getLength() + 2 * rectangle.getWidth();
            case Circle circle -> 2 * circle.getRadius() * Math.PI;
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }
}
