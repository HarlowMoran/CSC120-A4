import java.util.ArrayList;

public class Car implements CarRequirements{
    //Atributes
    private int capacity;
    private int seatsRemaining;
    private ArrayList<Passenger> passengerList;


    public Car(int capacity, int seatsRemaining, ArrayList<Passenger> passengerList){
        this.capacity = capacity;
        this.seatsRemaining = seatsRemaining;
        this.passengerList = new ArrayList<>(passengerList);

    }
    public int getCapacity() {
        return this.capacity;
    }

    public int seatsRemaining() {
        return this.seatsRemaining;
    }

    public Boolean addPassenger(Passenger p) {
        if(passengerList.contains(p)){
            return false;
        } 
        else if (seatsRemaining > 0){
            passengerList.add(p);
            return true;
        }
        else {
            return false;
        }
    }
    
    public Boolean removePassenger(Passenger p) {
        if(passengerList.contains(p)){
            passengerList.remove(p);
            return true;
        }
        else {
            return false;
        }
    }

    public void printManifest(){
        System.out.println("Car has capacity: " + this.capacity + " seats remaining: " + this.seatsRemaining);
    }


}