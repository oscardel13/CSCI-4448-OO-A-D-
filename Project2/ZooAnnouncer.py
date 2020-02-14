# Here we are implementing the Observer Pattern
class ZooAnnouncer(object):
    def __init__(self, zoo, name):
        self.zookeeper = zoo
        # When we create an observer it observes who we passed in constructor
        self.zookeeper.register_observer(self)
        self.Name = name
        self.action = ""

    # An update from the Zookeeper makes the observers display whats happening
    def update(self, action):
        self.action = action
        self.display(action)

    # Displays what it sees Zookeeper doing
    def display(self, action):
        print("Hi, this is " + self.Name + " the Zoo Announcer. The Zookeeper is about to " + action)

    # Destructor for observers
    def __del__(self):
        print(self.Name + " the observer is deconstructing")

