public class Luxury extends Car{
    public Luxury(String L){
        description =  "Luxury";
        this.Licence = L;
    }
    public double cost(){
        return 150.00;
    }
    public double price(){
        return 10.00;
    }
}