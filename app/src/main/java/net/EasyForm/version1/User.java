package net.EasyForm.version1;

public class User {

    private String fname;
    private String mobile;
    private String email;
    private String Gender;
    private String occupation;
    private String country;
    private String pincode;

    public User() {

    }

    public User(String fname, String mobile, String email, String gender, String occupation, String country, String pincode) {
        this.fname = fname;
        this.mobile = mobile;
        this.email = email;
        Gender = gender;
        this.occupation = occupation;
        this.country = country;
        this.pincode = pincode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
