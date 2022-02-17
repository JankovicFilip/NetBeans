/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model.vjezbanje.veze;

import edunova.model.vjezbanje.nasljedivanje.Dokument;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Admin
 */
@Entity
public class Opcina extends Dokument {
    
    private String naziv;

    public List<Mjesto> getMjesta() {
        return mjesta;
    }

    public void setMjesta(List<Mjesto> mjesta) {
        this.mjesta = mjesta;
    }
    @OneToMany(mappedBy = "opcina")
    public List<Mjesto> mjesta;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
}
