package com.cr.ejemplo;

public class parser {

	// Método para convertir la cadena a un arreglo de caracteres.
	public char[] convertirCadenaAArreglo(String cadena) {

		// Convierte la cadena en un arreglo de caracteres.
		char[] arregloCaracteres = cadena.toCharArray();

		// Retorna el arreglo de caracteres.
		return arregloCaracteres;
	}

	// Método para validar si un caracter es una vocal mayúscula o minúscula.
	public boolean esVocal(char caracter) {

		// Variable para almacenar el resultado de la comparación.
		boolean comparador = false;

		// Compara el caracter con las vocales mayúsculas y minúsculas.
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

		// Retorna el resultado de la comparación.
		return comparador;
	}

	// Método para determinar si un caracter es una letra mayúscula.
	public boolean esMayuscula(char caracter) {

		// Usa la función Character.isUpperCase para verificar si el caracter es mayúscula.
		if(Character.isUpperCase(caracter))

			// Retorna true si el caracter es mayúscula.
			return true;

		// Retorna false si el caracter no es mayúscula.
		else
			return false;
	}

}

