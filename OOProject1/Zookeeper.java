import java.util.*;
public class Zookeeper{
  //The animal object list is passed in for each method
  
  public static void wakeUp(Animal[] tmp){
    //Say what the Zookeeper is doing
     System.out.println("The Zookeeper is waking the animals up");
    //For each animal in the list we get their name, type, and action in that order
     for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].waking());
    }
    System.out.println("\n");
  }
  public static void rollCall(Animal[] tmp){
    //Say what the Zookeeper is doing
    System.out.println("The Zookeeper is doing roll call");
    //For each animal in the list we get their name, type, and action in that order
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].makeNoise());
    }
    System.out.println("\n");
  }
  public static void feed(Animal[] tmp){
    //Say what the Zookeeper is doing
    System.out.println("The Zookeeper is feeding");
    //For each animal in the list we get their name, type, and action in that order
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].eat());
    }
    System.out.println("\n");
  }
  public static void excercise(Animal[] tmp){
    //Say what the Zookeeper is doing
    System.out.println("The Zookeeper is exercising the animals");
    //For each animal in the list we get their name, type, and action in that order
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].roam());
    }
    System.out.println("\n");
  }
  public static void shutDown(Animal[] tmp){
    //Say what the Zookeeper is doing
    System.out.println("The Zookeeper is closing down the zoo");
    //For each animal in the list we get their name, type, and action in that order
    for(int i = 0;i<tmp.length;i++){
        System.out.println(tmp[i].getname() + " the " + tmp[i].getClass().getName() + " " +  tmp[i].sleep());
    }
    System.out.println("\n");
  }
}
