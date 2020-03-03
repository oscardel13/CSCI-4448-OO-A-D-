public class SUV extends Car{
    public SUV(String L){
        description =  "SUV";
        this.Licence = L;
    }
    public double cost(){ //cost per day
        return 80.00;
    }
    public double price(){ //tax for the add ons
        return 7.50;
    }
}