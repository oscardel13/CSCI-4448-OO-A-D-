import java.util.Random;

//Implements casual rent behavior
public class RentCas extends RentBehavior {
    Random rand = new Random();
    public int[] rent(){
        String action = "I rent super casually:";
        int[] rentB = new int[2];
        //Actual rent behavior
        int carsRented = 1; //Rents one car
        int nightsRented = rand.nextInt(3)+1; //Can rent for 1-3 nights
        //Putting values in array
        rentB[0] = carsRented;
        rentB[1] = nightsRented;
        System.out.println(action + " Renting "+ carsRented + " cars for " + nightsRented + " days");
        return rentB;
    }
}
