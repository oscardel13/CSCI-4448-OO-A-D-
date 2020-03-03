public class Minivan extends Car{
    public Minivan(String L){
        description =  "Mini Van";
        this.Licence = L;
    }
    public double cost(){ //cost per day
        return 75.00;
    }
    public double price(){ //tax for the add ons
        return 5.00;
    }
}