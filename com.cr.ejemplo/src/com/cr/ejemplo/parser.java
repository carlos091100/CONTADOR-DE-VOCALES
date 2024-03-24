package com.cr.ejemplo;

public class parser {

	// M�todo para convertir la cadena a un arreglo de caracteres.
	public char[] convertirCadenaAArreglo(String cadena) {

		// Convierte la cadena en un arreglo de caracteres.
		char[] arregloCaracteres = cadena.toCharArray();

		// Retorna el arreglo de caracteres.
		return arregloCaracteres;
	}

	// M�todo para validar si un caracter es una vocal may�scula o min�scula.
	public boolean esVocal(char caracter) {

		// Variable para almacenar el resultado de la comparaci�n.
		boolean comparador = false;

		// Compara el caracter con las vocales may�sculas y min�sculas.
		switch (caracter) {
		case 'a':
			comparador = true;
			break;
		case 'e':
			comparador = true;
			break;
		case 'i':
			comparador = true;
			break;
		case 'o':
			comparador = true;
			break;
		case 'u':
			comparador = true;
			break;
		case 'A':
			comparador = true;
			break;
		case 'E':
			comparador = true;
			break;
		case 'I':
			comparador = true;
			break;
		case 'O':
			comparador = true;
			break;
		case 'U':
			comparador = true;
			break;

		default:
			comparador = false;
			break;
		}

		// Retorna el resultado de la comparaci�n.
		return comparador;
	}

	// M�todo para determinar si un caracter es una letra may�scula.
	public boolean esMayuscula(char caracter) {

		// Usa la funci�n Character.isUpperCase para verificar si el caracter es may�scula.
		if(Character.isUpperCase(caracter))

			// Retorna true si el caracter es may�scula.
			return true;

		// Retorna false si el caracter no es may�scula.
		else
			return false;
	}

}

