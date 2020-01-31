import java.util.*;
public class Animal {
  public String name;
  public String type;
  
  
  List<Animal> animals = new ArrayList<Animal>();
  
  //We set all of the methods in here in case they were not called again for the animals subclasses
    public String sleep(){
        return ("went to sleep");
    }
    public String eat(){
        return ("eats up");
    }
  	public String waking(){
        return ("wakes up");
    }
    public String makeNoise(){
        return ("makes noise");
    }
    public String roam(){
        return ("roams");
    }
    public void add(Animal tmp){
        animals.add(tmp);
    }
    public String getname(){
      return "";
    }
}
