//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class Simulation {
    private static String[] listOfAddress = new String[]{"1420 Us 231 South, Troy, AL 36081", "1501 Skyland Blvd E, Tuscaloosa, AL 35405", "3501 20th Av, Valley, AL 36854", "1300 Montgomery Highway, Vestavia Hills, AL 35216", "4538 Us Hwy 231, Wetumpka, AL 36092", "2575 Us Hwy 43, Winfield, AL 35594"};

    public Simulation() {
    }

    public static void main(String[] args) {
        ArrayList<Address> testList = new ArrayList();

        int i;
        int random;
        for(i = 0; i < 10; ++i) {
            random = (int)(Math.random() * (double)listOfAddress.length);
            Address test = new Address(listOfAddress[random]);
            testList.add(test);
            System.out.println("index" + i + "  " + testList.get(i));
            System.out.println(((Address)testList.get(i)).getStreet());
        }

        for(i = 0; i < 10; ++i) {
            random = (int)(Math.random() * 9.0D);
            double weight = Math.random() * 9.0D;
            Package pack = new Package((Address)testList.get(i), (Address)testList.get(random), 1.0D);
            System.out.println(((Address)testList.get(i)).compare((Address)testList.get(random)));
            System.out.println(PostageCalculator.calculatePostage(pack));
        }

    }
}
