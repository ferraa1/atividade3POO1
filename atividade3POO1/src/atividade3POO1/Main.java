package atividade3POO1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ab, h;
		int tipo;

		do {
			System.out.println("Informe o valor de ab: ");
			ab = sc.nextDouble();
			if (ab <= 0)
				System.out.println("Valor inválido!");
		} while (ab <= 0);
		do {
			System.out.println("Informe o valor de h: ");
			h = sc.nextDouble();
			if (h <= 0)
				System.out.println("Valor inválido!");
		} while (h <= 0);
		do {
			System.out.println("Informe o tipo de tinta (Tipo 1 = R$ 127,90; Tipo 2 = R$ 258,98; Tipo 3 = R$ 344,34): ");
			tipo = sc.nextInt();
			if (tipo != 1 && tipo != 2 && tipo != 3)
				System.out.println("Valor inválido!");
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		Piramide piramide = new Piramide(ab, h, tipo);

		System.out.print("ab: " + piramide.getAb() + "\n");
		System.out.print("h: " + piramide.getH() + "\n");
		System.out.print("a1: " + piramide.calcularA1() + "\n");
		System.out.print("Área Triângulo: " + piramide.calcularAreaTriangulo(piramide.calcularA1()) + "\n");
		System.out.print("Área Base: " + piramide.calcularAreaBase() + "\n");
		System.out.print("Área Total: " + piramide.calcularAreaTotal(piramide.calcularAreaTriangulo(piramide.calcularA1()),piramide.calcularAreaBase()) + "\n");
		System.out.print("Tipo de Tinta: " + piramide.getTipo() + "\n");
		System.out.print("Litros: " + piramide.calcularLitros(piramide.calcularAreaTotal(piramide.calcularAreaTriangulo(piramide.calcularA1()),piramide.calcularAreaBase())) + "\n");
		System.out.print("Latas: " + piramide.calcularLatas(piramide.calcularLitros(piramide.calcularAreaTotal(piramide.calcularAreaTriangulo(piramide.calcularA1()),piramide.calcularAreaBase()))) + "\n");
		System.out.print("Preço: " + piramide.calcularPreco(piramide.calcularLatas(piramide.calcularLitros(piramide.calcularAreaTotal(piramide.calcularAreaTriangulo(piramide.calcularA1()),piramide.calcularAreaBase())))) + "\n");
		System.out.print("Volume: " + piramide.calcularVolume(piramide.calcularAreaBase()) + "\n");
		
		sc.close();
		
	}

}
