public class Engine implements EngineRequirements {
    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;
    /**
     * creates an object engine
     * @param f
     * @param currentFuelLevel
     * @param maxFuelLevel
     */

    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;

    }
    
    /**
     * returns the fuel type
     * @return this.f
     */
    public FuelType getFuelType() {
        return this.f;
    }

    /**
     * returns the maximum fuel level
     * @return maxFuelLevel
     */
    public double getMaxFuel() {
        return maxFuelLevel;
    }
    /**
     * returns the current fuel level
     * @return currentFuelLevel
     */
    public double getCurrentFuel() {
        return currentFuelLevel;
    }

    /**
     * sets the current fuel level equal to the maximum fuel level
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }
    
    /**
     * If the engine has a enough fuel (at least one unit), then returns true and subtracts from current fuel level.
     * However if there is not enough fuel (less than one unit), then returns false.
     * @return true || false
     */
    public Boolean go() {
        if(currentFuelLevel > 1.0){
            currentFuelLevel = currentFuelLevel - 1.0;
            System.out.println(currentFuelLevel);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * returns information about the fuel type, current fuel level, and max fuel level
     * @return "Engine has fuel type " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel
     */
    public String toString() {
        return("Engine has fuel type " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
    }

    /**
     * New instance of engine.
     * @param args
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        System.out.println(myEngine);

    }
}