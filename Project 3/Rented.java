public class Rented{
    Car car;
    Customer client;
    int renttime;
    int counter = 0;
    Double cost;
    String Description;
    public Rented(Car ca, Customer cl, Double c, String d, int i){
        car = ca;
        client = cl;
        renttime = i;
        cost = c;
        Description = d;
    }
}