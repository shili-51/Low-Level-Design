interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I have drawn a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I have drawn a rectangle");
    }
}

class ShapeFactory {
    public Shape createShape(String mode) {
        if (mode.equals("Rectangle")) {
            return new Rectangle();
        } else if (mode.equals("Circle")) {
            return new Circle();
        }
        return null; // or throw IllegalArgumentException("Unknown shape: " + mode)
    }
}

class ClientShape {
    public void draw(String mode) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(mode);
        shape.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        ClientShape clientShape = new ClientShape();
        clientShape.draw("Rectangle");
        clientShape.draw("Circle");
    }
}
