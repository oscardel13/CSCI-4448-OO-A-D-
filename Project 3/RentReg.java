import java.util.Random;

//Sets regular rent behavior
public class RentReg implements RentBehavior {
    Random rand = new Random();
    public void rent(){
        String action = "I rent on the regular:";
        //Actual rent behavior
        int carsRented = rand.nextInt(3) + 1; //Can rent 1-3 cars
        int nightsRented = rand.nextInt(3)+3; //Can rent for 3-5 nights
        System.out.println(action + " Renting "+ carsRented + " cars for " + nightsRented + " days");
    }
}
