import java.util.*;

//This class decides what customers come into the store that day
public class FindCustomers extends CustomerList{
    ArrayList<Customer> currentCustomers = new ArrayList<>();

    public ArrayList<Customer> todaysCustomers(ArrayList<Customer> cL){
        currentCustomers.clear();
        System.out.println(cL);
        //Randomize order
        Collections.shuffle(cL);
        //System.out.println("Shuffled bitch" + cL);

        //Look at 5 random customers, if they can rent then add them to currentCustomers, these will be customers trying to enter store today
        for(int i = 0; i<5; i++){
            if(cL.get(i).canRent){
                currentCustomers.add(cL.get(i));
            }
        }
        //Update each customers values for how many cars/nights they want to rent today
        for(Customer customer:currentCustomers)
            customer.performRent();
        //System.out.println(currentCustomers);
        return(currentCustomers);
    }

    public void sendInCustomers(ArrayList<Customer> custList, Store store){
        for(Customer customer:custList){
            //If customer does not want more cars than store has we send the customer in
            if(customer.carsWanted <= store.Inventory.getSize()){
                //Send to store
                store.customerRentals(customer);
            }else{
                System.out.println("NOT ENOUGH CARS");
            }
        }
    }
}
