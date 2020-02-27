import java.util.*;
public class CarList{
    ArrayList<Car> Inventory = new ArrayList<Car>();
    public void addCar(Car car){
        Inventory.add(car);
        System.out.println("Added " + car.Licence + " to list!");
    }

    public void createDefault(){
        Inventory.add(new Economy("arc965"));
        Inventory.add(new Economy("bty852"));
        Inventory.add(new Standard("cty258"));
        Inventory.add(new Standard("dty963"));
        Inventory.add(new Luxury("erp369"));
        Inventory.add(new Luxury("fp258"));
        Inventory.add(new SUV("guh962"));
        Inventory.add(new SUV("h25796"));
        Inventory.add(new Minivan("irc164"));
        Inventory.add(new Minivan("jrc785"));
    }

    public void printList(){
        //iterating ArrayList
        for(Car car:Inventory)
            System.out.println(car.Licence);
    }

    public ArrayList<Car> getList(){
        return(Inventory);
    }
}