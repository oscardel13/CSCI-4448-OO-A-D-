abstract public class Customer {
    //Name is for the constructor setting customers name
    String name = "";
    //Instance of the RentBehavior class for later use
    RentBehavior rentBehavior;
    //Can they rent?
    boolean canRent;

    //Set customers name
    public Customer(String givenName){
        this.name=givenName;
        this.canRent = true;
    }
    //If we want to set or change customers behavior
    public void setRentBehavior(RentBehavior rb){
        rentBehavior = rb;
    }
    //Sets the customers rent behavior
    public int[] performRent(){
        System.out.println(rentBehavior.rent());
        return(rentBehavior.rent());
    }

    //See if they can rent
    public boolean checkRentStatus(){
        return(canRent);
    }

    //Change customers rent availability
    public void changeRentStatus(boolean bool){
        canRent = bool;
    }

}
