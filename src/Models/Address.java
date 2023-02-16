package Models;

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
}
