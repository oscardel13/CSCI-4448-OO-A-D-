public class Economy extends Car{
    public Economy(String L){
        description =  "Economy";
        this.Licence = L;
    }
    public double cost(){ //cost per day
        return 50.00;
    }
    public double price(){ //tax for the add ons
        return 0;
    }
}