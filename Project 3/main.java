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
        CustomerList cust = new CustomerList();
        cust.createDefault();
        Store boulderrental = new Store(Ava, cust);
        boulderrental.addrenter(Ava.Inventory.get(0), cust.customerList.get(0), 1);
        boulderrental.addrenter(Ava.Inventory.get(1), cust.customerList.get(1), 2);
        // Ava.getAvailibles();
        // Ava.printList();
        // System.out.println(Inv.Inventory.get(0).rented);
        // boulderrental.newday();
        // System.out.println("New Day 1, car count: " + Ava.getSize());
        // Ava.getAvailibles();
        // Ava.printList();
        // boulderrental.newday();
        // System.out.println("New Day 2, car count: " + Ava.getSize());
        // Ava.getAvailibles();
        // Ava.printList();


    }
}