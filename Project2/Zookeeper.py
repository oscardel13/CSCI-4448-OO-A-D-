class Zookeeper(object):
    def __init__(self, zoo):
        self.observers = []
        self.zoo = zoo

    def register_observer(self, observer):
        self.observers.append(observer)

    def clear_observer(self):
        for observers in self.observers:
            del observers
        self.observers.clear()

    def notify_observers(self,action):
        for observers in self.observers:
            observers.update(action)

    def wakeUp(self):
        self.notify_observers('wake up the animals')
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.wake())
        print("")

    def rollCall(self):
        self.notify_observers('roll call the animals')
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.makeNoise())
        print("")

    def feed(self):
        self.notify_observers('feed the animals')
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.eat())
        print("")

    def excercise(self):
        self.notify_observers('work out the animals')
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.performRoam())
        print("")

    def shutDown(self):
        self.notify_observers('close the zoo')
        for i in self.zoo:
            print(i.Name + " the " + i.Type + " " + i.sleep())
        print("")
