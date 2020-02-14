import Animal
import Zookeeper
import ZooAnnouncer
from datetime import datetime

def main():
    # Create an animal object zoo to act as a list to group the animals
    zoo = Animal.Animal()

    # Create the Zookeeper lol, passing in animals
    lol = Zookeeper.Zookeeper(zoo.animalList)

    # Two Zoo Announcers Colin and Oscar who are observers
    ZooAnnouncer.ZooAnnouncer(lol, "Colin")
    ZooAnnouncer.ZooAnnouncer(lol, "Oscar")

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

    #opens file
    f = open("Project2/outFile.txt","w")
    #prints heading of file
    f.write("Oscar and Colin Zoo simulator \nUpdate: " + str(datetime.now().strftime("%m/%d/%Y %H:%M:%S")) + "\n\n")

    # Zookeeper performing his duties and prints to file
    lol.wakeUp(f)
    lol.rollCall(f)
    lol.feed(f)
    lol.excercise(f)
    # shutDown also clears the observers and prints to file
    lol.shutDown(f)
    #closes file
    f.close()


if __name__ == "__main__":
    main()
