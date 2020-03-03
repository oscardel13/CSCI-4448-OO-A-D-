public abstract class Car{
    String description = ""; //This is the Car category plus the add ons
    String Licence = ""; //This is the Car licence plate
    boolean rented = false; //To keep track if its rented
    public String getDescription() {
        return description; 
    }
    public abstract double cost(); //This is the cost of the car per day
    public abstract double price(); //This is for the add on of the car
    public double total(int days){ // This is the cost of the car * the days plus the add ons
        return this.price() + this.cost()*days;
    }

}