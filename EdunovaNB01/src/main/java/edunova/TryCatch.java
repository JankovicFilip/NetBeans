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


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class TryCatch {
	
	private Date datum;
	
	
	public TryCatch() {
		//primjer1();
		//primjer2();
		//primjer3();
		//primjer4();
		primjer5();
		//System.out.println(primjer6());
		//try {
			//primjer7();
		//} catch (EdunovaException e) {
			//System.out.println(e.getPoruka());
			//e.printStackTrace();
		//}
	}
	
	private void primjer7() throws EdunovaException {
		
		throw new EdunovaException("Krivi podaci");
		
	}

	private int primjer6() {
		// beskonacni while
		Scanner ulaz = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Unesi cijeli broj: ");
				var i = Integer.parseInt(ulaz.nextLine());
				if(i<0) {
					System.out.println("Dozvoljeni samo pozitivni brojevi");
					continue;
				}
				ulaz.close();
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli cijeli broj");
			}
		}
		
		
		
	}

	private void primjer1() {
		//Date d; // null pointer exception, pozivas metodu na varijabli koja nije instancirana
		//System.out.println(d.getTime());
		
		// iznimka tijekom izvodenja programa
		System.out.println(datum.getTime());
		
	}
	
	private void primjer2() {
		try {
			System.out.println(datum.getTime());
		} catch (NullPointerException e) {
			System.out.println("Datum je null");
		}
		
	}
	private void primjer3() {
		int[] niz = new int[2];
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi cijeli broj");
		try {niz[0] = Integer.parseInt(ulaz.nextLine());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greska indeksa niza");
		} catch (NumberFormatException e) {
			System.out.println("Nisi unio broj");
		} catch (Exception e) {
			System.out.println("Greska" + e.getMessage());
		}
		ulaz.close();
		
	}
	private void primjer4() {
		int i = 0;
		try {
			i= Integer.parseInt("s");
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Greska " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Greska " + e.getMessage());
		}
		
	}
	private void primjer5() {
		// SPAJANJE NA BAZU
		//
		//
		//
		Connection veza=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			veza = DriverManager.getConnection(
					"jdbc:mariadb://127.0.0.1/edunovajp25", 
					"edunova",
					"edunova");
			
			PreparedStatement izraz = veza.prepareStatement("select * from smjer");
			
			ResultSet rs = izraz.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("naziv") + " " + rs.getBigDecimal("cijena"));
			}
			rs.close();
			izraz.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(veza!=null) {
				try {
					veza.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new TryCatch();
		
	}

}
