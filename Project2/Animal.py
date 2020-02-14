import Roam
import random


# Animal super class
class Animal(object):

    def __init__(self):
        self.roamstyle = Roam.Roam()
        self.animalList = []

    # For creating a group of animals
    def addAnimal(self, animal):
        self.animalList.append(animal)

    # Functions all animals share
    def sleep(self):
        return "goes to bed"

    def eat(self):
        return "eats"

    def wake(self):
        return "wakes up"

    # Here we are using the strategy design pattern on roam
    def performRoam(self):
        return self.roamstyle.roamType()

    def setRoamBehavior(self, Roam):
        self.roamstyle = Roam


# ---------------------------------------------------------------------
class Canine(Animal):
    def __init__(self):
        # Defining type and using strategy pattern to set roam behavior
        self.Type = "Canine"
        Animal.__init__(self)
        self.setRoamBehavior(Roam.Pack())

# Each initializes name through constructor and has own noise

class Wolf(Canine):
    def __init__(self, name):
        Canine.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "howls"


class Dog(Canine):
    def __init__(self, name):
        Canine.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "barks"


# ----------------------------------------------------------------------------
class Feline(Animal):
    def __init__(self):
        # Defining type and using strategy pattern to set roam behavior
        self.Type = "Feline"
        Animal.__init__(self)
        self.setRoamBehavior(Roam.Solo())


# Each initializes name through constructor and has own noise

class Lion(Feline):
    def __init__(self, name):
        Feline.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "howls all mighty"


class Tiger(Feline):
    def __init__(self, name):
        Feline.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "roars like a tiger"


class Cat(Feline):
    # Set name through constructor
    def __init__(self, name):
        Feline.__init__(self)
        self.Name = name

    # The randomize function picks a random number and then returns an action string depending on number
    def randomize(self):
        selector = random.randint(0, 4)
        if selector == 0:
            return "eats"
        elif selector == 1:
            return "wakes up"
        elif selector == 2:
            return "makes a noise"
        elif selector == 3:
            return "goes to bed"
        else:
            return "roams alone"

    # Every function in cat is overwritten to call randomize() instead
    def sleep(self):
        return self.randomize()

    def eat(self):
        return self.randomize()

    def wake(self):
        return self.randomize()

    def makeNoise(self):
        return self.randomize()

    def performRoam(self):
        return self.randomize()


# --------------------------------------------------------------------------
class Pachyderm(Animal):
    def __init__(self):
        # Defining type and using strategy pattern to set roam behavior
        self.Type = "Pachyderm"
        Animal.__init__(self)
        self.setRoamBehavior(Roam.Herd())


# Each initializes name through constructor and has own noise
class Rhino(Pachyderm):
    def __init__(self, name):
        Pachyderm.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "trumpets"


class Elephant(Pachyderm):
    def __init__(self, name):
        Pachyderm.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "start talking smack"


class Hippo(Pachyderm):
    def __init__(self, name):
        Pachyderm.__init__(self)
        self.Name = name

    def makeNoise(self):
        return "moos like a hippo, i think"
# -------------------------------------------------------------------------------
