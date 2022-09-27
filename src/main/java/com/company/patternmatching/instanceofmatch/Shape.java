package com.company.patternmatching.instanceofmatch;

public interface Shape {

    // tradicional
    static double getPerimeter(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.getLength() + 2 * rectangle.getWidth();

        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.getRadius() * Math.PI;

        } else {
            throw new IllegalArgumentException("not a valid shape");
        }
    }

    // nueva forma
    static double getPerimeterEnhanced(Shape shape) {
        if (shape instanceof Rectangle rectangle) {
            return 2 * rectangle.getLength() + 2 * rectangle.getWidth();

        } else if (shape instanceof Circle circle) {
            return 2 * circle.getRadius() * Math.PI;

        } else {
            throw new IllegalArgumentException("not a valid shape");
        }
    }
}
