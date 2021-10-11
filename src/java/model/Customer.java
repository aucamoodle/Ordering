/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author millyg
 */
public class Customer extends User{
    private String paymode;

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }


    public Customer(String paymode, int accountId, String username, String location) {
        super(accountId, username, location);
        this.paymode = paymode;
    }

  
    
}
