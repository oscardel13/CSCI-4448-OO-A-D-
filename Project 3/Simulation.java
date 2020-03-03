//This class is so the main can look cleaner. This could be edited in future to run different simulations of different customer lists and car lists
public class Simulation{
    Store boulderRental;
    FindCustomers fC; 
    public Simulation(){
        CarList Inv = new CarList();
        Inv.createDefault();
        AvailableCars Ava = new AvailableCars(Inv.getList());
        CustomerList cust = new CustomerList();
        cust.createDefault();
        boulderRental = new Store(Ava, cust);
        fC = new FindCustomers(boulderRental,cust.getList());
    }

    void Run(){
        while(boulderRental.day <= 35){
            boulderRental.newday();
            fC.sendInCustomers();
            boulderRental.announce();
        }
        boulderRental.printHist();
    }
}