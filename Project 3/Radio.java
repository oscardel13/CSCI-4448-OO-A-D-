public class Radio extends Decorator{ 
    Car tmpcar;
    protected Radio(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Radio"; //Adds the add on to desciption
    }
    public double price(){
        return tmpcar.price() + 7.00; //adds base cost to price
    }
    public double cost(){
        return tmpcar.cost(); //we don't change cost so it returns it 
    }
}