/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import com.sun.istack.NotNull;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Admin
 */
@MappedSuperclass
public abstract class Kupac extends Entitet{
    @NotNull
    private String ime;
    @NotNull
    private String prezime;
    @NotNull
    private String email;
    @NotNull
    private String adresa;
    @NotNull
    private String brojTelefona;
    
    
    
}
