class Zookeeper(object):

    def __init__(self, zoo):
        self.observers = []
        self.zoo = zoo

    # Here we are implementing the Observer Pattern

    # Letting observers observe
    def register_observer(self, observer):
        self.observers.append(observer)

    # Stopping observers from observing
    def clear_observer(self,f):
        name = ""
        for observers in self.observers:
            name = observers.Name
            f.write(name + " the observer were deconstructing\n")
            del observers
        self.observers.clear()

    # Creating observable event for observers
    def notify_observers(self,action,f):
        for observers in self.observers:
            observers.update(action,f)


    # Zookeeper calling the animals to perform certain actions, using animal list
    def wakeUp(self,f):
        # Notifying the observers and announcing action
        self.notify_observers('wake up the animals',f)
        f.write("Im the Zookeeper and I'm waking the animals")
        for i in self.zoo:
            f.write("\n" + i.Name + " the " + i.Type + " " + i.wake())
        f.write("\n\n")


    def rollCall(self,f):
        # Notifying the observers and announcing action
        self.notify_observers('roll call the animals',f)
        f.write("Im the Zookeeper and I'm roll calling the animals")
        for i in self.zoo:
            f.write("\n" + i.Name + " the " + i.Type + " " + i.makeNoise())
        f.write("\n\n")

    def feed(self,f):
        # Notifying the observers and announcing action
        self.notify_observers('feed the animals',f)
        ("Im the Zookeeper and I'm feeding the animals")
        for i in self.zoo:
            f.write("\n" + i.Name + " the " + i.Type + " " + i.eat())
        f.write("\n\n")

    def excercise(self,f):
        # Notifying the observers and announcing action
        out = self.notify_observers('work out the animals',f)
        f.write("Im the Zookeeper and I'm exercising the animals")
        for i in self.zoo:
            f.write("\n" + i.Name + " the " + i.Type + " " + i.performRoam())
        f.write("\n\n")

    def shutDown(self,f):
        # Notifying the observers and announcing action
        self.notify_observers('close the zoo',f)
        f.write("Im the Zookeeper and I'm shutting this place down")
        for i in self.zoo:
            f.write("\n" + i.Name + " the " + i.Type + " " + i.sleep())
        f.write("\n\n")
        self.clear_observer(f)
        # Deconstruct the observers after the Zookeeper is done
