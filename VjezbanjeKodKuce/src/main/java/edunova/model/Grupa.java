/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 *
 * @author Admin
 */
@Entity
public class Grupa extends Entitet {
    private String naziv;
    
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac predavac;
    
    private Date datumPocetka;
    @ManyToOne
    @JoinColumn(name = "smjer")
    private Smjer smjer;
    
    @ManyToMany
    @JoinTable(name = "Clan",
            joinColumns = @JoinColumn(name = "grupa"),
            inverseJoinColumns = @JoinColumn(name = "polaznik"))
    private List<Polaznik> polaznici;

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
   
    
}
