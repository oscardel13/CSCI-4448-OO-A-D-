import java.util.*;

public class CustomerList {
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer(Customer cust){
        customerList.add(cust);
        System.out.println("Added " + cust.name + " to list!");
    }

    public void printList(){
        //iterating ArrayList
        for(Customer customer:customerList)
            System.out.println(customer.name);
    }

    public ArrayList<Customer> getList(){
        return(customerList);
    }

}
