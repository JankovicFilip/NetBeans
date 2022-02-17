/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model.vjezbanje.veze;

import edunova.model.vjezbanje.nasljedivanje.Dokument;
import javax.persistence.Entity;

/**
 *
 * @author Admin
 */
@Entity
public class Oznaka extends Dokument{
    private String vrijednost;

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }
    
}
