class Roam(object):
    def roamType(self):
        return (self.Roam)

class Solo(Roam):
    def roamType(self):
        return ("roams alone")

class Pack(Roam):
    def roamType(self):
        return ("roams in a pack")

class Herd(Roam):
    def roamType(self):
        return ("roams in a herd")
