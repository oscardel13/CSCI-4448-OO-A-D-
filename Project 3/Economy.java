public class Economy extends Car{
    public Economy(String L){
        description =  "Economy";
        this.Licence = L;
    }
    public double cost(){
        return 50.00;
    }
    public double price(){
        return 0;
    }
}