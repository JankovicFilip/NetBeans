/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

import edunova.model.vjezbanje.osnovno.Mobitel;
import edunova.model.vjezbanje.veze.Mjesto;
import edunova.model.vjezbanje.veze.Opcina;
import edunova.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;



// OVO JE SVE U XML DATOTECI U VJEZBANJE KOD KUCE PROJEKTU


// model view controler-- mvc
// https://javabydeveloper.com/orm-object-relational-mapping/
// https://dzone.com/articles/hibernate-5-xml-configuration-example CITATI OBAVEZNO

//  potrebno je rucno kreirati bazu
//        create database edunovaJP25hib character set utf8mb4;

// dialect https://stackoverflow.com/questions/37066024/what-is-the-mariadb-dialect-class-name-for-hibernate

// OVO JE SVE U XML DATOTECI U VJEZBANJE KOD KUCE PROJEKTU


/**
 *
 * @author Admin
 */
public class Start {
   
    private Session session;
    
   public Start() {
       this.session = HibernateUtil.getSession();
       
       
       //procitajOpcine();
       
       //primjerRadaSVezama();
   }
        
      
        
        
       
            
        
        //Session s = HibernateUtil.getSession();  // dodao Session s =
        /*
        Mobitel m = new Mobitel();
        m.setCijena(new BigDecimal(5999.99));
        m.setDatumKupnje(new Date());
        m.setNaziv("Iphone");
        m.setIspravan(true);
        m.setOpis("Mobitel je dobar");
        m.setNapomena("blabla");
        
        s.beginTransaction();
        s.save(m);
        s.getTransaction().commit();
        */

   
   private void procitajOpcine() {
       List<Opcina> opcine = session.createQuery("from Opcina").list();
       
       for(Opcina o:opcine) {
           System.out.println(o.getNaziv());
           o.getMjesta().forEach(m->System.out.println(m.getNaziv()));
       }
       
   }
    private void primjerRadaSVezama() {
        session.beginTransaction();
        
        Opcina opcina = new Opcina();
        opcina.setNaziv("OBZ");
        session.save(opcina);
        
        Mjesto mjesto = new Mjesto();
        mjesto.setNaziv("Osijek");
        mjesto.setOpcina(opcina);
        session.save(mjesto);
        
        mjesto = new Mjesto();
        mjesto.setNaziv("Bilje");
        mjesto.setOpcina(opcina);
        session.save(mjesto);
        session.getTransaction().commit();
        
    }
    
    // DZ mapisati edunova model tako da bude identican verziji s baza nastave, php
        
    
            public static void main(String[] args) {
        new Start();
    }

     

    
    
    
    }