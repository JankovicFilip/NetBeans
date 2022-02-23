/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
// ovo je nadklsasa
public abstract class Obrada<T> {

    protected Session session; // protected koristim kada zelim u podklasama
    protected T entitet;

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws EdunovaException;
    protected abstract void kontrolaUpdate() throws EdunovaException;
    protected abstract void kontrolaDelete() throws EdunovaException;
    

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public T create() throws EdunovaException {
        kontrolaCreate();
        save();
        return entitet;
    }

    public T update() throws EdunovaException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public void delete() throws EdunovaException {
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

}
