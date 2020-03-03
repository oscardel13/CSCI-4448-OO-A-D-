import java.util.*;
public class CarList{
    ArrayList<Car> Inventory = new ArrayList<Car>(); // THis is the list of all the cars the store offers
    // Adds car to the list.
    public void addCar(Car car){
        Inventory.add(car);
    }
    //This creates the list of cars for the simulation
    public void createDefault(){
        Inventory.add(new Economy("aaa965"));
        Inventory.add(new Economy("bbb852"));
        Inventory.add(new Economy("ccc852"));
        Inventory.add(new Economy("ddd965"));
        Inventory.add(new Economy("eee852"));
        Inventory.add(new Economy("fff965"));
        Inventory.add(new Economy("ggg852"));
        Inventory.add(new Standard("hhh258"));
        Inventory.add(new Standard("iii963"));
        Inventory.add(new Standard("jjj258"));
        Inventory.add(new Standard("kkk963"));
        Inventory.add(new Standard("lll963"));
        Inventory.add(new Luxury("mmm258"));
        Inventory.add(new Luxury("nnn369"));
        Inventory.add(new Luxury("ooo58"));
        Inventory.add(new SUV("ppp962"));
        Inventory.add(new SUV("qqq796"));
        Inventory.add(new SUV("rrr962"));
        Inventory.add(new SUV("sss796"));
        Inventory.add(new SUV("ttt796"));
        Inventory.add(new Minivan("uuu164"));
        Inventory.add(new Minivan("vvv785"));
        Inventory.add(new Minivan("www164"));
        Inventory.add(new Minivan("xxx785"));
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