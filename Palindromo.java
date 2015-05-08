/**
 * Created by dearmartinez on 5/8/15.
 */
public class Palindromo {
    public static void main(String[] args) {

        String palindromo = "Anita La Gorda Lagartona Latina";
         
        StringBuilder sb = new StringBuilder(palindromo);
        
        sb.reverse();  // revierte la cadena de texto
        
        System.out.println(palindromo);
        System.out.println(sb);

        String aux = "";
        int contador = 0;

        for(int i = palindromo.length() - 1; i >= 0; i--) {
        	aux += palindromo.charAt(i);
        }

        for(int j = 0; j <= aux.length() - 1; j++) {
        	if(aux.charAt(j) == palindromo.charAt(j)) {
        		
        	}
        	contador++;
        }

        if(contador == palindromo.length()) {
        	System.out.println("Es un palíndromo");
        } else {
        	System.out.println("No es un palíndromo");
        }

    }
}