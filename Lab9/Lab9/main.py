# main.py
from AlpinistEquipment import AlpinistEquipment
from MilitaryAlpinistEquipment import MilitaryAlpinistEquipment
from IceAxeEquipment import IceAxeEquipment
from HelmetEquipment import HelmetEquipment

def main():
    alpinist_equipment1 = AlpinistEquipment("Rope", 2.5, 50)
    alpinist_equipment2 = AlpinistEquipment("Harness", 1.8, 30)

    military_equipment1 = MilitaryAlpinistEquipment("Climbing boots", 1.7, 80, True)
    military_equipment2 = MilitaryAlpinistEquipment("Climbing helmet", 0.5, 25, False)

    ice_axe_equipment = IceAxeEquipment("Ice Axe", 1.0, 40, 70)
    helmet_equipment = HelmetEquipment("Climbing Helmet", 0.3, 20, "Plastic")

    military_equipment1.toggleCamouflage()
    military_equipment2.toggleCamouflage()

    print("Alpinist Equipment:")
    alpinist_equipment1.display()
    alpinist_equipment2.display()

    print("\nMilitary Alpinist Equipment:")
    military_equipment1.display()
    military_equipment2.display()

    print("\nIce Axe Equipment:")
    ice_axe_equipment.display()

    print("\nHelmet Equipment:")
    helmet_equipment.display()

if __name__ == "__main__":
    main()
