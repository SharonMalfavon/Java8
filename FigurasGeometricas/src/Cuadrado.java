
public class Cuadrado extends FigurasGeometricas{

	float base;
	float altura;
	
	public float calcularArea() {
		float area = (base + altura);
		return area;

	}
	
	Cuadrado(float base, float altura){
		this.base = base;
		this.altura = altura;
	}

}
