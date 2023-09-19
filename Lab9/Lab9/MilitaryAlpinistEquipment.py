# military_alpinist_equipment.py
from AlpinistEquipment import AlpinistEquipment

class MilitaryAlpinistEquipment(AlpinistEquipment):
    """Class representing military alpinist equipment."""

    def __init__(self, name, weight, cost, camouflage):
        """Initialize an instance of MilitaryAlpinistEquipment."""
        super().__init__(name, weight, cost)
        self._camouflage = camouflage

    @property
    def getCamouflage(self):
        """Get the camouflage status of the equipment."""
        return self._camouflage

    @getCamouflage.setter
    def setCamouflage(self, value):
        """Set the camouflage status of the equipment."""
        self._camouflage = value

    def toggleCamouflage(self):
        """Toggle the camouflage status of the equipment."""
        self._camouflage = not self._camouflage

    def display(self):
        """Display information about the military alpinist equipment."""
        super().display()
        print(f"Camouflage: {self._camouflage}")
