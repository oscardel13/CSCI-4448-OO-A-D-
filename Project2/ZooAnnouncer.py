import Zookeeper

class ZooAnnouncer(object):
    def __init__(self,zoo,name):
        self.zookeeper = zoo
        self.zookeeper.register_observer(self)
        self.Name = name
        self.action = ""

    def update(self,action):
        self.action = action
        self.display(action)

    def display(self,action):
        print("Hi, this is " + self.Name + " the Zoo Announcer . The Zookeeper is about to  " + action)

    def __del__(self):

