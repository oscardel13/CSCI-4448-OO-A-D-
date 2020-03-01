public class History{
    int rented = 0;
    int cusrented = 0;
    int busrented = 0;
    int regrented = 0;
    int revenue = 0;

    void addRent(Customer client){
        rented++;
        if (client.getCustomerType() == "Casueal")
            cusrented++;
        if (client.getCustomerType() == "Business")
            busrented++;
        if (client.getCustomerType() == "Regular")
            regrented++;
    }

    void addRev(Double rev){
        revenue += rev;
    }

    void getHistory(){
        
    }

}