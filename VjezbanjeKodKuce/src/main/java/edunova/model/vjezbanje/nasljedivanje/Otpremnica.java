/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model.vjezbanje.nasljedivanje;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Admin
 */
@Entity(name = "`Select`")
public class Otpremnica extends Dokument {
    
    @Column(name = "`User`")
    private String kupac;

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }
    
}
