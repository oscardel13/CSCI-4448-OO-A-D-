import java.util.Random;

//Implements casual rent behavior
public class RentCas extends RentBehavior {
    Random rand = new Random();
    public int[] rent(int limit){
        limit = 1;
        int[] rentB = new int[2];
        //Actual rent behavior
        int carsRented = limit; //Rents one car
        int nightsRented = rand.nextInt(3)+1; //Can rent for 1-3 nights
        //Putting values in array
        rentB[0] = carsRented;
        rentB[1] = nightsRented;
        System.out.println("Casual:  Renting "+ carsRented + " cars for " + nightsRented + " days");
        return rentB;
    }
}
