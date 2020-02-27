public class Minivan extends Car{
    public Minivan(String L){
        description =  "Mini Van";
        this.Licence = L;
    }
    public double cost(){
        return 75.00;
    }
    public double price(){
        return 5.00;
    }
}