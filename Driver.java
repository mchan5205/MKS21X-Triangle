public class Driver{
	public static void main(String[] args){
		Point p = new Point(5.0, 6.0);
		Point o = new Point(5.0, 8.0);
		System.out.println(p.getX());
		System.out.println(p.distanceTo(o));
		System.out.println(Point.distance(o, p));
		System.out.println(p);
		Point a = new Point(0.0, 5.0);
		Point b = new Point(5.0, 5.0);
		Point c = new Point(0.0, 0.0);
		Triangle d = new Triangle(a, b, c);
		System.out.println(d.getPerimeter());
		Point e = new Point(0.0, 4.0);
		d.setVertex(0, e);
		System.out.println(d.getPerimeter());
		System.out.println(d.getVertex(0));
	}	
}