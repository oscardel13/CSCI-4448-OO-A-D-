class Zookeeper(object):

    def __init__(self, zoo):
        self.observers = []
        self.zoo = zoo

    # Here we are implementing the Observer Pattern

    # Letting observers observe
    def register_observer(self, observer):
        self.observers.append(observer)

    # Stopping observers from observing
    def clear_observer(self):
        for observers in self.observers:
            del observers
        self.observers.clear()
        return "The observers Deconstructed"

    # Creating observable event for observers
    def notify_observers(self,action):
        #out is made to save announcer message and return it for another out
        out = ""
        for observers in self.observers:
            out += observers.update(action)
        return out

    # Zookeeper calling the animals to perform certain actions, using animal list
    def wakeUp(self):
        # Notifying the observers and announcing action
        out = self.notify_observers('wake up the animals')
        out += ("Im the Zookeeper and I'm waking the animals")
        for i in self.zoo:
            out += ("\n" + i.Name + " the " + i.Type + " " + i.wake())
        out += ("\n\n")
        #returns all actions displays in one string for easier printing in file
        return out

    def rollCall(self):
        # Notifying the observers and announcing action
        out = self.notify_observers('roll call the animals')
        out += ("Im the Zookeeper and I'm roll calling the animals")
        for i in self.zoo:
            out += ("\n" + i.Name + " the " + i.Type + " " + i.makeNoise())
        out += ("\n\n")
        #returns all actions displays in one string for easier printing in file
        return out

    def feed(self):
        # Notifying the observers and announcing action
        out = self.notify_observers('feed the animals')
        out += ("Im the Zookeeper and I'm feeding the animals")
        for i in self.zoo:
            out += ("\n" + i.Name + " the " + i.Type + " " + i.eat())
        out += ("\n\n")
        #returns all actions displays in one string for easier printing in file
        return out

    def excercise(self):
        # Notifying the observers and announcing action
        out = self.notify_observers('work out the animals')
        out += ("Im the Zookeeper and I'm exercising the animals")
        for i in self.zoo:
            out += ("\n" + i.Name + " the " + i.Type + " " + i.performRoam())
        out += ("\n\n")
        #returns all actions displays in one string for easier printing in file
        return out

    def shutDown(self):
        # Notifying the observers and announcing action
        out = self.notify_observers('close the zoo')
        out += ("Im the Zookeeper and I'm shutting this place down")
        for i in self.zoo:
            out += ("\n" + i.Name + " the " + i.Type + " " + i.sleep())
        out += ("\n")
        out += ("\n" + self.clear_observer())
        #returns all actions displays in one string for easier printing in file
        return out
        # Deconstruct the observers after the Zookeeper is done
