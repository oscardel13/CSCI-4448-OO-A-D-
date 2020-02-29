public class FakeStore {
    int inventory;
    public FakeStore(){
        inventory = 5;
    }
    public void checkoutCustomer(Customer customer){
        customer.changeRentStatus();
        customer.updateDaysTillRent(customer.nightsWanted);
        inventory -= customer.carsWanted;
    }
}
