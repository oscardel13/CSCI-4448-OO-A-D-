public class Regular extends Customer {
    int carsCurrentlyRented;
    public Regular(String givenName){
        //Use superclass to set name
        super(givenName);
        //Set rent behavior to regular
        setRentBehavior(new RentReg());
        //This is unique to regular customers
        carsCurrentlyRented = 0;
        carLimit = 3;
        type = "Regular";

    }
    //Overrides how daily updates function
    public void dailyUpdate(){
        if(carLimit != 0){
            setRentStatus(true);
        }
    }
}
