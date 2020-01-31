public class Hippo extends Pachyderm{
  String name;
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