package sumador;

public class GMLFunciona {

	public static void main(String[] args)
	{
		if (args.length != 1) {
            System.err.println("Es necesario un argumento en la ĺínea de comandos.");
        } else {
            ASumar suma = new ASumar(args[0]);
            System.out.println(suma.mostrar());
        }
	}

}
