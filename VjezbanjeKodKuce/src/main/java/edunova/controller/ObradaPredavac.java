/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.util.EdunovaException;
import java.util.List;
import nl.garvelink.iban.IBAN;

/**
 *
 * @author Admin
 */
public class ObradaPredavac extends ObradaOsoba<Predavac>{
    @Override
    public List<Predavac> read() {
        return session.createQuery("from Predavac").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaIban();
    }

    private void kontrolaIban() throws EdunovaException {
        if(entitet.getIban()== null) {
            throw new EdunovaException("Obavezan unos");
            
        }
        
        IBAN iban = IBAN.valueOf(entitet.getIban());
        if(!iban.isSEPA()) {
            throw new EdunovaException("Iban nije dobar");
        }
        
        
        /*if(entitet.getIban()==null || !entitet.getIban().contains("HR") || entitet.getIban().length()!=21) {
            throw new EdunovaException("Molim vas unesite Hrvatski IBAN!!!");
        }*/
    }
    
    
    
    
}
