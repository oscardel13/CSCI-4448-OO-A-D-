public class Main {
  
    public static void main(String[] args) {
	Cat colin = new Cat("Colin"); 
  Cat cashmere = new Cat("Cashmere");
  Dog donnie = new Dog("Donnie");
  Dog dion = new Dog("Dion");
  Wolf wumpy = new Wolf("Wumpy");
  Wolf wanda = new Wolf("Wanda");
  Tiger tony = new Tiger("Tony");
  Tiger tinderthot = new Tiger("Tinderthot");
  Lion lary = new Lion("Lary");
  Lion loscar = new Lion("Loscar");
  Hippo hilda = new Hippo("Hilda");
  Hippo hippona = new Hippo("Hippona");
  Rhino rexy = new Rhino("Rexy");
  Rhino rastaman = new Rhino ("Rastaman");
  Elephant egg = new Elephant ("Egg");
  Elephant ebon = new Elephant ("Ebon");
  Zookeeper bob = new Zookeeper();
  Animal[] zoo = {colin,cashmere,donnie,dion,wumpy,wanda,tony,tinderthot,lary,loscar,hilda,hippona,rexy,rastaman,egg,ebon};
  
  //System.out.println(zoo.animals);
  //System.out.println(zoo.animals.get(0).getname());
  
  //System.out.println(colin.roam());
  //System.out.println(yo[0].name);
  Zookeeper.wakeUp(zoo);
  Zookeeper.rollCall(zoo);
  Zookeeper.feed(zoo);
  Zookeeper.excercise(zoo);
  Zookeeper.shutDown(zoo);
}
}