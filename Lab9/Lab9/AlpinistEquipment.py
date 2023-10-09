# alpinist_equipment.py
class AlpinistEquipment:
    """Class representing alpinist equipment."""

    def __init__(self, name, weight, cost):
        """Initialize an instance of AlpinistEquipment."""
        self._name = name
        self._weight = weight
        self._cost = cost
        
    def getName(self):
        """Get the name of the equipment."""
        return self._name
    
    def getWeight(self):
        """Get the weight of the equipment."""
        return self._weight
    
    def getCost(self):
        """Get the cost of the equipment."""
        return self._cost
    
    def setName(self, value):
        """Set the name of the equipment."""
        self._name = value
        
    def setWeight(self, value):
        """Set the weight of the equipment."""
        self._weight = value
        
    def setCost(self, value):
        """Set the cost of the equipment."""
        self._cost = value

    def display(self):
        """Display information about the equipment."""
        print(f"Name: {self._name}, Weight: {self._weight}, Cost: {self._cost}")
