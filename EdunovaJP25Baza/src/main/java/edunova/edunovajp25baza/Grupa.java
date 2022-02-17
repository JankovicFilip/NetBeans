/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.edunovajp25baza;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Admin
 */
//
@Entity
public class Grupa extends EntitetJP25 {
    
    private String naziv;
    
    private Date datumPocetka;
    
    @ManyToOne
    @JoinColumn(name = "smjer")
    private Smjer smjer;
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac predavac;
    
    @ManyToMany
    @JoinTable(name = "Clan",
            joinColumns = @JoinColumn(name = "grupa"),
            inverseJoinColumns = @JoinColumn(name = "polaznik"))
    private List<Polaznik> polaznici;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }
    
}
