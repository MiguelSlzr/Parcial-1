package Parcial1;

public class Examen {

	public String primeraMayuscula(String cadena) {
		
		char firstChar = cadena.charAt(0);
		
		String firstLetter = String.valueOf(firstChar);
		String upperLetter = firstLetter.toUpperCase();
		String subString = cadena.substring(1,cadena.length());
		String newString = subString.toLowerCase();
		
		return (upperLetter + newString);
	}
	
	public String invertirCadena(String cadena) {
		
		String cadenaInvertida = "";
		
		for(int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		
		return (cadenaInvertida);
	}
	
	public String vocalesMayuscula(String cadena) {

		String vocalesMayusculas = "";
		String[] arreglo = {"a","e","i","o","u",};
		int bandera = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			String letras = String.valueOf(letra);
			
			for(int j = 0; j < 5; j++) {
				if(letras.contains(arreglo[j])) {
					
					char vowel = cadena.charAt(i);
					String stringVowel = String.valueOf(vowel);
					String upperVowel = stringVowel.toUpperCase();
					vocalesMayusculas = vocalesMayusculas + upperVowel;
					bandera = 0;
					break;
				} 
				else {
					bandera = 1;
				}
			}
				if(bandera == 1) {
					vocalesMayusculas = vocalesMayusculas + letras;
	
			} 
		}
		return (vocalesMayusculas);
	}
	
	 public int fizzBuzz() {
		String resultado = "";
		int numFinal;
		int i;
		for(i = 1; i <= 99; i++) {
			if(i%3==0) {
				resultado = "fizz";
				
				if (i%5==0){
					resultado = resultado + "buzz";
					System.out.println(resultado);
					continue;
				}
				System.out.println(resultado);
				
			} else if (i%5==0){
				resultado = "buzz";
				System.out.println(resultado);
				
			} else {
				
				System.out.println(i);
			}
			
		}
		numFinal = i ;
		return(numFinal);
	}
	 
	 public boolean palindromo(String cadena) {
		 	cadena = cadena.toLowerCase();
		 	String palabra = "";
			boolean respuesta;
			
				if(cadena.contains(" ")) {
					int i = 0;	
					String[] splitString = cadena.split(" ");
					
					for(int j = 0; j <= splitString.length - 1; j++){
						palabra = palabra + splitString[i];
						i++;
					}

					
					String palabraInvertida = invertirCadena(palabra);
					
					if(palabra.equals(palabraInvertida)) {
						respuesta = true;
					}
					else {
						respuesta = false;
					}
				}
				
				else{
					String cadenaInvertida = invertirCadena(cadena);
					if(cadena.equals(cadenaInvertida)) {
						respuesta = true;
					}
					else {
						respuesta = false;
					}
					//System.out.println(cadena.equals(cadenaInvertida));
				}
				
			return(respuesta);
	 }
}