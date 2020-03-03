// I made this class to mimick a node but for the cars being rented. Its to connect the car with the customer and to save any important info
// Its more like the recipt
public class Rented{
    Car car; //car being rented (plain, no add ons)
    Customer client; //customer renting
    int renttime; //the day they need to return
    int counter = 0; //counter to keep track how many days its been since pickup
    Double cost; // Total cost (cost*days + price of add ons)
    String Description; //car with the add ons
    public Rented(Car ca, Customer cl, Double c, String d, int i){
        car = ca;
        client = cl;
        renttime = i;
        cost = c;
        Description = d;
    }
}