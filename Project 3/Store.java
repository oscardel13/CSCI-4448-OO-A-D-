import java.util.*;

public class Store{
    AvailableCars Inventory;
    CustomerList Clientell;
    ArrayList<Rented> rentlist = new ArrayList<Rented>();
    Announcer announcer;
    int day = 1;
    public Store(AvailableCars inv, CustomerList ls){
        Inventory = inv;
        Clientell = ls;
        announcer = new Announcer(this);
    }

    public void addrenter(Car car, Customer client, int days){
        Random rd = new Random();
        car.rented = true;
        Car tmp = car;
        client.carLimit--;
        if (rd.nextBoolean() == true){
            tmp = new Radio(tmp);
        }
        if (rd.nextBoolean() == true){
            tmp = new GPS(tmp);
        }
        for (int j = 0; j < rd.nextInt(5);j++){
            tmp = new CarSeat(tmp);
        }
        Rented tmprent = new Rented(car,client,tmp.total(days),tmp.getDescription(),days);
        announcer.update(client, tmp.total(days), tmprent);
        rentlist.add(tmprent);
        Inventory.remove(car);
    }

    public void customerRentals(Customer client){
        int days = client.nightsWanted;
        int cars = client.carsWanted;
        for (int i = 0; i < cars;i++){
            addrenter(Inventory.Available.get(0), client, days);
        }
        //Update customer info after renting cars
        if(client.carLimit == 0) {
            client.changeRentStatus();
        }
        client.updateDaysTillRent(days);

    }

    public void returncar(Rented r){
        r.car.rented = false;
        r.client.carLimit++;
        Inventory.addCar(r.car);
        rentlist.remove(r);

    }
    public void newday(){
        int i = 0;
        day++;
        announcer.cleartodayrevenue();
        announcer.todaysrentals.clear();
        Clientell.updateAllCustomers();
        while (tryRent(i) != null){
            rentlist.get(i).counter++;
            if (rentlist.get(i).counter == rentlist.get(i).renttime){
                returncar(rentlist.get(i));
                continue;  
            }
            i++;
        }
    }

    public void announce(){   
        announcer.display_newday();
        announcer.display_Completerentals(); 
        announcer.display_activeRentals();
        announcer.display_AvailableCars();
        announcer.display_todayrevenue();
    }
    public Rented tryRent(int i){
        try{
            return rentlist.get(i);
        } 
        catch(Exception e)
        {return null;}
    }
    public void printHist(){
        announcer.display_History();
    }
}