import java.util.*;

public class Store{
    AvailableCars Inventory;
    CustomerList Clientell;
    History Hist;
    ArrayList<Rented> rentlist = new ArrayList<Rented>();
    ArrayList<Rented> todaysrentals = new ArrayList<Rented>();
    Announcer announcer;
    Double todaysrevenue = 0.00;
    int day = 1;
    public Store(AvailableCars inv, CustomerList ls){
        Inventory = inv;
        Clientell = ls;
        Hist = new History(); 
        announcer = new Announcer();
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
        addtodaysrev(tmp.total(days));
        Hist.addRent(client);
        Hist.addRev(tmp.total(days));
        todaysrentals.add(new Rented(car,client,tmp.total(days),tmp.getDescription(),days));
        rentlist.add(new Rented(car,client,tmp.total(days),tmp.getDescription(),days));
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

    // THIS STILL NEED TO COMMUNICATE WITH ANNOUNCER TO PRINT COUNT OF ALL COMPLETED RENTALS WHICH CARS with options, customer, days rented, total fee
    public void returncar(Rented r){
        r.car.rented = false;
        r.client.carLimit++;
        Inventory.addCar(r.car);
        rentlist.remove(r);

    }
    public void newday(){
        int i = 0;
        day++;
        cleartodaysrev();
        todaysrentals.clear();
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

    public void updateAnnouncer(){   
        System.out.println(announcer.display_newday(day));
        System.out.println(announcer.display_Completerentals(todaysrentals)); 
        System.out.println(announcer.display_activeRentals(rentlist));
        System.out.println(announcer.display_AvailableCars(Inventory.Available));
        System.out.println(announcer.display_todayrevenue(todaysrevenue));
    }
    public Rented tryRent(int i){
        try{
            return rentlist.get(i);
        } 
        catch(Exception e)
        {return null;}
    }

    public void addtodaysrev(double x){
        todaysrevenue += x;
    }
    public void cleartodaysrev(){
        todaysrevenue = 0.00;
    }
    public void printHist(){
        System.out.println(announcer.display_History(Hist));
    }
}