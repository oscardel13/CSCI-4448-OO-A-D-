import java.util.*;

//This class was made to make a list of the available cars. It was made so we won't have to iterate through the store inventory but just a subset of it.
public class AvailableCars{
    ArrayList<Car> Inventory = new ArrayList<Car>();
    ArrayList<Car> Available = new ArrayList<Car>();
    public AvailableCars(ArrayList<Car> ave){
        Inventory = ave;
        for(Car car:Inventory){
            if (car.rented == false)
                Available.add(car);
        }
    }

    //Gets the size of the availble car list
    public int getSize(){
        return Available.size();
    }

    //adds car back to the list (when it gets returned)
    public void addCar(Car car){
        Available.add(car);
    }

    //removes car from the list (when it gets rented)
    public void remove(Car car){
        Available.remove(car);
    }

    //clear lists
    public void clearAv(){
        Available.clear();
    }

    public void printList(){
        //iterating ArrayList
        for(Car car:Available)
            System.out.println(car.Licence);
    }
}