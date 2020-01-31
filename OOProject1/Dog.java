public class Dog extends Canine{
    String name;
    //The name parameter is set as the animals name
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
