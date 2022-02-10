//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Package {
    private Address origin;
    private Address destination;
    private double weight;

    public Package(Address origin, Address destination, double weight) {
        this.origin = origin;
        this.destination = destination;
        if (weight < 0.1D) {
            System.out.println("Not a valid weight! (Less than .1 lbs) Weight will be equal to null");
            this.weight = 0.0D;
        } else {
            this.weight = weight;
        }

    }

    public Address getOrigin() {
        return this.origin;
    }

    public Address getDestination() {
        return this.destination;
    }

    public double getWeight() {
        return this.weight;
    }
}
