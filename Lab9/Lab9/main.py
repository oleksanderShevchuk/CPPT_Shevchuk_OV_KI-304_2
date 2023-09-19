# main.py
from AlpinistEquipment import AlpinistEquipment
from MilitaryAlpinistEquipment import MilitaryAlpinistEquipment

def main():
    # Create instances of the base class (AlpinistEquipment)
    alpinist_equipment1 = AlpinistEquipment("Rope", 2.5, 50)
    alpinist_equipment2 = AlpinistEquipment("Harness", 1.8, 30)

    # Create instances of the derived class (MilitaryAlpinistEquipment)
    military_equipment1 = MilitaryAlpinistEquipment("Climbing boots", 1.7, 80, True)
    military_equipment2 = MilitaryAlpinistEquipment("Climbing helmet", 0.5, 25, False)

    # Toggle camouflage for the military equipment
    military_equipment1.toggleCamouflage()
    military_equipment2.toggleCamouflage()

    # Display information about the equipment
    print("Alpinist Equipment:")
    alpinist_equipment1.display()
    alpinist_equipment2.display()

    print("\nMilitary Alpinist Equipment:")
    military_equipment1.display()
    military_equipment2.display()

if __name__ == "__main__":
    main()