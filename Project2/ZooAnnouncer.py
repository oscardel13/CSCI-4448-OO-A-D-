# Here we are implementing the Observer Pattern
class ZooAnnouncer(object):
    def __init__(self, zoo, name):
        self.zookeeper = zoo
        # When we create an observer it observes who we passed in constructor
        self.zookeeper.register_observer(self)
        self.Name = name

    # An update from the Zookeeper makes the observers display whats happening
    def update(self, action):
        self.action = action
        #returns display for out 
        return self.display(action)

    # Displays what it sees Zookeeper doing
    def display(self, action):
        #returns string for out
        return ("Hi, this is " + self.Name + " the Zoo Announcer. The Zookeeper is about to " + action + "\n")

    # Destructor for observers
    def __del__(self):
        return
