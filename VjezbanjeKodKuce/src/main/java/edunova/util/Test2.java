/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import edunova.model.Polaznik;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class Test2 {
    private static List<Polaznik> testPolaznike(Session session) {
        List<Polaznik> polaznici = new ArrayList<>();
        Polaznik p;
        p=new Polaznik();
        p.setOib(EdunovaUtil.generirajOib());
        return polaznici;
    }
    
    public static void izvedi2() {
        Session session = HibernateUtil.getSession();
        List<Polaznik> polaznici = testPolaznike(session);
    }
}
