/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 *
 * @author Admin
 */
@Entity
public class Narudzba extends Entitet{
    
    @OneToOne
    private Kupac kupac;
    
    private Date datumNarudzbe;
    
    private Date datumOtpreme;

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Date getDatumNarudzbe() {
        return datumNarudzbe;
    }

    public void setDatumNarudzbe(Date datumNarudzbe) {
        this.datumNarudzbe = datumNarudzbe;
    }

    public Date getDatumOtpreme() {
        return datumOtpreme;
    }

    public void setDatumOtpreme(Date datumOtpreme) {
        this.datumOtpreme = datumOtpreme;
    }
    
    
    
}
