public class Wolf extends Canine{
    String name;
    public Wolf(String givenName){
        this.name=givenName;
    }
  public String makeNoise(){
      return ("howls");
    }
    public String getname(){
      return(name);
    }
}