public class Business extends Customer {
    //Set the customers name and rent behavior
    public Business(String givenName){
        super(givenName);
        carLimit = 3;
        setRentBehavior(new RentBus());
    }
}
