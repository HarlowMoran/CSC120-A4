import java.util.ArrayList;

public class Car implements CarRequirements{
    //Atributes
    private int capacity;
    private ArrayList<Passenger> passengerList;

    /**
     * Creates the car object.
     * @param capacity
     * @param passengerList
    */
    public Car(int capacity, ArrayList<Passenger> passengerList){
        this.capacity = capacity;
        this.passengerList = new ArrayList<Passenger>(passengerList);

    }

    /**
     * returns the capacity
     * @return this.capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * returns the seats remaining
     * @return capacity - passengerList.size()
     */
    public int seatsRemaining() {
        return (capacity - passengerList.size());
    }

    /**
     * Adds a passenger to the car, if the passenger is not already on the car, and if the car is not full.
     * However if the passenger is already on the car, or if the car is full, then returns false.
     * @return true || false
     */
    public Boolean addPassenger(Passenger p) {
        if(passengerList.contains(p)){
            return false;
        } 
        else if (seatsRemaining() > 0){
            passengerList.add(p);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * If the passenger is already on the car, then removes a passenger from the car.
     * If passenger is not on the car, returns false.
     * @return true || false
     */
    public Boolean removePassenger(Passenger p) {
        if(passengerList.contains(p)){
            passengerList.remove(p);
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * prints out a list of all the passengers in the car
     */
    public void printManifest(){
        System.out.println(passengerList);
    }

    /**
     * new instance of car
     * @param args
     */
    public static void main(String[] args) {
        Car myCar = new Car(100, new ArrayList<Passenger>());
        Passenger p = new Passenger("Me", new ArrayList<Car>());
        myCar.addPassenger(p);
        Passenger q = new Passenger("You", new ArrayList<Car>());
        myCar.addPassenger(q);
        myCar.removePassenger(p);
        System.out.println(myCar.passengerList.toString());
    }


}