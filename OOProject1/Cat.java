public class Cat extends Feline{
    public String name = "";
    //The name parameter is set as the animals name
    public Cat(String givenName){
        this.name=givenName;
    }
    
   //The sleep function is where we randomly select a method, so all other functions call sleep
   public String makeNoise(){
      return sleep();
   }
   public String eat(){
      return sleep();
   }
   
  public String waking(){
      return sleep();
   }
   public String roam(){
      return sleep();
   }
   
   
    public String getname(){
      return(name);
    }
    //Using Math.random to get random numbers, and then mapping those numbers to methods
  	public String sleep(){
      int y = (int)(Math.random() * ((5 - 1) + 1)) + 1;
      
      if (y == 1){
        return ("went to sleep");
      }
      if (y == 2){
        return "meows like a cutie";
      }
      if (y == 3){
        return "are traveling solo";
      }
      if (y == 4){
         return "wakes up";
      }
      else {
        return "eats up";
      }
      
    }
  
}
