public class Rented{
    Car car;
    Customer client;
    int renttime;
    int counter = 0;
    int cost;
    public Rented(Car ca, Customer cl, int i){
        car = ca;
        client = cl;
        renttime = i;
        // maybe add cost
    }
}