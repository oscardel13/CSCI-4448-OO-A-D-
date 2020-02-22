public class CarSeat extends Decorator{
    Car tmpcar;
    protected CarSeat(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", Radio";
    }
    public double cost(){
        return tmpcar.cost() + 10.00;
    }
  }