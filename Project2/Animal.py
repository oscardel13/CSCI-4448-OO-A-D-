import Roam

class Animal(object):
    def __init__(self):
        self.roamstyle = Roam()
        self.zoo = []
    def addAnimal(self, animal):
        self.zoo.append(animal)
    def sleep(self):
        return "goes to bed"
    def eat(self):
        return "eats"
    def wake(self):
        return "wakes up"
    def makeNoise(self):
        return("makes a noise")
    def performRoam(self):
        return (self.roamstyle.roamType())
    def setRoamBehavior(self, Roam):
        self.roamstyle = Roam
 #---------------------------------------------------------------------
 class Canine(Animal):
    def __init__(self,name):
        self.Type = "Canine"
        Animal.__init__(self)
        self.setRoamBehavior(Pack())

class Wolf(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name

    def makeNoise(self):
        return("howls")

class Dog(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("barks")
#----------------------------------------------------------------------------
class Feline(Animal):
    def __init__(self,name):
        self.Type = "Feline"
        Animal.__init__(self)
        self.setRoamBehavior(Solo())

class Lion(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("hoaws all mighty")

class Tiger(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("roars like a tiger")

class Cat(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("meows")
#--------------------------------------------------------------------------
class Pachyderm(Animal):
    def __init__(self):
        self.Type = "Pachyderm"
        Animal.__init__(self)
        self.setRoamBehavior(Herd())

class Rhino(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("trumpets")

class Elephant(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("start talking smack")

class Hippo(Canine):
    def __init__(self,name):
        Canine.__init__(self,name)
        self.Name=name
    def makeNoise(self):
        return("moos like a hippo, i think")
#-------------------------------------------------------------------------------
