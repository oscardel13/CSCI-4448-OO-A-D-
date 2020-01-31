public class Wolf extends Canine{
    String name;
    //The name parameter is set as the animals name
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
