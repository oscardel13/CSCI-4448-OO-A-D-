import java.util.Random;

//Sets regular rent behavior
public class RentReg extends RentBehavior {
    Random rand = new Random();

    public int[] rent(int limit){
        int[] rentB = new int[2];
        //Actual rent behavior
        int carsRented = rand.nextInt(limit) + 1; //Can rent 1-3 cars
        int nightsRented = rand.nextInt(3)+3; //Can rent for 3-5 nights
        //Filling return array
        rentB[0] = carsRented;
        rentB[1] = nightsRented;
        System.out.println("Regular: Renting "+ carsRented + " cars for " + nightsRented + " days");
        return rentB;
    }
}
