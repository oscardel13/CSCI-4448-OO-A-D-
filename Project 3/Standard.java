public class Standard extends Car{
    public Standard(String L){
        description =  "Standard";
        this.Licence = L;
    }
    public double cost(){ //cost per day
        return 70.00;
    }
    public double price(){ //tax for the add ons
        return 2.50;
    }
}