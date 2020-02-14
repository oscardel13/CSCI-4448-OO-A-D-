import Animal
import Zookeeper
import ZooAnnouncer


def main():
    # Create an animal object zoo to act as a list to group the animals
    zoo = Animal.Animal()

    # Create each animal passing in their name as a parameter
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
    zoo.addAnimal(Animal.Rhino("Rastaman"))
    zoo.addAnimal(Animal.Elephant("Egg"))
    zoo.addAnimal(Animal.Elephant("Ebon"))

    # Create the Zookeeper lol, passing in animals
    lol = Zookeeper.Zookeeper(zoo.animalList)

    # Two Zoo Announcers Colin and Oscar who are observers
    ZooAnnouncer.ZooAnnouncer(lol, "Colin")
    ZooAnnouncer.ZooAnnouncer(lol, "Oscar")

    # Zookeeper performing his duties
    lol.wakeUp()
    lol.rollCall()
    lol.feed()
    lol.excercise()
    # shutDown also clears the observers
    lol.shutDown()


if __name__ == "__main__":
    main()
