public class Hippo extends Pachyderm{
  String name;
  //The name parameter is set as the animals name
  public Hippo(String givenName){
      this.name=givenName;
  }
  public String makeNoise(){
      return ("moos");
    }
    public String getname(){
      return(name);
    }
}
