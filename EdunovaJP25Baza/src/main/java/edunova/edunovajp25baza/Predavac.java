/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.edunovajp25baza;

import javax.persistence.Entity;

/**
 *
 * @author Admin
 */
//
@Entity
public class Predavac extends Osoba{
    
    private String iban;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
}
