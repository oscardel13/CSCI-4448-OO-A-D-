public class RentBus implements RentBehavior {
    //Sets the business customers rent behavior
    public void rent(){
        String action = "I rent like a business man:";
        //Actual rent behavior
        int carsRented = 3; //Rents 3 cars
        int nightsRented = 7; //For 7 nights
        System.out.println(action + " Renting "+ carsRented + " cars for " + nightsRented + " days");
    }
}
