/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author millyg
 */
@Entity
public class Order {
    @Id
    private int id;
    private User user;
    private float price;

    public Order() {
    }
    
    

    public Order(int id, User user, float price) {
        this.id = id;
        this.user = user;
        this.price = price;
    }
    
    
}
