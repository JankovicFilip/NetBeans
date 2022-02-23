/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaSmjer extends Obrada<Smjer> {

    @Override
    public List<Smjer> read() {
        return session.createQuery("from smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaTrajanje();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
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

}
