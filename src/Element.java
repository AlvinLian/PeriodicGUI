public class Element {
    private String elementName;
    private int atomicNum;
    private double atomicMass;
    private int atomicRadius;
    private String symbol;

    public Element (String elementName, int atomicNum, double atomicMass, int atomicRadius, String symbol) {
        this.elementName = elementName;
        this.atomicNum = atomicNum;
        this.atomicMass = atomicMass;
        this.atomicRadius = atomicRadius;
        this.symbol = symbol;
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

    public double getAtomicRadius() {
        return atomicRadius;
    }
    public String getSymbol() {
        return symbol;
    }

}
