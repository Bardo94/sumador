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
        String numero = valor_inicial;
        if (numero.length() == 2) {
            return (numero + " = " + numero);
        }
        return numero;
	}

}
