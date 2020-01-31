public class Rhino extends Pachyderm{
  String name;
  public Rhino(String givenName){
        this.name=givenName;
  }
  public String makeNoise(){
      return ("starts talking smack");
    }
    public String getname(){
      return(name);
    }
}