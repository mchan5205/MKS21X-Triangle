public class Triangle{
	private Point v1,v2,v3;
	public Triangle(Point a, Point b, Point c){
		v1 = a;
		v2 = b;
		v3 = c;
	}	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	public double getPerimeter(){
		return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
	}	
	public Point getVertex(int a){
		if (a == 0){
			return v1;
		}
		if (a == 1){
			return v2;
		}	
		if (a == 2){
			return v3;
		}
		else{
			return v3;
		}	
	}	
	public void setVertex(int a, Point p){
		if (a == 0){
			v1 = p;
		}
		if (a == 1){
			v2 = p;
		}
		if (a == 2){
			v3 = p;
		}			
	}	
	public String toString(){
		return "Triangle: " + "A" + v1 + " B" + v2 + " C" + v3;
	}	
}	