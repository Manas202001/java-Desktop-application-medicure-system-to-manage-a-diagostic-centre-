/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicure.beans;

/**
 *
 * @author manas-pc
 */
public class Login 
{
    private String loginId;
    private String password;
    private char type;
    private int age;
    private String name;
    private String address;
    
    /*public Login()
    {}
    public Login(int loginId,String password,char type,int age,String name,String address)
    {
      this.address=address;  
    }*/

    public Login() {
    }

    public Login(String loginId, String password, char type, int age, String name, String address) {
        this.loginId = loginId;
        this.password = password;
        this.type = type;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
