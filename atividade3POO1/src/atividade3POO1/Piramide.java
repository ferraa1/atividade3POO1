package atividade3POO1;

public class Piramide {

	private double ab, h;
	private int tipo;

	public Piramide(double ab, double h, int tipo) {
		super();
		this.ab = ab;
		this.h = h;
		this.tipo = tipo;
	}

	public double getAb() {
		return ab;
	}

	public double getH() {
		return h;
	}

	public int getTipo() {
		return tipo;
	}

	public double calcularA1() {
		return Math.sqrt((ab * ab) + (h * h));
	}

	public double calcularAreaTriangulo(double a1) {
		return ((ab * 2) * a1) / 2;
	}

	public double calcularAreaBase() {
		return (ab * 2) * (ab * 2);
	}

	public double calcularAreaTotal(double areaTriangulo, double areaBase) {
		return (areaTriangulo * 4) + areaBase;
	}

	public double calcularLitros(double areaTotal) {
		return (areaTotal / 4.76);
	}

	public double calcularPreco(int latas) {
		double preco;
		switch (tipo) {
		case 1: {
			preco = latas * 127.9;
			break;
		}
		case 2: {
			preco = latas * 258.98;
			break;
		}
		case 3: {
			preco = latas * 344.34;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		return preco;
	}

	public double calcularVolume(double areaBase) {
		return (areaBase * h) / 3;
	}
	
	public int calcularLatas(double litros) {
		return (int) ((litros + 17) / 18);
	}

}
