public class Vehicle {
    private String model;
    private int mileage;
    private boolean engineRunning;

    /**
     * Constructor: All vehicles start with 0 miles and engine off.
     */
    public Vehicle(String model) {
        // TODO: Initialize variables
        this.model = model;
        mileage = 0;
        engineRunning = false;
    }

    public void startEngine() {
        // TODO: Set engineRunning to true
        engineRunning = true;
    }

    /**
     * Increases mileage if the engine is running.
     */
    public void drive(int distance) {
        // TODO: Logic to add distance only if engineRunning is true
        if(engineRunning)
            mileage += distance;
    }

    public boolean getEngineStatus(){
        return engineRunning;
    }

    public String toString() {
        // TODO: Return model, mileage, and status
        String output = "Model: " + model + "\nMileage: " + mileage + "\nStatus: ";
        if(engineRunning)
            output += "Running";
        else
            output += "Off";

        return output;
    }
}
