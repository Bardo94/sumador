package sumador;

public class ASumar {

	/**
	 * Variable que guarda el texto con los n�meros que se van a sumar.
	 */
	private String valor_inicial;

	/**
	 * M�todo contructor de la clase.
	 * @param string : N�mero, o n�meros que se van a sumar.
	 */
	public ASumar(String string) {
        this.valor_inicial = string;
    }

	/**
	 * Funci�n que devuelve como String el n�mero de la suma de los n�meros que forman el valor_inicial.
	 * @return N�mero obtenido como resultado de la suma de los n�meros que forman el valor_inicial.
	 */
	public String mostrar() {
		String s = "";
		
		System.out.println("Valor inicial: "+valor_inicial);
		System.out.println("Longitud: "+valor_inicial.length());
		System.out.println("Valor 1: "+valor_inicial.substring(0, 1));
		System.out.println("Valor 2: "+valor_inicial.substring(1, 2));
		System.out.println("Valor 3: "+valor_inicial.substring(2, 3));
		System.out.println("------------------------------");
		
        for (int i = 0; i < valor_inicial.length(); i++) {
        	System.out.println("Vuelta del bucle n�: "+i);
        	System.out.println("------------------------------");
        }
		
		return s;
	}
	
	public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un d�gito.
            String digito = valor_inicial.substring(i, 1);
            suma = suma + Integer.getInteger(digito);
        }
        System.out.println(suma);
        return suma;
        
    }
}
