import java.util.*;

public class Store{
    AvailableCars Inventory;
    CustomerList Clientell;
    ArrayList<Rented> rentlist = new ArrayList<Rented>();

    public Store(AvailableCars inv, CustomerList ls){
        Inventory = inv;
        Clientell = ls;
    }
    
    public class Rented{
        Car car;
        Customer client;
        int renttime;
        int counter = 0;
        public Rented(Car ca, Customer cl, int i){
            car = ca;
            client = cl;
            renttime = i;
        }
    }

    public void addrenter(Car car, Customer client, int i){
        //Rented newR = new Rented(car,client,i);
        car.rented = true;
        rentlist.add(new Rented(car,client,i));
    }
    public void returncar(Rented r){
        r.car.rented = false;
        rentlist.remove(r);

    }
    public void newday(){
        int i = 0;
        while (tryRent(i) != null){
            rentlist.get(i).counter++;
            if (rentlist.get(i).counter == rentlist.get(i).renttime){
                returncar(rentlist.get(i));
                continue;  
            }
            i++;
        }
    }
    public Rented tryRent(int i){
        try{
            return rentlist.get(i);
        } 
        catch(Exception e)
        {return null;}
    }
}