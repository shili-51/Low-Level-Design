AbstractFactory (ShapeFactory interface)
 ├── TwoDShapeFactory   → creates Circle2D, Rectangle2D
 └── ThreeDShapeFactory → creates Circle3D (Sphere), Rectangle3D (Cuboid)


// ---- Product interface ----
interface Shape {
    void draw();
}

// ---- 2D Products ----
class Circle2D implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn a 2D Circle");
    }
}

class Rectangle2D implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn a 2D Rectangle");
    }
}

// ---- 3D Products ----
class Sphere3D implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn a 3D Sphere");
    }
}

class Cuboid3D implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn a 3D Cuboid");
    }
}

// ---- Abstract Factory ----
interface ShapeFactory {
    Shape createCircle();
    Shape createRectangle();
}

// ---- Concrete Factory 1: 2D family ----
class TwoDShapeFactory implements ShapeFactory {
    @Override
    public Shape createCircle() {
        return new Circle2D();
    }
    @Override
    public Shape createRectangle() {
        return new Rectangle2D();
    }
}

// ---- Concrete Factory 2: 3D family ----
class ThreeDShapeFactory implements ShapeFactory {
    @Override
    public Shape createCircle() {
        return new Sphere3D();
    }
    @Override
    public Shape createRectangle() {
        return new Cuboid3D();
    }
}

// ---- Factory Producer (picks which family) ----
class FactoryProducer {
    public static ShapeFactory getFactory(String type) {
        if (type.equalsIgnoreCase("2D")) {
            return new TwoDShapeFactory();
        } else if (type.equalsIgnoreCase("3D")) {
            return new ThreeDShapeFactory();
        }
        throw new IllegalArgumentException("Unknown factory type: " + type);
    }
}

// ---- Client ----
public class Main {
    public static void main(String[] args) {
        // Client asks for a 2D family
        ShapeFactory factory2D = FactoryProducer.getFactory("2D");
        Shape circle = factory2D.createCircle();
        Shape rect = factory2D.createRectangle();
        circle.draw();  // Drawn a 2D Circle
        rect.draw();    // Drawn a 2D Rectangle

        // Client switches to 3D family
        ShapeFactory factory3D = FactoryProducer.getFactory("3D");
        Shape sphere = factory3D.createCircle();
        Shape cuboid = factory3D.createRectangle();
        sphere.draw(); // Drawn a 3D Sphere
        cuboid.draw(); // Drawn a 3D Cuboid
    }
}
