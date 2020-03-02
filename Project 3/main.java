import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        CarList Inv = new CarList();
        Inv.createDefault();
        AvailableCars Ava = new AvailableCars(Inv.getList());
        Ava.getAvailibles();
        CustomerList cust = new CustomerList();
        cust.createDefault();
        ArrayList<Customer> cL = cust.getList();
        FindCustomers fC = new FindCustomers();

        Store boulderRental = new Store(Ava, cust);
        //ArrayList<Customer> todaysCustomers = fC.todaysCustomers(cL);
        //fC.sendInCustomers(todaysCustomers, boulderRental);
        //System.out.println(Ava.getSize());
        //Ava.printList();
        //System.out.println(boulderRental.todaysrevenue);
        //FOR EVERYDAY LOOP WE
        //ArrayList<Customer> todaysCustomers = fC.todaysCustomers(cL);
        //sendInCustomers(todaysCustomers, boulderRental)
        while(boulderRental.day < 35){
            ArrayList<Customer> todaysCustomers = fC.todaysCustomers(cL);
            fC.sendInCustomers(todaysCustomers, boulderRental);
            boulderRental.updateAnnouncer();
            boulderRental.newday();
        }
        boulderRental.printHist();
        }
}