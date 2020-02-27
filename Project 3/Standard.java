public class Standard extends Car{
    public Standard(String L){
        description =  "Standard";
        this.Licence = L;
    }
    public double cost(){
        return 70.00;
    }
    public double price(){
        return 2.50;
    }
}