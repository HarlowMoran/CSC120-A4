import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    private ArrayList<Car> carList;
    private Engine engine;
    int nCars;
    int passengerCapacity;
    int seatsRemaining;
    private ArrayList<Passenger> passengerList;
    
    /**
     * creates a train object 
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(FuelType.ELECTRIC, 100, 100);
        this.carList = new ArrayList<Car>();
    }

    /**
     * returns the engine
     * @return Engine
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * returns the car at int i in the carList
     * @return carList.get(i)
     */
    public Car getCar(int i){
        
        return carList.get(i);
    }

    /**
     * returns the maximum capacity of the train across all cars
     * @return nCars*passengerCapacity
     */
    public int getMaxCapacity(){
        return (nCars * passengerCapacity);
    }

    /**
     * returns the seats remaining across all cars
     * @return nCars*seatsRemaining
     */
    public int seatsRemaining(){
        return (nCars * seatsRemaining);
    }

    /**
     * prints out a list of all the passengers aboard the train across all cars
     */
    public void printManifest(){
        System.out.println(passengerList);
    }

}
