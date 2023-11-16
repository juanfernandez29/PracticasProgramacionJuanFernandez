import java.util.Scanner;
public class NumeroPorTecladoHastaQueSeaPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un número positivo");
	numero = sc.nextInt();
	
	while (numero<=0) {
		System.out.println("El número introducido no es un número positivo");
		System.out.println("Introduce un número positivo");
		numero = sc.nextInt();
	}
	
	System.out.println("Los 20 primeros números sucesivos al" + numero + "son: ");
	
	for (int i = 1; i<=20; i++) {
		System.out.println(numero +i);
	}
	sc.close();
	
	}

}
