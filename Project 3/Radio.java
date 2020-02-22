public class Radio extends Decorator{ 
    Car tmpcar;
    protected Radio(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Radio";
    }
    public double cost(){
        return tmpcar.cost() + 10.00;
    }
}