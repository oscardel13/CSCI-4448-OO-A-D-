public class Luxury extends Car{
    public Luxury(String L){
        description =  "Luxury";
        this.Licence = L;
    }
    public double cost(){ //cost per day
        return 150.00;
    }
    public double price(){ //tax for the add ons
        return 10.00;
    }
}