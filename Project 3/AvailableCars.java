import java.util.*;
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


    public int getSize(){
        return Available.size();
    }
    public void addCar(Car car){
        Available.add(car);
    }
    public void remove(Car car){
        Available.remove(car);
    }
    public void clearAv(){
        Available.clear();
    }

    public void printList(){
        //iterating ArrayList
        for(Car car:Available)
            System.out.println(car.Licence);
    }
}