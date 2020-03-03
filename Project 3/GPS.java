public class GPS extends Decorator{ 
    Car tmpcar;
    protected GPS(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", GPS"; //Adds the add on to desciption
    }
    public double price(){
        return tmpcar.price() + 10.00; //adds base cost to price
    }
    public double cost(){
        return tmpcar.cost();//we don't change cost so it returns it 
    }
  }