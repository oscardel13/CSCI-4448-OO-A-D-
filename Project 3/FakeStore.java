public class FakeStore {
    int inventory;
    public FakeStore(){
        inventory = 5;
    }
    public void checkoutCustomer(Customer customer){
        //If the customer hit their car limit then they cant rent anymore
        if(customer.carLimit == 0) {
            customer.changeRentStatus();
        }
        customer.updateDaysTillRent(customer.nightsWanted);
        inventory -= customer.carsWanted;
    }
}
