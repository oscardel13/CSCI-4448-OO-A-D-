public class CarSeat extends Decorator{
    Car tmpcar;
    protected CarSeat(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Children Car Seat"; //Adds the add on to desciption
    }
    public double price(){
        return tmpcar.price() + 5.00; //adds base cost to price
    }
    public double cost(){
        return tmpcar.cost();//we don't change cost so it returns it 
    }
  }