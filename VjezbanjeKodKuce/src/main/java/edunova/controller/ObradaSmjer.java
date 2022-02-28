/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaSmjer extends Obrada<Smjer> {

    @Override
    public List<Smjer> read() {
        return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaTrajanje();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaTrajanje();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaNaziv() throws EdunovaException {
        if (entitet.getNaziv() == null || entitet.getNaziv().trim().isEmpty()) {
            throw new EdunovaException("Naziv smjera obavezno!!!");
        }

        if (entitet.getNaziv().trim().length() > 50) {
            throw new EdunovaException("Naziv smjera ne smije imati vise od 50 znakova!!!");
        }

    }

    private void kontrolaTrajanje() throws EdunovaException {
        if (entitet.getTrajanje()==null || entitet.getTrajanje() < 0) {
            throw new EdunovaException("Trajanje mora biti postavljeno i ne smije biti manje od 0!!!");
        }
    }

    private void kontrolaCijena() throws EdunovaException{
        if(entitet.getCijena() == null || entitet.getCijena().compareTo(BigDecimal.ZERO)<0
                || entitet.getCijena().compareTo(new BigDecimal(10000))>0) {
            throw new EdunovaException ("Cijena mora biti veca od 0 i manja od 10000!!!");
        }
    }

}
