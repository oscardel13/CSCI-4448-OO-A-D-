public class Luxury extends Category{
    public Luxury(String L){
        description =  "Luxury";
        this.Licence = L;
    }
    public double cost(){
        return 150.00;
    }
}