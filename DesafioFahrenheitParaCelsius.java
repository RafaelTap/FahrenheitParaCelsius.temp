package Desafios;

import java.util.Scanner;

public class DesafioFahrenheitParaCelsius {

	public static void main(String[] args) {
		
		//fórmula de conversão de fahrenheit para celsius: °C = (°F - 32) * 5/9.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit.");
		
		double f = entrada.nextDouble();
		var cons = 32.0;
		var cons1 = 5.0/9.0;
		double GrausCelsius = (f - cons) * cons1;
		
		System.out.printf("%.1f %s", GrausCelsius, "°C");
		
		entrada.close();
		
		
		
		
		
		
		
		
		
	}
}
