
public class muestraycuentamultiplosde2o3entre1y100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorMultiplosDeDos = 0;
		int contadorMultiplosDeTres = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
			System.out.println (i + " es multiplo de 2.");
			contadorMultiplosDeDos++;
			}
			if (i % 3 == 0) {
			System.out.println (i + " es multiplo de 3.");
			contadorMultiplosDeTres++;
			
			}
		
		}
		
		System.out.print("El total de multiplos de 2 son: " + contadorMultiplosDeDos);
		System.out.print("El total de multiplos de 3 son: " + contadorMultiplosDeTres);
	}

}
