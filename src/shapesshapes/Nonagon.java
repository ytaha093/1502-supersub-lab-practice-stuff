package shapesshapes;

public class Nonagon extends Shape {
	
	private double sideLength;
	
	public Nonagon(double sLenght) {
		this.sideLength = sLenght;
	}
	
	@Override
	public double getArea() {
		
		return ((9.0 / 4.0)*(sideLength * sideLength)) * (1.0/(Math.tan(Math.PI/9.0)));
	}
	
	@Override
	public double getParameter() {
		
		return sideLength * 9;
	}


}
