/*
* File: Tavolsag.java
* Author: Székely Márton
* Group: Szoft I/N
* Date: 2021-02-22
* Github: https://github.com/Lijakudo/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Tavolsag {
	public static void main(String[] args) {
		
		System.out.println("Szekely Marton SZOFT I/N");
		System.out.println("2022-02-22");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Adja meg a magassagot: ");
		double mag = scan.nextDouble();
		System.out.print("Adja meg a szoget: ");
		double szog = scan.nextDouble();
		
		double tavolsag = mag/(szog/180*Math.PI);
		
		System.out.println("A tavolsag: " +tavolsag );
		
		}
	}
