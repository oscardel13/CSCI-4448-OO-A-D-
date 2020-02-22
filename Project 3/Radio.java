public class Radio extends Decorator{ 
    Car tmpcar;
    protected Radio(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Radio";
    }
    public double price(){
        return tmpcar.price() + 7.00;
    }
    public double cost(){
        return tmpcar.cost();
    }
}