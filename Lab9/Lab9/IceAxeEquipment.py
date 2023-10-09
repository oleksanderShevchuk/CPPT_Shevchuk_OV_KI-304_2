# ice_axe_equipment.py
from AlpinistEquipment import AlpinistEquipment

class IceAxeEquipment(AlpinistEquipment): # льодоруб
    def __init__(self, name, weight, cost, length):
        super().__init__(name, weight, cost)
        self._length = length

    def getLength(self):
        return self._length

    def setLength(self, value):
        self._length = value

    def display(self):
        super().display()
        print(f"Length: {self._length}")