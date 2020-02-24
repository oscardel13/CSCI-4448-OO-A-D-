abstract public class Customer {
    //Name is for the constructor setting customers name
    String name = "";
    //Instance of the RentBehavior class for later use
    RentBehavior rentBehavior;

    //Set customers name
    public Customer(String givenName){
        this.name=givenName;
    }
    //If we want to set or change customers behavior
    public void setRentBehavior(RentBehavior rb){
        rentBehavior = rb;
    }
    //Sets the customers rent behavior
    public void performRent(){
        rentBehavior.rent();
    }

}
