import java.util.*;
public class Zookeeper{
  public static void wakeUp(Animal[] tmp){
     System.out.println("The Zookeeper is waking the animals up");
     for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].waking());
    }
    System.out.println("\n");
  }
  public static void rollCall(Animal[] tmp){
    System.out.println("The Zookeeper is doing roll call");
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].makeNoise());
    }
    System.out.println("\n");
  }
  public static void feed(Animal[] tmp){
    System.out.println("The Zookeeper is feeding");
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].eat());
    }
    System.out.println("\n");
  }
  public static void excercise(Animal[] tmp){
    System.out.println("The Zookeeper is exercising the animals");
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].roam());
    }
    System.out.println("\n");
  }
  public static void shutDown(Animal[] tmp){
    System.out.println("The Zookeeper is closing down the zoo");
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].sleep());
    }
    System.out.println("\n");
  }
}