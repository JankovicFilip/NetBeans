/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class OibGenerator {
    
    public static Long generirajOib() {
        Random randomOib = new Random();
        char[] brojevi = new char[11];
        brojevi[0] = (char)(randomOib.nextLong(9) + '1');
        for(int i = 0;i<brojevi.length;i++) {
            brojevi[i] = (char)(randomOib.nextLong(10) + '0');
        }
        return Long.parseLong(new String(brojevi));
    }
    
}
