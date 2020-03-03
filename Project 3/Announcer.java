import java.util.*; 
//THIS IS THE OBSERVER
public class Announcer{
    OutFile out; //connects to OutFile to print to P3Out
    History Hist; //Connects to History to keep track of it
    Store store; //Connects to the store
    ArrayList<Rented> todaysrentals = new ArrayList<Rented>(); //Keep track of rentals made that day
    Double todaysrevenue = 0.00; //Keep track of the revenue of the day

     public Announcer(Store store){
        out = new OutFile(); //makes an instance
        Hist = new History(); //makes a history object
        this.store = store; //connects to the store
     }

    //Displays the current day
    public void display_Day(){
        out.printOut("Day: " + store.day);
    }

    //this updates history and todays rental when a rental is made.
    public void update(Customer client, double x, Rented rent){
        Hist.addRent(client);
        Hist.addRev(x);
        todaysrevenue += x;
        todaysrentals.add(rent);
    }

    //This is to clear the list as it is a new day
    public void cleartodaysrental(){
        todaysrentals.clear();
    }

    //Prints Completed rentals for the day
    public void display_Completerentals(){
        out.printOut("\r\nComplete Rentals: " + todaysrentals.size() + "\r\nComplete Rentals List"); 
        for(Rented rec:todaysrentals)
            out.printOut("Car: " + rec.Description + " Rented by: " + rec.client.name + " For: " + rec.renttime + " days with Total price: " + rec.cost); 
    }

    //Prints Active rentals after day is done
    public void display_activeRentals(){
        out.printOut("\r\nActive Rentals Count: " + store.rentlist.size() + "\r\nActive Rentals List"); 
        for(Rented rec:store.rentlist)
        out.printOut(rec.car.description + " Rented by: " + rec.client.name + ", License Plate: " + rec.car.Licence);
    }

    //Prints Available cars after the day is done
    public void display_AvailableCars(){ //Better to add Availiblelist class then call funtion to add lol
        out.printOut("\r\nAvailable Car Count: " + store.Inventory.Available.size() + "\r\nList of Cars:");
        for(Car car:store.Inventory.Available)
            out.printOut(car.description + ", License Plate: " + car.Licence);
    }

    //DONE, THIS PRINTS THE CUSTOMERS THAT CAME IN AND THE REVENUE MADE during the 35 days (this could be improved by having 35 be the store.day)
    public void display_History(){

        out.printOut("Casuals in 35 days: " + Hist.cusrented + "\r\nBusiness in 35 days : " + Hist.busrented + 
        "\r\nRegulars in 35 days: " + Hist.regrented + "\r\nTotal customers in 35 days: " + Hist.rented + 
        "\r\nTotal revenue in 35 days: " + Hist.revenue);
        out.stopWriting();
    }

    //Displays the revenue made during the day
    public void display_todayrevenue(){
        out.printOut("\r\nRevenue for today: " + todaysrevenue + "\r\n");
    }

    //This is to clear the revenue as it is a new day
    public void cleartodayrevenue(){
        todaysrevenue = 0.00;
    }

}