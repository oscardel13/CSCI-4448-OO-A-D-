public class SUV extends Car{
    public SUV(String L){
        description =  "SUV";
        this.Licence = L;
    }
    public double cost(){
        return 80.00;
    }
    public double price(){
        return 7.50;
    }
}