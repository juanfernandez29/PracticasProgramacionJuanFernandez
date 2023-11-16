import java.util.Scanner;
public class ordenaTresNumerosAscendenteDescendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, mayor, intermedio, menor;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tres números y te lo ordenamos en orden ascendente");
		System.out.print("Introduce el primer número, por favor: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo número, por favor: ");
		b = sc.nextInt();
		System.out.print("Introduce el tercer número, por favor: ");
		c = sc.nextInt();
		
		if (a>b && a>c) {
			mayor = a;
		}
		else if (b>a && b>c) {
			mayor = b;
		}
		else {
			mayor = c;
		}
		
		
		if (a<b && a<c) {
			menor = a;
		}
		else if (b<a && b<c) {
			menor = b;
		}
		else {
			menor = c;
		}
		
		
		intermedio = (a+b+c) - (mayor+menor);
		
		System.out.println ("");
		System.out.println ("El orden ascedente de los números ingresados es: ");
		System.out.println (menor + " " + intermedio + " " + mayor);
		

		
	}

}
