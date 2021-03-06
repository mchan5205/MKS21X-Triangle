public class Point{
	private double x,y;
	public Point(double X, double Y){
		x = X;
		y = Y;
	}	
	public Point(Point p){
		x = p.x;
		y = p.y;
	}	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}	
	public double distanceTo(Point p){
		return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
	public static double distance(Point p, Point o){
		return Math.sqrt(Math.pow(p.x - o.x, 2) + Math.pow(p.y - o.y, 2));
	}	
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}	
}	
	
