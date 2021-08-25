package calculadora_resistencia;
import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float r1 = 0;
		float r2 = 0;
		float r3 = 0;
		float rt_paralelo = 0;
		
		r1 = getting_resistors(sc);
//		System.out.println(r1);
		r2 = getting_resistors(sc);
		r3 = getting_resistors(sc);
		
		
		if (r1 > 0 && r2 > 0 && r3 > 0) {
			rt_paralelo = (1/((1/r1)+(1/r2)+(1/r3)));
			System.out.printf("el valor de la resistencia total es: %.2f\n",rt_paralelo);
		}
		else {
			System.out.println("Valore(s) igual(es) a 0 por favor ingrese nuevo(s) valor(es)");
		}
		
	}
	
	public static float getting_resistors(Scanner sc) {
		float value	= 0;
		System.out.println("Ingrese valor de resistencia: ");
		value = Float.parseFloat(sc.nextLine());
		return value;
	}

}

