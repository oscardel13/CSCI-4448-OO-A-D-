import java.util.*;

public class Store{
    AvailableCars Inventory; //Cars in stock (ready to be rented)
    CustomerList Clientell; //list of all the customers
    ArrayList<Rented> rentlist = new ArrayList<Rented>(); //Active rentals list
    Announcer announcer; //connects to an announcer
    int day = 0; 
    public Store(AvailableCars inv, CustomerList ls){
        Inventory = inv; //connects to the inventory
        Clientell = ls; //connects to customer list
        announcer = new Announcer(this); //makes the announcer
    }

    //This adds the renter to active rental and communicates to announcer
    public void addrenter(Car car, Customer client, int days){
        Random rd = new Random(); //
        car.rented = true; //set car rented to true so it won't be rented while its gone
        Car tmp = car; //makes copy of car
        client.carLimit--; //lower the limit amount of the car the customer is allowed to rent
        if (rd.nextBoolean() == true){ //randomly adds Radio as add on
            tmp = new Radio(tmp);
        }
        if (rd.nextBoolean() == true){//randomly adds GPS as add on
            tmp = new GPS(tmp);
        }
        for (int j = 0; j < rd.nextInt(5);j++){//randomly adds number of Children seats as add on
            tmp = new CarSeat(tmp);
        }
        Rented tmprent = new Rented(car,client,tmp.total(days),tmp.getDescription(),days); //makes Rented node
        announcer.update(client, tmp.total(days), tmprent); //announcer updates history and adds rental for the completed rentals for today list
        rentlist.add(tmprent); //add renter to rental list
        Inventory.remove(car); //removes the car from the availble car list
    }

    //This adds the cars to the customer
    public void customerRentals(Customer client){
        int days = client.nightsWanted; //the number of nights he wants them for
        int cars = client.carsWanted; //number of cars he wants
        for (int i = 0; i < cars;i++){ //loops through for the amount of cars he wants
            addrenter(Inventory.Available.get(0), client, days); //adds the car to active rentals list
        }
        //Update customer info after renting cars
        if(client.carLimit == 0) {
            client.changeRentStatus();
        }
        client.updateDaysTillRent(days);

    }

    //Returns the car
    public void returncar(Rented r){
        r.car.rented = false; //sets the rented back to false
        r.client.carLimit++; //allows customer to rent 1 more car
        Inventory.addCar(r.car); //adds car back to available cars
        rentlist.remove(r); //removes the rented node from active rental list

    }
    
    //This is for the morning, it adds counter to all the people renting and if the counter hits the rent time they return the car
    public void newday(){
        int i = 0; //index
        day++; //goes up a day
        announcer.cleartodayrevenue(); //tells announcer to clear revenue as its a new day
        announcer.todaysrentals.clear(); //tells announcer to clear todays rental as its a new day
        Clientell.updateAllCustomers(); //adds counter to all customers renting
        while (tryRent(i) != null){ //loops through the renters list
            rentlist.get(i).counter++; //adds a counter to the renters
            if (rentlist.get(i).counter == rentlist.get(i).renttime){ //checks if its time to return the car
                returncar(rentlist.get(i)); //if it is then returns it
                continue;  //skips the increment as the next rented node would be the same index as the one being removed
            }
            i++;
        }
    }

    //This tells announce to print the day, completed rentals, active rentals, availables cars, and total revenue for the day
    public void announce(){   
        announcer.display_Day();
        announcer.display_Completerentals(); 
        announcer.display_activeRentals();
        announcer.display_AvailableCars();
        announcer.display_todayrevenue();
    }

    //This was made to work with newdays when iterating through the loop. Its a safe mark to not break the program.
    public Rented tryRent(int i){
        try{
            return rentlist.get(i); //gets rented
        } 
        catch(Exception e) //if its out of bound or if list is empty return null instead of breaking
        {return null;}
    }

    // Prints store history by telling announcer to do it
    public void printHist(){
        announcer.display_History();
    }
}