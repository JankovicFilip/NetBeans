/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Osoba;
import edunova.util.EdunovaException;
import edunova.util.OibValidation;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Admin
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {

    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {

    }

    private void kontrolaOib() throws EdunovaException {
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new EdunovaException("Oib nije formalno ispravan!!!");
        }

    }

     private void kontrolaEmail() throws EdunovaException {
        //implementirati email kontrolu
        try {
            InternetAddress emailAddr = new InternetAddress(entitet.getEmail());
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new EdunovaException("Email nije formalno ispravan");
        }
    }

}
