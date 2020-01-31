public class Elephant extends Pachyderm{
  	String name;
    public Elephant(String givenName){
        this.name=givenName;
    }
  public String makeNoise(){
      return ("trumpets");
    }
    public String getname(){
      return(name);
    }
}