// Liskov principle
// parent object should be replacable by subclass object

interface Vehicle{
    void hasWheels();
}

interface Engine{
    void hasEngine();
}



class Bike implements Vehicle, Engine{

    public void hasWheels(){
        System.out.println("Bike has 2 wheels");
    }
    
    public void hasEngine(){
        System.out.println("Bike has engine");
    }
    
    
}

class Car implements Vehicle, Engine{
    public void hasWheels(){
        System.out.println("Car has 4 wheels");
    }
    public void hasEngine(){
        System.out.println("Car has engine");
    }
}

class Bicycle implements Vehicle{
    public void hasWheels(){
        System.out.println("Bicycle has 4 wheels");
    }
    
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Bicycle bicycle = new Bicycle();

        car.hasWheels();
        car.hasEngine();


        bike.hasWheels();
        bike.hasEngine();

        bicycle.hasWheels();
    }
}


