import java.util.*;
public class Announcer{
    OutFile out;
    History Hist;
    Store store;
    ArrayList<Rented> todaysrentals = new ArrayList<Rented>();
    Double todaysrevenue = 0.00;

     public Announcer(Store store){
        out = new OutFile();
        Hist = new History(); 
        this.store = store;
     }

    public void display_Day(int x){
        out.printOut("Day: " + x);
    }
    public void update(Customer client, double x, Rented rent){
        Hist.addRent(client);
        Hist.addRev(x);
        todaysrevenue += x;
        todaysrentals.add(rent);
    }

    public void cleartodaysrental(){
        todaysrentals.clear();
    }

    public void display_Completerentals(){
        out.printOut("\r\nComplete Rentals: " + todaysrentals.size() + "\r\nComplete Rentals List"); 
        for(Rented rec:todaysrentals)
            out.printOut("Car: " + rec.Description + " Rented by: " + rec.client.name + " For: " + rec.renttime + " days with Total price: " + rec.cost); 
    }
    public void display_activeRentals(){
        out.printOut("\r\nActive Rentals Count: " + store.rentlist.size() + "\r\nActive Rentals List"); 
        for(Rented rec:store.rentlist)
        out.printOut(rec.car.description + " Rented by: " + rec.client.name + " Licence Plate: " + rec.car.Licence); 
    }
    public void display_AvailableCars(){ //Better to add Availiblelist class then call funtion to add lol
        out.printOut("\r\nAvalaible Car Count: " + store.Inventory.Available.size() + "\r\nList of Cars:");
        for(Car car:store.Inventory.Available)
            out.printOut(car.description + ", Licence Plates: " + car.Licence);
    }
    //DONE, THIS PRINTS THE CUSTOMERS THAT CAME IN AND THE REVENUE MADE
    public void display_History(){

        out.printOut("Casuals in 35 days: " + Hist.cusrented + "\r\nBusiness in 35 days : " + Hist.busrented + 
        "\r\nRegulars in 35 days: " + Hist.regrented + "\r\nTotal customers in 35 days: " + Hist.rented + 
        "\r\nTotal revenue in 35 days: " + Hist.revenue);
        out.stopWriting();
    }
    public void display_todayrevenue(){
        out.printOut("\r\nRevenue for today: " + todaysrevenue + "\r\n");
    }
    public void display_newday(){
        out.printOut("Day: " + store.day);
    }
    public void cleartodayrevenue(){
        todaysrevenue = 0.00;
    }

}