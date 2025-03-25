import java.util.ArrayList;

public class Passenger implements PassengerRequirements{


 //Attributes
 private String name;
 private ArrayList<Car> carList;

 /**
  * Creates a passenger object.
  * @param name
  * @param carList
  */

 public Passenger(String name, ArrayList<Car> carList){
     this.name = name;
     this.carList = carList;
 }
    
    /**
     * If the passenger is not already on the car, then the car is added to the passenger's carLiist.
     * If the passenger is already on the car, a message is printed to alert the passenger that this is already the case.
     */
    public void boardCar(Car c) {
        if(carList.contains(c)){
            System.out.println("Passenger already on car.");
        }
        else{
            c.addPassenger(this);
        }
       
    }

    /**
     * If the passegner was on the car, then the car is removed from the passenger's carList.
     * If the passenger was not on the car, a message is printed to alert the passeger that this is the case.
     */
    public void getOffCar(Car c) {
        if(carList.contains(c)){
            c.removePassenger(this);
        }
        else{
            System.out.println("Passenger was not on car.");
        }
       
    }

}
