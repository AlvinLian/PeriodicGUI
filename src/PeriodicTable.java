import java.util.ArrayList;

public class PeriodicTable {
    private ArrayList<Element> periodicTable = new ArrayList<Element>();


    public PeriodicTable() {
        periodicTable.add(new Element("Hydrogen", 1, 1.008, 53, "H"));
        periodicTable.add(new Element("Helium", 2, 4.0026, 31, "He"));
        periodicTable.add(new Element("Lithium", 3, 6.94, 167, "Li"));
        periodicTable.add(new Element("Beryllium", 4, 9.0122, 112, "Be"));
        periodicTable.add(new Element("Boron", 5, 10.81, 87, "B"));
        periodicTable.add(new Element("Carbon", 6, 12.011, 67, "C"));
        periodicTable.add(new Element("Nitrogen", 7, 14.007, 56, "N"));
        periodicTable.add(new Element("Oxygen", 8, 15.999, 48, "O"));
        periodicTable.add(new Element("Fluorine", 9, 18.998, 42, "F"));
        periodicTable.add(new Element("Neon", 10, 20.18, 38, "Ne"));
        periodicTable.add(new Element("Sodium", 11, 22.99, 190, "Na"));
        periodicTable.add(new Element("Magnesium", 12, 24.305, 145, "Mg"));
        periodicTable.add(new Element("Aluminum", 13, 26.982, 118, "Al"));
        periodicTable.add(new Element("Silicon", 14, 28.085, 111, "Si"));
        periodicTable.add(new Element("Phosphorus", 15, 30.974, 98, "P"));
        periodicTable.add(new Element("Sulfur", 16, 32.06, 88, "S"));
        periodicTable.add(new Element("Chlorine", 17, 35.45, 79, "Cl"));
        periodicTable.add(new Element("Argon", 18, 39.948, 71, "Ar"));
        periodicTable.add(new Element("Potassium", 19, 39.098, 243, "K"));
        periodicTable.add(new Element("Calcium", 20, 40.078, 194, "Ca"));
        periodicTable.add(new Element("Scandium", 21, 44.956, 184, "Sc"));
        periodicTable.add(new Element("Titanium", 22, 47.867, 176, "Ti"));
        periodicTable.add(new Element("Vanadium", 23, 50.942, 171, "V"));
        periodicTable.add(new Element("Chromium", 24, 51.996, 166, "Cr"));
        periodicTable.add(new Element("Manganese", 25, 54.938, 161, "Mn"));
        periodicTable.add(new Element("Iron", 26, 55.845, 156, "Fe"));
        periodicTable.add(new Element("Cobalt", 27, 58.933, 152, "Co"));
        periodicTable.add(new Element("Nickel", 28, 58.693, 149, "Ni"));
        periodicTable.add(new Element("Copper", 29, 63.546, 145, "Cu"));
        periodicTable.add(new Element("Zinc", 30, 65.38, 142, "Zn"));
        periodicTable.add(new Element("Gallium", 31, 69.723, 136, "Ga"));
        periodicTable.add(new Element("Germanium", 32, 72.63, 125, "Ge"));
        periodicTable.add(new Element("Arsenic", 33, 74.922, 114, "As"));
        periodicTable.add(new Element("Selenium", 34, 78.971, 103, "Se"));
        periodicTable.add(new Element("Bromine", 35, 79.904, 94, "Br"));
        periodicTable.add(new Element("Krypton", 36, 83.798, 88, "Kr"));
        periodicTable.add(new Element("Rubidium", 37, 85.468, 265, "Rb"));
        periodicTable.add(new Element("Strontium", 38, 87.62, 219, "Sr"));
        periodicTable.add(new Element("Yttrium", 39, 88.906, 212, "Y"));
        periodicTable.add(new Element("Zirconium", 40, 91.224, 206, "Zr"));
        periodicTable.add(new Element("Niobium", 41, 92.906, 198, "Nb"));
        periodicTable.add(new Element("Molybdenum", 42, 95.95, 190, "Mo"));
        periodicTable.add(new Element("Technetium", 43, 98, 183, "Tc"));
        periodicTable.add(new Element("Ruthenium", 44, 101.07, 178, "Ru"));
        periodicTable.add(new Element("Rhodium", 45, 102.91, 173, "Rh"));
        periodicTable.add(new Element("Palladium", 46, 106.42, 169, "Pd"));
        periodicTable.add(new Element("Silver", 47, 107.87, 165, "Ag"));
        periodicTable.add(new Element("Cadmium", 48, 112.41, 161, "Cd"));
        periodicTable.add(new Element("Indium", 49, 114.82, 156, "In"));
        periodicTable.add(new Element("Tin", 50, 118.71, 145, "Sn"));
        periodicTable.add(new Element("Antimony", 51, 121.76, 133, "Sb"));
        periodicTable.add(new Element("Tellurium", 52, 127.6, 123, "Te"));
        periodicTable.add(new Element("Iodine", 53, 126.9, 115, "I"));
        periodicTable.add(new Element("Xenon", 54, 131.29, 108, "Xe"));
        periodicTable.add(new Element("Cesium", 55, 132.91, 298, "Cs"));
        periodicTable.add(new Element("Barium", 56, 137.33, 253, "Ba"));
        periodicTable.add(new Element("Lanthanum", 57, 138.91, 195, "La"));
        periodicTable.add(new Element("Cerium", 58, 140.12, 185, "Ce"));
        periodicTable.add(new Element("Praseodymium", 59, 140.91, 247, "Pr"));
        periodicTable.add(new Element("Neodymium", 60, 144.24, 206, "Nd"));
        periodicTable.add(new Element("Promethium", 61, 145, 205, "Pm"));
        periodicTable.add(new Element("Samarium", 62, 150.36, 238, "Sm"));
        periodicTable.add(new Element("Europium", 63, 151.96, 231, "Eu"));
        periodicTable.add(new Element("Gadolinium", 64, 157.25, 233, "Gd"));
        periodicTable.add(new Element("Terbium", 65, 158.93, 225, "Tb"));
        periodicTable.add(new Element("Dysprosium", 66, 162.5, 228, "Dy"));
        periodicTable.add(new Element("Holmium", 67, 164.93, 216, "Ho"));
        periodicTable.add(new Element("Erbium", 68, 167.26, 221, "Er"));
        periodicTable.add(new Element("Thulium", 69, 168.93, 222, "Tm"));
        periodicTable.add(new Element("Ytterbium", 70, 173.05, 222, "Yb"));
        periodicTable.add(new Element("Lutetium", 71, 174.97, 217, "Lu"));
        periodicTable.add(new Element("Hafnium", 72, 178.49, 208, "Hf"));
        periodicTable.add(new Element("Tantalum", 73, 180.95, 200, "Ta"));
        periodicTable.add(new Element("Tungsten", 74, 183.84, 193, "W"));
        periodicTable.add(new Element("Rhenium", 75, 186.21, 188, "Re"));
        periodicTable.add(new Element("Osmium", 76, 190.23, 185, "Os"));
        periodicTable.add(new Element("Iridium", 77, 192.22, 180, "Ir"));
        periodicTable.add(new Element("Platinum", 78, 195.08, 177, "Pt"));
        periodicTable.add(new Element("Gold", 79, 196.97, 174, "Au"));
        periodicTable.add(new Element("Mercury", 80, 200.59, 171, "Hg"));
        periodicTable.add(new Element("Thallium", 81, 204.38, 156, "Tl"));
        periodicTable.add(new Element("Lead", 82, 207.2, 154, "Pb"));
        periodicTable.add(new Element("Bismuth", 83, 208.98, 143, "Bi"));
        periodicTable.add(new Element("Polonium", 84, 209, 135, "Po"));
        periodicTable.add(new Element("Astatine", 85, 210, 127, "At"));
        periodicTable.add(new Element("Radon", 86, 222, 120, "Rn"));
        periodicTable.add(new Element("Francium", 87, 223, 348, "Fr"));
        periodicTable.add(new Element("Radium", 88, 226, 283, "Ra"));
        periodicTable.add(new Element("Actinium", 89, 227, 215, "Ac"));
        periodicTable.add(new Element("Thorium", 90, 232.04, 206, "Th"));
        periodicTable.add(new Element("Protactinium", 91, 231.04, 200, "Pa"));
        periodicTable.add(new Element("Uranium", 92, 238.03, 196, "U"));
        periodicTable.add(new Element("Neptunium", 93, 237, 190, "Np"));
        periodicTable.add(new Element("Plutonium", 94, 244, 187, "Pu"));
        periodicTable.add(new Element("Americium", 95, 243, 180, "Am"));
        periodicTable.add(new Element("Curium", 96, 247, 169, "Cm"));
        periodicTable.add(new Element("Berkelium", 97, 247, 169, "Bk"));
        periodicTable.add(new Element("Californium", 98, 251, 173, "Cf"));
        periodicTable.add(new Element("Einsteinium", 99, 252, 245, "Es"));
        periodicTable.add(new Element("Fermium", 100, 257, 200, "Fm"));
        periodicTable.add(new Element("Mendelevium", 101, 258, 200, "Md"));
        periodicTable.add(new Element("Nobelium", 102, 259, 200, "No"));
        periodicTable.add(new Element("Lawrencium", 103, 262, 200, "Lr"));
        periodicTable.add(new Element("Rutherfordium", 104, 267, 200, "Rf"));
        periodicTable.add(new Element("Dubnium", 105, 270, 200, "Db"));
        periodicTable.add(new Element("Seaborgium", 106, 271, 200, "Sg"));
        periodicTable.add(new Element("Bohrium", 107, 270, 200, "Bh"));
        periodicTable.add(new Element("Hassium", 108, 277, 200, "Hs"));
        periodicTable.add(new Element("Meitnerium", 109, 278, 200, "Mt"));
        periodicTable.add(new Element("Darmstadtium", 110, 281, 200, "Ds"));
        periodicTable.add(new Element("Roentgenium", 111, 282, 200, "Rg"));
        periodicTable.add(new Element("Copernicium", 112, 285, 200, "Cn"));
        periodicTable.add(new Element("Nihonium", 113, 286, 200, "Nh"));
        periodicTable.add(new Element("Flerovium", 114, 289, 200, "Fl"));
        periodicTable.add(new Element("Moscovium", 115, 290, 200, "Mc"));
        periodicTable.add(new Element("Livermorium", 116, 293, 200, "Lv"));
        periodicTable.add(new Element("Tennessine", 117, 294, 200, "Ts"));
        periodicTable.add(new Element("Oganesson", 118, 294, 200, "Og"));
    }

    public ArrayList<Element> getPeriodicTable() {
        return periodicTable;
    }

    public String displayMessage(int elementIndex) {
        String str = "Element name: " + periodicTable.get(elementIndex).getElementName() + "\n";
        str += "Element Symbol: " + periodicTable.get(elementIndex).getElementName() + "\n";
        str += "Atomic Number: " + periodicTable.get(elementIndex).getAtomicNum() + "\n";
        str += "Atomic Mass: " + periodicTable.get(elementIndex).getAtomicMass() + "\n";
        str += "Atomic Radius(in pm): " + periodicTable.get(elementIndex).getAtomicRadius() + "\n";
        return str;

    }
}
