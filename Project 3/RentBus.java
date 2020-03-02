public class RentBus extends RentBehavior {

    //Sets the business customers rent behavior
    public int[] rent(int limit){
        int[] rentB = new int[2];
        //Actual rent behavior
        int carsRented = 3; //Rents 3 cars
        int nightsRented = 7; //For 7 nights
        //Filling return array
        rentB[0] = carsRented;
        rentB[1] = nightsRented;

        //System.out.println("Business:  Renting "+ carsRented + " cars for " + nightsRented + " days");
        return rentB;
    }
}
