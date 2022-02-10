//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PostageCalculator {
    private static double totalCost;
    private static double oCountyCode;
    private static double dCountyCode;

    public PostageCalculator() {
    }

    public static double calculatePostage(String oZipCode, String dZipCode, double weight) {
        oCountyCode = (double)Integer.parseInt(oZipCode.substring(0, 4));
        dCountyCode = (double)Integer.parseInt(dZipCode.substring(0, 4));
        double diff = Math.abs(dCountyCode - oCountyCode) / 100.0D;
        totalCost = cost(weight) + diff;
        return totalCost;
    }

    public static double calculatePostage(Address origin, Address destination, double weight) {
        String oZipCode = origin.getZipcode();
        String dZipCode = destination.getZipcode();
        oCountyCode = (double)Integer.parseInt(oZipCode.substring(0, 4));
        dCountyCode = (double)Integer.parseInt(dZipCode.substring(0, 4));
        double diff = Math.abs(dCountyCode - oCountyCode) / 100.0D;
        totalCost = cost(weight) + diff;
        return totalCost;
    }

    public static double calculatePostage(Package pack) {
        String oZipCode = pack.getOrigin().getZipcode();
        String dZipCode = pack.getDestination().getZipcode();
        oCountyCode = (double)Integer.parseInt(oZipCode.substring(0, 4));
        dCountyCode = (double)Integer.parseInt(dZipCode.substring(0, 4));
        double diff = Math.abs(dCountyCode - oCountyCode) / 100.0D;
        totalCost = cost(pack.getWeight()) + diff;
        return totalCost;
    }

    private static double cost(double weight) {
        double c = weight * 10.0D * 0.5D + 3.75D;
        return c;
    }
}
