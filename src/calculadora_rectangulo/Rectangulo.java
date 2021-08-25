package calculadora_rectangulo;
import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float largo = 0;
		float ancho = 0;
		float x = 0;
		float perimetroExt = 0;
		float areaExt = 0;
		float perimetroNew = 0;
		float areaNew = 0;
		
		System.out.println("Ingrese valor largo del rectangulo = ");
		largo = Float.parseFloat(sc.next());
		System.out.println("Ingrese valor ancho del rectangulo = ");
		ancho = Float.parseFloat(sc.next());
		System.out.println("Ingrese valor para el sub-rectangulo o ingrese 0 = ");
		x = Float.parseFloat(sc.next());
		
		if(x == 0.0 ) {
			areaExt = area(largo, ancho) ;
			System.out.printf("El area del 1re rectangulo es: %.2f\n",areaExt);
			perimetroExt = perimetro(largo, ancho);
			System.out.printf("El perimetro del 1re rectangulo es: %.2f\n",areaExt);
		}
		else if(largo > 2*x && ancho > 2*x) {
			areaExt = area(largo, ancho) ;
			System.out.printf("El area del 1re rectangulo es: %.2f\n",areaExt);
			perimetroExt = perimetro(largo, ancho);
			System.out.printf("El perimetro del 1re rectangulo es: %.2f\n",perimetroExt);
			System.out.println("-----------------------------------------------------");
			
			largo = largo - (x*2);
			ancho = ancho - (x*2);
			
			areaNew = area(largo, ancho);
			System.out.printf("La nueva area del rectangulo interno es: %.2f\n",areaNew);
			perimetroNew = perimetro(largo, ancho);
			System.out.printf("El nuevo perimetro del rectangulo interno es: %.2f\n",perimetroNew);
		}
		else {
			System.out.println("Error al ingresar datos: valor de rectangulo interno mayor al externo");
		}

	}
	
	public static float area(float largo, float ancho) {
		float area = largo*ancho;
		return area;	
	}
	
	public static float perimetro(float largo,float ancho) {
		float perimetro = (largo*2) + (ancho*2);
		return perimetro;
	}

}
