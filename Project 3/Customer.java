abstract public class Customer {
    //Name is for the constructor setting customers name
    String name = "";
    //Instance of the RentBehavior class for later use
    RentBehavior rentBehavior;
    //Can they rent?
    boolean canRent;
    //How many days till they can rent again
    int daysUntilNextRent;
    //Rent behavior as numbers
    int carsWanted;
    int nightsWanted;
    int carLimit;
    String type;

    //Set customers name
    public Customer(String givenName){
        this.name=givenName;
        this.canRent = true;
        this.daysUntilNextRent = 0;
    }
    //If we want to set or change customers behavior
    public void setRentBehavior(RentBehavior rb){
        rentBehavior = rb;
    }

    //Sets the customers rent behavior
    public void performRent(){
        //carLimit
        int[] grabNums = rentBehavior.rent(carLimit);
        //System.out.println(rentBehavior.rent());
        carsWanted = grabNums[0];
        nightsWanted = grabNums[1];
        //System.out.println("Cars wanted now " + carsWanted + " Nights wanted now " + nightsWanted);
    }

    //See if they can rent
    public boolean checkRentStatus(){
        return(canRent);
    }

    //If we want to be specific about if they can rent or not
    public void setRentStatus(boolean b){
        canRent = b;
    }
    //Change customers rent availability
    public void changeRentStatus(){
        //Switch boolean
        if(canRent){
            canRent = false;
        }else{
            canRent = true;
        }
    }
    //For seeing what kind of customer it is
    public String getCustomerType(){
        return type;
    }

    //This is used by Casual and Business customers
    public void dailyCustomerUpdate(){
        //One day closer to renting again
        if(daysUntilNextRent != 0){
            daysUntilNextRent--;
        }
        //If daysUntilNextRent hits 0 and they still cant rent, let them rent
        if(daysUntilNextRent == 0 && canRent == false){
            changeRentStatus();
        }
    }

    public void updateDaysTillRent(int daysRenting){
        daysUntilNextRent = daysRenting;
    }

}
