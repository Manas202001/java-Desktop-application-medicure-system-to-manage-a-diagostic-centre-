/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.beans;

/**
 *
 * @author manas-pc
 */
public class Users {
    private String address;
    private long aadharNo;
    private int age;
    private String city;
    private long mobileNo1;
    private long mobileNo2;
    private String fName;
    private String lName;
    private String testName;
    private String state;
    private String country;
    private char Attendence;

    public Users() {
    }

    public Users(String address,long aadharNo, int age, String city, long mobileNo1,long mobileNo2, String fName, String lName, String testName, String state, String country, char Attendence) {
        this.address = address;
        this.aadharNo = aadharNo;
        this.age = age;
        this.city = city;
        this.mobileNo1 = mobileNo1;
        this.mobileNo2 = mobileNo2;
        this.fName = fName;
        this.lName = lName;
        this.testName = testName;
        this.state = state;
        this.country = country;
        this.Attendence = Attendence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMobileNo1() {
        return mobileNo1;
    }

    public void setMobileNo1(long mobileNo1) {
        this.mobileNo1 = mobileNo1;
    }

    public long getMobileNo2() {
        return mobileNo2;
    }

    public void setMobileNo2(long mobileNo2) {
        this.mobileNo2 = mobileNo2;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getAttendence() {
        return Attendence;
    }

    public void setAttendence(char Attendence) {
        this.Attendence = Attendence;
    }
}
