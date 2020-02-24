public class Regular extends Customer {
    public Regular(String givenName){
        //Use superclass to set name
        super(givenName);
        //Set rent behavior to casual
        setRentBehavior(new RentReg());
    }
}
