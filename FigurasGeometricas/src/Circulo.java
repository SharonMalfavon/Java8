
public class Circulo extends FigurasGeometricas {

	float radio;
	float p1 = 3.1416f;
	
	public float calcularArea() {
		float area = p1 + (radio+radio);
		return area;

	}

	
	Circulo(float radio){
		this.radio = radio;
	}
}
