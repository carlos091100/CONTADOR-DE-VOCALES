package com.cr.test;

import java.util.Scanner;


import com.cr.ejemplo.parser;

public class Main {
	
	public static void main(String[] args) {

		// Muestra un mensaje al usuario para que ingrese una cadena de texto.
		System.out.println("Ingrese una cadena de texto: ");

		// Declaración de la variable cadena para almacenar la entrada del usuario.
		String cadena = "";

		// Crea un objeto Scanner para leer la entrada del usuario.
		Scanner teclado= new Scanner(System.in);

		// Lee la cadena de texto y la guarda en la variable cadena.
		cadena = teclado.nextLine();

		// Crea una instancia de la clase parser.
		parser parser = new parser();

		// Convierte la cadena en un arreglo de caracteres.
		char[] arregloParseado = parser.convertirCadenaAArreglo(cadena);

		// Declaración de variables para contar las vocales mayúsculas y minúsculas.
		int contarMayuscula = 0;
		int contarMinuscula = 0;

		// Recorre el arreglo de caracteres.
		for (int i=0; i < arregloParseado.length; i++) {

			// Verifica si el caracter es una vocal.
			if(parser.esVocal(arregloParseado[i])) {

				// Verifica si la vocal es mayúscula.
				if(parser.esMayuscula(arregloParseado[i])) {

					// Incrementa el contador de vocales mayúsculas.
					contarMayuscula++;

				} else {

					// Incrementa el contador de vocales minúsculas.
					contarMinuscula++;

				}
			}
		}

		// Imprime la cantidad de vocales mayúsculas y minúsculas.
		System.out.println("Cantidad de mayusculas: " + contarMayuscula);
		System.out.println("Cantidad de minusculas: " + contarMinuscula);

	}

}
