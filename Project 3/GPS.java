public class GPS extends Decorator{ 
    Car tmpcar;
    protected GPS(Car tcar){
        this.tmpcar = tcar;
    }

    public String getDescription(){
        return tmpcar.getDescription() + ", GPS";
    }
    public double price(){
        return tmpcar.price() + 10.00;
    }
    public double cost(){
        return tmpcar.cost();
    }
  }