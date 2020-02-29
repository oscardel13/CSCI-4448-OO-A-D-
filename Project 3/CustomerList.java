import java.util.*;

public class CustomerList {
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer(Customer cust){
        customerList.add(cust);
        System.out.println("Added " + cust.name + " to list!");
    }
    //Hello?
    public void createDefault(){
        customerList.clear();
        customerList.add(new Casual("Eddie"));
        customerList.add(new Casual("Colin"));
        customerList.add(new Casual("Custard"));
        customerList.add(new Casual("Oscar"));
        customerList.add(new Casual("Cassie"));
        customerList.add(new Casual("Fondlebirts"));
        customerList.add(new Regular("Reggie"));
        customerList.add(new Regular("Ronald"));
        customerList.add(new Regular("Rwonda"));
        customerList.add(new Business("Brenda"));
        customerList.add(new Business("Ben"));
        customerList.add(new Business("Birdman"));
    }

    public void printList(){
        //iterating ArrayList
        for(Customer customer:customerList)
            System.out.println(customer.name);
    }

    public ArrayList<Customer> getList(){
        //Makes a clone of the list, so that changes to original is not reflected in new list
        ArrayList<Customer> arrayListClone =  (ArrayList<Customer>) customerList.clone();
        return(arrayListClone);
    }

}
