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
        if (numero.length() == 2) {
            return (numero + " = " + numero);
        }
        return numero;
	}

}
