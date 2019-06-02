public class Person {

    private String name;
    private String middlename;
    private String backname;
    private String adress;
    private String housenumber;
    private String zipcode;
    private String residence;
    private String dateofbirth;
    private String email;
    private String phone;

    public Person() {
        this.name = "";
        this.middlename = "";
        this.backname = "";
        this.adress = "";
        this.housenumber = "";
        this.zipcode = "";
        this.residence = "";
        this.dateofbirth = "";
        this.email = "";
        this.phone = "";
    }

    public Person(String name, String middlename, String achternaam, String adress, String housenumber, String zipcode, String residence, String dateofbirth, String email, String phone) {
        this.name = name;
        this.middlename = middlename;
        this.backname = achternaam;
        this.adress = adress;
        this.housenumber = housenumber;
        this.zipcode = zipcode;
        this.residence = residence;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBackname() {
        return backname;
    }

    public void setBackname(String backname) {
        this.backname = backname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}