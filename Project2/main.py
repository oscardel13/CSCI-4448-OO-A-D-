import Animal
import Zookeeper
import ZooAnnouncer

def main():
    zoo = Animal()
    zoo.addAnimal(Cat("Colin"))
    zoo.addAnimal(Cat("Cashmere"))
    zoo.addAnimal(Dog("Donnie"))
    zoo.addAnimal(Dog("Dion"))
    zoo.addAnimal(Wolf("Wumpy"))
    zoo.addAnimal(Wolf("Wanda"))
    zoo.addAnimal(Tiger("Tony"))
    zoo.addAnimal(Tiger("Tinderthot"))
    zoo.addAnimal(Lion("Lary"))
    zoo.addAnimal(Lion("Loscar"))
    zoo.addAnimal(Hippo("Hilda"))
    zoo.addAnimal(Hippo("Hippona"))
    zoo.addAnimal(Rhino("Rexy"))
    zoo.addAnimal(Rhino ("Rastaman"))
    zoo.addAnimal(Elephant ("Egg"))
    zoo.addAnimal(Elephant ("Ebon"))
    lol = Zookeeper(zoo.zoo)
    pop = ZooAnnouncer(lol, "Colin")
    pop2 = ZooAnnouncer(lol, "Oscar")

    lol.wakeUp()
    lol.rollCall()
    lol.feed()
    lol.excercise()
    lol.shutDown()


if __name__ == "__main__":
    main
