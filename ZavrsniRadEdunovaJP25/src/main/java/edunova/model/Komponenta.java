/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import com.sun.istack.NotNull;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Admin
 */
@Entity
public class Komponenta extends Entitet {
    @Column(columnDefinition = "varchar (100)", nullable = false)
    private String naziv;
    @Column(columnDefinition = "varchar (1000)", nullable = false)
    private String opis;
    @Column(nullable = false)
    private BigDecimal cijena;
    
    @ManyToMany
    @JoinTable(name = "komponenta_narudzba",
            joinColumns = @JoinColumn(name = "komponenta"),
            inverseJoinColumns = @JoinColumn(name = "narudzba"))
    private List<Narudzba> narudzbe;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
}
