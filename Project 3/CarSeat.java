public class CarSeat extends Decorator{
    Car tmpcar;
    protected CarSeat(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Children Car Seat";
    }
    public double price(){
        return tmpcar.price() + 5.00;
    }
    public double cost(){
        return tmpcar.cost();
    }
  }