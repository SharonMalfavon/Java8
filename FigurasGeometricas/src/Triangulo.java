
public class Triangulo extends FigurasGeometricas {

	float base;
	float altura;
	
	public float calcularArea() {
		float area = (base + altura)/2;
		return area;

	}
	
	Triangulo(float base, float altura){
		this.base = base;
		this.altura = altura;
	}
	

}
