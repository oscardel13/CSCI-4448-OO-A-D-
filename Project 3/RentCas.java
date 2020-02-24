import java.util.Random;

//Implements casual rent behavior
public class RentCas implements RentBehavior {
    Random rand = new Random();
    public void rent(){
        String action = "I rent super casually:";
        //Actual rent behavior
        int carsRented = 1; //Rents one car
        int nightsRented = rand.nextInt(3)+1; //Can rent for 1-3 nights
        System.out.println(action + " Renting "+ carsRented + " cars for " + nightsRented + " days");
    }
}
