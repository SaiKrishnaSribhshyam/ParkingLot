package Models;

import java.util.Objects;

public class Address {
    private String adressLine1;
    private String getAdressLine2;
    private String pincode;

    public Address(String adressLine1, String getAdressLine2, String pincode) {
        this.adressLine1 = adressLine1;
        this.getAdressLine2 = getAdressLine2;
        this.pincode = pincode;
    }

    public String getAdress() {
        return adressLine1+getAdressLine2+pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(adressLine1, address.adressLine1) && Objects.equals(getAdressLine2, address.getAdressLine2) && Objects.equals(pincode, address.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adressLine1, getAdressLine2, pincode);
    }
}
