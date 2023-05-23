public class Element {
    private String elementName;
    private int atomicNum;
    private double atomicMass;
    private double atomicRadius;

    public Element (String elementName, int atomicNum, double atomicMass, double atomicRadius) {
        this.elementName = elementName;
        this.atomicNum = atomicNum;
        this.atomicMass = atomicMass;
        this.atomicRadius = atomicRadius;
    }

    public String getElementName() {
        return elementName;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public double atomicRadius() {
        return atomicRadius;
    }

}
