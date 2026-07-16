// Liskov principle
// parent object should be replacable by subclass object



class Vehicle{
    public void hasWheels(){
        System.out.println("Vehicle has wheels");
        
    }
    public void hasEngine(){
        System.out.println("Vehicle has Engine");
        
    }
}

class Bike extends Vehicle{
    @Override
    public void hasWheels(){
        System.out.println("Bike has 2 wheels");
    }
    
    @Override
    public void hasEngine(){
        System.out.println("Bike has engine");
    }
    
    
}

class Car extends Vehicle{
    @Override
    public void hasWheels(){
        System.out.println("Car has 4 wheels");
    }
    @Override
    public void hasEngine(){
        System.out.println("Car has engine");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void hasWheels(){
        System.out.println("Bicycle has 4 wheels");
    }
    @Override
    public void hasEngine(){
        throw null;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Bike();
        Vehicle vehicle4 = new Bicycle();

        vehicle1.hasWheels();
        vehicle1.hasEngine();

        vehicle2.hasWheels();
        vehicle2.hasEngine();

        vehicle3.hasWheels();
        vehicle3.hasEngine();

        vehicle4.hasWheels();
        vehicle4.hasEngine();   // Exception here - Bicycle should not implement hasEngine method
    }
}


