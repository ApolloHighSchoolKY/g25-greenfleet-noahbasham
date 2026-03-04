import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle("Ford Ranger"));
        inventory.add(new ElectricCar("Rivian R1T"));
        
        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(Vehicle car: inventory)
        {
            if(car instanceof ElectricCar)
            {
                if(((ElectricCar)car).getBatteryPercent() < 100)
                    System.out.println(car + "\nThis electric vehicle needs a charge.");
                else
                    System.out.println(car + "\nThis electric vehicle does not need a charge.");
            }
           else
            {    
                System.out.println(car);
            }
            System.out.print("\n");
        }

        Vehicle car1 = new Vehicle("Toyota Corolla");
        ElectricCar car2 = new ElectricCar("Tesla Model S");
        inventory.add(car1);
        inventory.add(car2);
        car1.startEngine();
        car1.drive(10);
        car2.startEngine();
        car2.drive(500);

        for(Vehicle car: inventory)
        {
            if(car instanceof ElectricCar)
            {
                if(((ElectricCar)car).getBatteryPercent() < 100)
                    System.out.println(car + "\nThis electric vehicle needs a charge. " + ((ElectricCar)car).getBatteryPercent());
                else
                    System.out.println(car + "\nThis electric vehicle does not need a charge." );
            }
            else
            {    
                System.out.println(car);
            }
            System.out.print("\n");
        }
    }
}
