package sumador;

public class ASumar {

	/**
	 * Variable que guarda el texto con los números que se van a sumar.
	 */
	private String valor_inicial;

	/**
	 * Método contructor de la clase.
	 * @param string : Número, o números que se van a sumar.
	 */
	public ASumar(String string) {
        this.valor_inicial = string;
    }

	/**
	 * Función que devuelve como String el número de la suma de los números que forman el valor_inicial.
	 * @return Número obtenido como resultado de la suma de los números que forman el valor_inicial.
	 */
	public String mostrar() {
        String numero = valor_inicial;
        
        if (numero.length() == 1 || (numero.length() == 2 && numero.substring(0,1).equals("-")))
        {
            return (numero + " = " + numero);
        }
        else if( numero.length() > 1 )
        {
        	String suma = "";
        	for (int i = 0; i < numero.length(); i++)
        	{
        		String digito = numero.substring(i, i+1);
        		
        		if(i == 0) { suma = suma + digito; }
        		else { suma = suma + " + " + digito; }
            }
        	
        	return (suma + " = " + total(numero));
        }
        
        return numero;
	}
	
	public int total(String numero) {
        int suma = 0;
        
        for (int i = 0; i < numero.length(); i++)
        {
            String digito = numero.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);
        }
        
        return suma;
    }
}