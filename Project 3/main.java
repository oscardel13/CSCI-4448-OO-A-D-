import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Car car1 = new Luxury("abc123");
        car1 = new GPS(car1);
        car1 = new Radio(car1);
        car1 = new CarSeat(car1);
        car1 = new CarSeat(car1);
        CarList Inv = new CarList();
        Inv.createDefault();
        AvailableCars Ava = new AvailableCars(Inv.getList());
        Ava.getAvailibles();
        CustomerList cust = new CustomerList();
        cust.createDefault();
        Store boulderrental = new Store(Ava, cust);
        boulderrental.addrenter(Ava.Inventory.get(0), cust.customerList.get(0), 1);
        boulderrental.addrenter(Ava.Inventory.get(1), cust.customerList.get(1), 2);
        System.out.println(Inv.Inventory.get(0).getDescription());
        System.out.println(Inv.Inventory.get(0).rented);
        Ava.printList();
        System.out.println(Inv.Inventory.get(0).rented);
        boulderrental.newday();
        System.out.println("New Day 1, car count: " + Ava.getSize());
        Ava.printList();
        boulderrental.newday();
        System.out.println("New Day 2, car count: " + Ava.getSize());
        Ava.printList();
        System.out.println(Inv.Inventory.get(0).getDescription());
        System.out.println(Inv.Inventory.get(0).rented);



        /*
        Customer colin = new Casual("Colin");
        Customer calvin = new Casual("Calvin");
        Customer oscar = new Regular("Oscar");
        Customer mikey = new Business("Mikey");
        System.out.println(colin.name);
        int[] ok = colin.performRent();
        System.out.println("NIGHTS WANTED "+ ok[1]);
        System.out.println("CAN HE RENT "+ colin.checkRentStatus());
        colin.changeRentStatus();
        System.out.println("CAN HE RENT NOW "+ colin.checkRentStatus());
        System.out.println(calvin.name);
        calvin.performRent();
        System.out.println(oscar.name);
        oscar.performRent();
        System.out.println(mikey.name);
        mikey.performRent();
        //Customer colin = new Casual("Colin");
        //Customer calvin = new Casual("Calvin");
        //Customer oscar = new Regular("Oscar");
        //Customer mikey = new Business("Mikey");
        Customer oscar = new Regular("Oscar");
        oscar.changeRentStatus();
        CustomerList cL = new CustomerList();
        cL.addCustomer(new Casual("Colin"));
        cL.addCustomer(oscar);
        cL.printList();
        System.out.println(cL.getList());
        ArrayList<Customer> testo = cL.getList();
        System.out.println("My name is " + testo.get(0).name + " and I " + testo.get(0).performRent());
        cL.createDefault();
        cL.printList();
        System.out.println("THIS IS BEEF");
        System.out.println(testo.get(1).name);
        FindCustomers beef = new FindCustomers(testo);
        beef.printList();
    */
        // FakeStore fakeStore = new FakeStore();
        // CustomerList cL = new CustomerList();
        // cL.createDefault();
        // ArrayList<Customer> custList = cL.getList();
        // //for(Customer customer:custList)
        // //    customer.changeRentStatus();
        // FindCustomers fC = new FindCustomers();

        // ArrayList<Customer> todaysCustomers = fC.todaysCustomers(custList);
        // for(Customer customer:todaysCustomers){
        //     //If customer does not want more cars than store has we send the customer in
        //     if(customer.carsWanted <= fakeStore.inventory){
        //         fakeStore.checkoutCustomer(customer);
        //     }else{
        //         System.out.println("NOT ENOUGH CARS");
        //     }
        // }
        // for(Customer customer:custList){
        //     System.out.println("NEXT CUSTOMER");
        //     System.out.println(customer.carsWanted);
        //     System.out.println(customer.nightsWanted);
        //     System.out.println(customer.canRent);
        //     System.out.println(customer.daysUntilNextRent);
        }




    
}