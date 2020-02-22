public class Minivan extends Category{
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