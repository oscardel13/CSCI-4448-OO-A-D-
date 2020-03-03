// This class is to keep track of the history of the store, it keeps track of the total revenue and the customers that come in
public class History{
    int rented = 0;
    int cusrented = 0;
    int busrented = 0;
    int regrented = 0;
    int revenue = 0;

    //this function to add to the counter for total customer and their types
    void addRent(Customer client){
        rented++;
        if (client.getCustomerType() == "Casual")
            cusrented++;
        if (client.getCustomerType() == "Business")
            busrented++;
        if (client.getCustomerType() == "Regular")
            regrented++;
    }
    // This is to add to the revenue of the store
    void addRev(Double rev){
        revenue += rev;
    }
}