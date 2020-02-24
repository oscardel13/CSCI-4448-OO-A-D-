public class Business extends Customer {
    //Set the customers name and rent behavior
    public Business(String givenName){
        super(givenName);
        setRentBehavior(new RentBus());
    }
}
