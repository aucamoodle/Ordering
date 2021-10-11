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
public class Food {
    @Id
    private int id;
    private String name;
    private float price;
    
    
}
