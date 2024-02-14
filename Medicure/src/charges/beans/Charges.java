/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charges.beans;

/**
 *
 * @author manas-pc
 */
public class Charges 
{
private int opt;
private String testName;
private long charges;
private long discounts;
private String feedback;
private String membership_offers;

    public Charges() {
    }

    public Charges(int opt ,String testName, long charges, long discounts, String feedback, String membership_offers) {
        
        this.opt=opt;
        this.testName = testName;
        this.charges = charges;
        this.discounts = discounts;
        this.feedback = feedback;
        this.membership_offers = membership_offers;
    }

    public int getOpt() {
        return opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public long getCharges() {
        return charges;
    }

    public void setCharges(long charges) {
        this.charges = charges;
    }

    public long getDiscounts() {
        return discounts;
    }

    public void setDiscounts(long discounts) {
        this.discounts = discounts;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getMembership_offers() {
        return membership_offers;
    }

    public void setMembership_offers(String membership_offers) {
        this.membership_offers = membership_offers;
    }

    
}
