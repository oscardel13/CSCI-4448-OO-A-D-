public class GPS extends Decorator{ 
    Car tmpcar;
    protected GPS(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", GPS";
    }
    public double cost(){
        return tmpcar.cost() + 15.00;
    }
  }