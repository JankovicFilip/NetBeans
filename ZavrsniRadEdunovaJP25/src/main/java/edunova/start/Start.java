/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.start;

import edunova.hibernate.util.Util;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class Start {
    private Session session;
    
    public Start() {
        this.session = Util.getSession();
    }
    
    
    public static void main(String[] args) {
        new Start();
    }
    
}
