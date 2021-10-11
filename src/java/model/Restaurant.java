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
public class Restaurant extends User{
   
    private String paymode;

    public Restaurant() {
    }

    public Restaurant(int accountId, String username, String location,String paymode ) {
        super(accountId, username, location);
        this.paymode=paymode;
    }

   
}
