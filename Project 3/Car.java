public abstract class Car{
    String description = "";
    String Licence = "";
    boolean rented = false;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
    public abstract double price();
    public double total(int i){
        return this.price() + this.cost()*i;
    }

}