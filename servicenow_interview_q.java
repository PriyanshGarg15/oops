//can we use implements and extend together ?
//yes
// ---------------------------------------------
// Parent class
class Vehicle {
    int maxSpeed = 120;

    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

// Interface
interface Electric {
    void chargeBattery(); // Abstract method (no implementation)
}

// Child class
class ElectricCar extends Vehicle implements Electric {
    int batteryLevel = 100;

    // Implementing the method from the Electric interface
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged!");
    }

    // Adding a new method specific to ElectricCar
    void showCarDetails() {
        System.out.println("Electric car speed limit: " + maxSpeed + " km/h");
        System.out.println("Battery level: " + batteryLevel + "%");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        ElectricCar myElectricCar = new ElectricCar();

        // Access the inherited method from Vehicle
        myElectricCar.displayInfo();

        // Access the implemented method from Electric interface
        myElectricCar.chargeBattery();

        // Access the child class method
        myElectricCar.showCarDetails();
    }
}
