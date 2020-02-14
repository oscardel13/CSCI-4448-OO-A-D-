# Here we are implementing the strategy design pattern
class Roam(object):
    def roamType(self):
        return self.Roam


# Three types of roaming for the three animal types, all subclasses of Roam
class Solo(Roam):
    def roamType(self):
        return "roams alone"


class Pack(Roam):
    def roamType(self):
        return "roams in a pack"


class Herd(Roam):
    def roamType(self):
        return "roams in a herd"
