# helmet_equipment.py
from AlpinistEquipment import AlpinistEquipment

class HelmetEquipment(AlpinistEquipment):
    def __init__(self, name, weight, cost, material):
        super().__init__(name, weight, cost)
        self._material = material

    def getMaterial(self):
        return self._material

    def setMaterial(self, value):
        self._material = value

    def display(self):
        super().display()
        print(f"Material: {self._material}")