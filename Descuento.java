package com.estructurasSelectivas.com.ejercicio8;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		///* Calcule el descuento considerando, si es más de o igual a $100 aplica el 10%, si es menor de $100 aplica el 2%*
		Scanner entrada = new Scanner(System.in);
		double monto, descuento, montoDesc;
		//
		System.out.println("Ingresa el monto: ");
		monto = entrada.nextDouble();
		if(monto>=100) {
			descuento = (monto*10)/100;
			montoDesc = monto - descuento;
		}else {
			descuento = (monto*2)/100;
			montoDesc = monto - descuento;
		}//
		System.out.println("El descuento es de: " + descuento);
		System.out.println("El monto con descuento es: " + montoDesc);
		entrada.close();
	}
	//130

}
