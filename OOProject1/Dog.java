public class Dog extends Canine{
    String name;
    public Dog(String givenName){
        this.name=givenName;
    }
  public String makeNoise(){
      return ("barks");
    }
    public String getname(){
      return(name);
    }
}