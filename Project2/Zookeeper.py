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

    # Creating observable event for observers
    def notify_observers(self,action):
        for observers in self.observers:
            observers.update(action)

    # Zookeeper calling the animals to perform certain actions, using animal list
    def wakeUp(self):
        # Notifying the observers and announcing action
        self.notify_observers('wake up the animals')
        print("Im the Zookeeper and I'm waking the animals")
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.wake())
        print("")

    def rollCall(self):
        # Notifying the observers and announcing action
        self.notify_observers('roll call the animals')
        print("Im the Zookeeper and I'm roll calling the animals")
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.makeNoise())
        print("")

    def feed(self):
        # Notifying the observers and announcing action
        self.notify_observers('feed the animals')
        print("Im the Zookeeper and I'm feeding the animals")
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.eat())
        print("")

    def excercise(self):
        # Notifying the observers and announcing action
        self.notify_observers('work out the animals')
        print("Im the Zookeeper and I'm exercising the animals")
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.performRoam())
        print("")

    def shutDown(self):
        # Notifying the observers and announcing action
        self.notify_observers('close the zoo')
        print("Im the Zookeeper and I'm shutting this place down")
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.sleep())
        print("")
        # Deconstruct the observers after the Zookeeper is done
        self.clear_observer()
