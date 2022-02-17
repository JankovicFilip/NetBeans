/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

/**
 *
 * @author Admin
 */
package edunova;

public class EdunovaException extends Exception{
	
	private String poruka;
	
	public EdunovaException(String poruka) {
		super(poruka);
		this.setPoruka("Prevedeno " + poruka);
	}

	public String getPoruka() {
		return poruka;
	}

	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}
	

}

