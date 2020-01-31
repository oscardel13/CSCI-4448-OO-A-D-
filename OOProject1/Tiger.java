public class Tiger extends Feline{
    String name;
    public Tiger(String givenName){
        this.name=givenName;
    }
  	public String makeNoise(){
      return ("roars but not as loud as a lion");
    }
  
  public String eat(){
    return ("tries to eat the dog but the lions safes him");
  }
  public String getname(){
      return(name);
    }
}