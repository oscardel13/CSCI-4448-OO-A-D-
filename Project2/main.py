import Animal
import Zookeeper
import ZooAnnouncer

def main():
    zoo = Animal.Animal()
    zoo.addAnimal(Animal.Cat("Colin"))
    zoo.addAnimal(Animal.Cat("Cashmere"))
    zoo.addAnimal(Animal.Dog("Donnie"))
    zoo.addAnimal(Animal.Dog("Dion"))
    zoo.addAnimal(Animal.Wolf("Wumpy"))
    zoo.addAnimal(Animal.Wolf("Wanda"))
    zoo.addAnimal(Animal.Tiger("Tony"))
    zoo.addAnimal(Animal.Tiger("Tinderthot"))
    zoo.addAnimal(Animal.Lion("Lary"))
    zoo.addAnimal(Animal.Lion("Loscar"))
    zoo.addAnimal(Animal.Hippo("Hilda"))
    zoo.addAnimal(Animal.Hippo("Hippona"))
    zoo.addAnimal(Animal.Rhino("Rexy"))
    zoo.addAnimal(Animal.Rhino ("Rastaman"))
    zoo.addAnimal(Animal.Elephant ("Egg"))
    zoo.addAnimal(Animal.Elephant ("Ebon"))
    lol = Zookeeper.Zookeeper(zoo.zoo)
    pop1 = ZooAnnouncer.ZooAnnouncer(lol, "Colin")
    pop2 = ZooAnnouncer.ZooAnnouncer(lol, "Oscar")

    lol.wakeUp()
    lol.rollCall()
    lol.feed()
    lol.excercise()
    lol.shutDown()

    #lol.remove_observer("Colin")
    #lol.remove_observer("Oscar")

    del lol

if __name__ == "__main__":
    main()
