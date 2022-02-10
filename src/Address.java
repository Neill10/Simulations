//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Address {
    private String streetNum;
    private String street;
    private String apartmentNum;
    private String city;
    private String state;
    private String zipcode;
    private boolean isApartmentNum;

    public Address(String streetNum, String street, String apartmentNum, String city, String state, String zipcode) {
        this.streetNum = streetNum;
        this.street = street;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        if (zipcode.length() != 5) {
            System.out.println("Not a valid zipcode!(length of zipcode is not 5) Zipcode will be equal to null.");
            this.zipcode = null;
        } else {
            this.zipcode = zipcode;
        }

        this.isApartmentNum = true;
    }

    public Address(String streetNum, String street, String city, String state, String zipcode) {
        this.streetNum = streetNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.isApartmentNum = false;
    }

    public Address(Address address) {
        this.streetNum = address.getStreetNum();
        this.street = address.getStreet();
        this.city = address.getCity();
        this.state = address.getState();
        this.zipcode = address.getZipcode();
        if (address.isApartmentNumber()) {
            this.apartmentNum = address.getApartmentNum();
            this.isApartmentNum = true;
        } else {
            this.isApartmentNum = false;
        }

    }

    public Address(String address) {
        if (address.indexOf("Apt") != -1) {
            this.isApartmentNum = true;
        } else {
            this.isApartmentNum = false;
        }

        int i = address.indexOf(" ");
        this.streetNum = address.substring(0, i);
        address = address.substring(i + 1);
        int c;
        int s;
        if (this.isApartmentNum) {
            c = address.indexOf("Apt");
            this.street = address.substring(0, c - 1);
            address = address.substring(c + 4);
            s = address.indexOf(",");
            this.apartmentNum = address.substring(0, s);
            address = address.substring(s + 2);
        } else {
            c = address.indexOf(",");
            this.street = address.substring(0, c);
            address = address.substring(c + 2);
        }

        c = address.indexOf(",");
        this.city = address.substring(0, c);
        address = address.substring(c + 2);
        s = address.indexOf(" ");
        this.state = address.substring(0, s);
        address = address.substring(s + 1);
        this.zipcode = address;
    }

    public boolean compare(Address address) {
        boolean same = true;
        if (!this.getStreet().equals(address.getStreet())) {
            same = false;
        }

        if (!this.getStreetNum().equals(address.getStreetNum())) {
            same = false;
        }

        if (!this.getCity().equals(address.getCity())) {
            same = false;
        }

        if (!this.getZipcode().equals(address.getZipcode())) {
            same = false;
        }

        if (!this.getState().equals(address.getState())) {
            same = false;
        }

        if (this.isApartmentNumber() != address.isApartmentNumber()) {
            return false;
        } else {
            if (this.isApartmentNumber() && !this.getApartmentNum().equals(address.getApartmentNum())) {
                same = false;
            }

            return same;
        }
    }

    public boolean isApartmentNumber() {
        return this.isApartmentNum;
    }

    public String getStreetNum() {
        return this.streetNum;
    }

    public String getStreet() {
        return this.street;
    }

    public String getApartmentNum() {
        if (this.isApartmentNum) {
            return this.apartmentNum;
        } else {
            System.out.println("There is no apartment number!");
            return null;
        }
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public String toString() {
        String str;
        if (this.isApartmentNum) {
            str = this.streetNum + " " + this.street + " Apt " + this.apartmentNum + ", " + this.city + ", " + this.state + " " + this.zipcode;
        } else {
            str = this.streetNum + " " + this.street + ", " + this.city + ", " + this.state + " " + this.zipcode;
        }

        return str;
    }
}
